package org.example.bot;

import lombok.SneakyThrows;
import org.example.bot.settings.ConfigSettings;
import org.example.bot.settings.Sender;
import org.example.handler.hermitageHandler.HermitageSelectionHandler;
import org.example.handler.hermitageHandler.HermitageTypes;
import org.example.handler.rusMusHandler.RusMusSelectionHandler;
import org.example.handler.rusMusHandler.RusMusTypes;
import org.example.bot.settings.enums.TretGalArtists;
import org.example.handler.tretGalHandler.TretGalSelectionHandler;
import org.example.handler.tretGalHandler.TretGalAlphabetTypes;
import org.example.handler.commandHandler.CommandSelectionHandler;
import org.example.handler.commandHandler.CommandTypes;
import org.example.handler.museumHandler.MuseumSelectionHandler;
import org.example.handler.museumHandler.MuseumTypes;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.commands.SetMyCommands;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.commands.scope.BotCommandScopeDefault;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.Arrays;

import static org.example.bot.settings.BotCommands.LIST_OF_COMMAND;
import static org.example.bot.settings.MessagesConst.*;

public class Bot extends TelegramLongPollingBot {

    MuseumSelectionHandler museumHandler = new MuseumSelectionHandler();
    RusMusSelectionHandler rusMusHandler = new RusMusSelectionHandler();
    TretGalSelectionHandler tretGalHandler = new TretGalSelectionHandler();
    HermitageSelectionHandler hgHandler = new HermitageSelectionHandler();
    MuseumTypes musTypes = new MuseumTypes();
    TretGalAlphabetTypes tretGalAlphabetTypes = new TretGalAlphabetTypes();
    HermitageTypes hgTypes = new HermitageTypes();
    RusMusTypes rusMusTypes = new RusMusTypes();
    CommandTypes commandType = new CommandTypes();
    CommandSelectionHandler commandHandler = new CommandSelectionHandler();
    private final static ConfigSettings settings = ConfigSettings.getInstance();
    String message_text;
    Long chat_id;


    public void init() throws TelegramApiException {
        this.execute(new SetMyCommands(LIST_OF_COMMAND, new BotCommandScopeDefault(), null));
    }

    @Override
    public String getBotUsername() {
        return settings.getUserName();
    }

    @Override
    public String getBotToken() {
        return settings.getToken();
    }

    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {


        if (update.hasMessage() && update.getMessage().hasText()) {

            message_text = update.getMessage().getText();
            chat_id = update.getMessage().getChatId();


            //Done
            if (commandType.types().contains(message_text)) {
                commandHandler.onUpdateReceived(update);

            //Done
            } else if (musTypes.types().contains(message_text)) {
                museumHandler.onUpdateReceived(update);

            //Done
            } else if (tretGalAlphabetTypes.types().contains(message_text)) {
                tretGalHandler.onUpdateReceived(update);


            } else if (rusMusTypes.types().contains(message_text)) {
                rusMusHandler.onUpdateReceived(update);

            } else if (hgTypes.types().contains(message_text)) {
                hgHandler.onUpdateReceived(update);


            } else {
                execute(Sender.sendMessage(chat_id, UNKNOWN));
            }


        } else if (update.hasCallbackQuery()) {
            String call_data = update.getCallbackQuery().getData();

            if (Arrays.toString(TretGalArtists.values()).contains(call_data)) {
                tretGalHandler.onUpdateReceived(update);
            }


        }
    }
}


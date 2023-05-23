package org.example.handler.rusMusHandler;

import lombok.SneakyThrows;
import org.example.bot.settings.ConfigSettings;
import org.example.handler.PhotoHandler;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import static org.example.handler.rusMusHandler.RusMusPathsConst.*;

public class RusMusSelectionHandler extends TelegramLongPollingBot {

    long chat_id;

    private final static ConfigSettings settings = ConfigSettings.getInstance();

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
        update.getUpdateId();
        chat_id = update.getMessage().getChatId();
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(update.getMessage().getChatId().toString());

        if (update.hasMessage() && update.getMessage().hasText()) {

            switch (update.getMessage().getText()) {
//                case "36":
//                    execute(PhotoHandler.sendPhoto(chat_id, THIRTY_SIX));
//                    break;
//
//                case "37":
//                    execute(PhotoHandler.sendPhoto(chat_id, THIRTY_SEVEN));
//                    break;

            }
        }
    }

}
package org.example.handler.museumHandler;

import lombok.SneakyThrows;
import org.example.bot.settings.ConfigSettings;
import org.example.handler.rusMusHandler.RusMusAlphabetKeyboard;
import org.example.handler.tretGalHandler.TretGalAlphabetKeyboard;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import static org.example.bot.settings.MessagesConst.*;
import static org.example.bot.settings.enums.Museum.*;

public class MuseumSelectionHandler extends TelegramLongPollingBot {

    long chat_id;
    String message_text;

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
        message_text = update.getMessage().getText();

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(update.getMessage().getChatId().toString());

        if (update.hasMessage() && update.getMessage().hasText()) {

            if (message_text.equals(HERMITAGE.getMuseumType())) {
//                sendMessage.setText(ABC);
//                sendMessage.setReplyMarkup(AlphabetKeyboard.createAlphabetKeyboard());
//                execute(sendMessage);

            } else if (message_text.equals(RUS_MUS.getMuseumType())) {
                sendMessage.setText(ABC);
                sendMessage.setReplyMarkup(RusMusAlphabetKeyboard.createRusMusAlphabetKeyboard());
                execute(sendMessage);


            } else if (message_text.equals(TRET_GAL.getMuseumType())) {
                sendMessage.setText(ABC);
                sendMessage.setReplyMarkup(TretGalAlphabetKeyboard.createTretGalAlphabetKeyboard());
                execute(sendMessage);

            }


        }
    }

}

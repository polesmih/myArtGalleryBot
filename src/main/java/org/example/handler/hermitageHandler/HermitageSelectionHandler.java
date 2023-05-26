package org.example.handler.hermitageHandler;

import lombok.SneakyThrows;
import org.example.bot.settings.ConfigSettings;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

public class HermitageSelectionHandler extends TelegramLongPollingBot {


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
//                case "12":
//                    execute(PhotoHandler.sendPhoto(chat_id, TWELVE));
//                    break;
//
//                case "13":
//                    execute(PhotoHandler.sendPhoto(chat_id, THIRTEEN));
//                    break;

            }
        }
    }
}

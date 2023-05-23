package org.example.handler.typesOfMuseumHandler;

import lombok.SneakyThrows;
import org.example.bot.settings.ConfigSettings;
import org.example.handler.serviceCommandHandler.replyKeyboards.AlphabetKeyboard;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import static org.example.bot.settings.MessagesConst.ABC;
import static org.example.handler.typesOfMuseumHandler.MuseumTypesConst.*;

public class MuseumSelectionHandler extends TelegramLongPollingBot {

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

            sendMessage.setText(ABC);
            sendMessage.setReplyMarkup(AlphabetKeyboard.createAlphabetKeyboard());
            execute(sendMessage);

//            switch (update.getMessage().getText()) {
//
//                case HERMITAGE:
////                    execute(MessageHandler.sendMessage(chat_id, HG_MENU));
//                    sendMessage.setText(ABC);
//                    sendMessage.setReplyMarkup(AlphabetKeyboard.createAlphabetKeyboard());
//                    execute(sendMessage);
//                    break;
//
//                case RUS_MUS:
////                    execute(MessageHandler.sendMessage(chat_id, TG_MENU));
//                    sendMessage.setText(ABC);
//                    sendMessage.setReplyMarkup(RusMusKeyboard.createRusMusKeyboard());
//                    execute(sendMessage);
//                    break;
//
//                case TRET_GAL:
////                    execute(MessageHandler.sendMessage(chat_id, RM_MENU));
//                    sendMessage.setText(ABC);
//                    sendMessage.setReplyMarkup(AlphabetKeyboard.createTretGalKeyboard());
//                    execute(sendMessage);
//                    break;
//
//            }
        }
    }

}

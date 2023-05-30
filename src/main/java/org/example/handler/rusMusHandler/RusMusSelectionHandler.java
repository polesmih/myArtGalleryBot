package org.example.handler.rusMusHandler;

import lombok.SneakyThrows;
import org.example.bot.settings.ConfigSettings;
import org.example.bot.settings.Sender;
import org.example.handler.rusMusHandler.inlineKeyboards.*;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

import static org.example.bot.settings.enums.RusMusArtists.*;

public class RusMusSelectionHandler extends TelegramLongPollingBot {

    String message_text;
    private final static ConfigSettings settings = ConfigSettings.getInstance();
    public final static String ROOT = settings.getPath() + "\\rusMus\\";


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
            long chat_id = update.getMessage().getChatId();

            if (message_text.equals("А - В")) {
                execute(RusMusInlineKeyboardAv.rusMusInlineKeyboardAv(chat_id));
            } else if (message_text.equals("Г - И")) {
                execute(RusMusInlineKeyboardGi.rusMusInlineKeyboardGi(chat_id));
            } else if (message_text.equals("К - Л")) {
                execute(RusMusInlineKeyboardKl.rusMusInlineKeyboardKl(chat_id));
            } else if (message_text.equals("М - П")) {
                execute(RusMusInlineKeyboardMp.rusMusInlineKeyboardMp(chat_id));
            } else if (message_text.equals("Р - Т")) {
                execute(RusMusInlineKeyboardRt.rusMusInlineKeyboardRt(chat_id));
            } else if (message_text.equals("У - Я")) {
                execute(RusMusInlineKeyboardUy.rusMusInlineKeyboardUy(chat_id));
            }

        } else if (update.hasCallbackQuery()) {
            String call_data = update.getCallbackQuery().getData();
            long chat_id = update.getCallbackQuery().getMessage().getChatId();

            if (call_data.equals(R_ABUTKOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Абутков Н.Г. Зима. Петербургский вид 1859.jpg", "Абутков, Зима. Петербургский вид 1859"));

//            } else if (call_data.equals(ANDREENKOV.toString())) {
//                execute(Sender.sendPhoto(chat_id, ROOT + "Андреенков Владимир Портрет А. Шервинской.png", "Андреенков, Портрет А. Шервинской"));

            }


        }
    }

}

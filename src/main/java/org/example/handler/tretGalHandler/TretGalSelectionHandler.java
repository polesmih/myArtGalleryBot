package org.example.handler.tretGalHandler;

import lombok.SneakyThrows;
import org.example.bot.settings.ConfigSettings;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class TretGalSelectionHandler extends TelegramLongPollingBot {

    String message_text;
    TretGalAlphabetTypes tretGalAlphabetTypes = new TretGalAlphabetTypes();
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
        if (update.hasMessage() && update.getMessage().hasText()) {
            message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();


            switch (message_text) {
                case "А - Б":
                    execute(TretGalInlineKeyboard.tretGalInlineKeyboardAb(chat_id));
                    break;

//                case "В - Ж":
//                    execute(TretGalInlineKeyboard.tretGalInlineKeyboardAb(chat_id));
//                    break;
//
//                case "З - К":
//                    execute(TretGalInlineKeyboard.tretGalInlineKeyboardAb(chat_id));
//                    break;
//
//                case "Л - Н":
//                    execute(TretGalInlineKeyboard.tretGalInlineKeyboardAb(chat_id));
//                    break;
//
//                case "О - Р":
//                    execute(TretGalInlineKeyboard.tretGalInlineKeyboardAb(chat_id));
//                    break;
//
//                case "С - У":
//                    execute(TretGalInlineKeyboard.tretGalInlineKeyboardAb(chat_id));
//                    break;
//
//                case "Ф - Я":
//                    execute(TretGalInlineKeyboard.tretGalInlineKeyboardAb(chat_id));
//                    break;

            }

        }

//        else if (update.hasCallbackQuery()) {
//
//            String call_data = update.getCallbackQuery().getData();
//            long chat_id = update.getCallbackQuery().getMessage().getChatId();
//
//            if (call_data.equals("1")) {
//                execute(PhotoHandler.sendPhoto(chat_id, "D:\\MyProjects\\myArtGalleryBot\\src\\main\\resources\\files\\tretGal\\Айвазовский Иван Радуга.jpg"));
//
//            }
//
//        }

    }


}

package org.example.handler.tretGalHandler;

import lombok.SneakyThrows;
import org.example.bot.settings.ConfigSettings;
import org.example.handler.PhotoHandler;
import org.example.handler.tretGalHandler.inlineKeyboards.*;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

import static org.example.handler.tretGalHandler.TretGalArtists.*;

public class TretGalSelectionHandler extends TelegramLongPollingBot {

    String message_text;
    private final static ConfigSettings settings = ConfigSettings.getInstance();
    public final static String ROOT = settings.getPath() + "\\tretGal\\";


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
                    execute(TretGalInlineKeyboardAb.tretGalInlineKeyboardAb(chat_id));
                    break;

                case "В - Ж":
                    execute(TretGalInlineKeyboardVj.tretGalInlineKeyboardVj(chat_id));
                    break;

                case "З - К":
                    execute(TretGalInlineKeyboardZk.tretGalInlineKeyboardZk(chat_id));
                    break;

                case "Л - Н":
                    execute(TretGalInlineKeyboardLn.tretGalInlineKeyboardLn(chat_id));
                    break;

                case "О - Р":
                    execute(TretGalInlineKeyboardOr.tretGalInlineKeyboardOr(chat_id));
                    break;

                case "С - У":
                    execute(TretGalInlineKeyboardSu.tretGalInlineKeyboardSu(chat_id));
                    break;

                case "Ф - Я":
                    execute(TretGalInlineKeyboardFy.tretGalInlineKeyboardFy(chat_id));
                    break;

            }

        } else if (update.hasCallbackQuery()) {
            String call_data = update.getCallbackQuery().getData();
            long chat_id = update.getCallbackQuery().getMessage().getChatId();

            if (call_data.equals(AIVAZOVSKY.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Айвазовский Иван Радуга.jpg", "Айвазовский, Радуга"));

            } else if (call_data.equals(ANDREENKOV.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Андреенков Владимир Портрет А. Шервинской.png", "Андреенков В., Портрет А. Шервинской"));

            } else if (call_data.equals(ARCHIPOV.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Архипов Абрам Крестьянка в зеленом фартуке.jpg", "Архипов, Крестьянка в зеленом фартуке"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Архипов Абрам Прачки.jpg", "Архипов, Прачки"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Архипов Абрам Северная деревня.jpg", "Архипов, Северная деревня"));

            }
        }

    }


}

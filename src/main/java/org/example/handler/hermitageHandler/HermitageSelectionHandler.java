package org.example.handler.hermitageHandler;

import lombok.SneakyThrows;
import org.example.bot.settings.ConfigSettings;
import org.example.bot.settings.Sender;
import org.example.handler.hermitageHandler.inlineKeyboards.*;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

import static org.example.bot.settings.enums.AlphabetGroup.*;
import static org.example.bot.settings.enums.artists.HermitageArtists.*;

public class HermitageSelectionHandler extends TelegramLongPollingBot {

    String message_text;
    private final static ConfigSettings settings = ConfigSettings.getInstance();
    public final static String ROOT = settings.getPath() + "\\hermitage\\";

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

            if (message_text.equals(A_B_ER.getAbcGroup())) {
                execute(HermitageInlineKeyboardAb.hermitageInlineKeyboardAb(chat_id));
            } else if (message_text.equals(V_G_ER.getAbcGroup())) {
                execute(HermitageInlineKeyboardVg.hermitageInlineKeyboardVg(chat_id));
            } else if (message_text.equals(D_K_ER.getAbcGroup())) {
                execute(HermitageInlineKeyboardDk.hermitageInlineKeyboardDk(chat_id));
            } else if (message_text.equals(L_N_ER.getAbcGroup())) {
                execute(HermitageInlineKeyboardLn.hermitageInlineKeyboardLn(chat_id));
            } else if (message_text.equals(P_R_ER.getAbcGroup())) {
                execute(HermitageInlineKeyboardPr.hermitageInlineKeyboardPr(chat_id));
            } else if (message_text.equals(S_F_ER.getAbcGroup())) {
                execute(HermitageInlineKeyboardSf.hermitageInlineKeyboardSf(chat_id));
            } else if (message_text.equals(H_Y_ER.getAbcGroup())) {
                execute(HermitageInlineKeyboardHy.hermitageInlineKeyboardHy(chat_id));

            }

        } else if (update.hasCallbackQuery()) {
            String call_data = update.getCallbackQuery().getData();
            long chat_id = update.getCallbackQuery().getMessage().getChatId();

            if (call_data.equals(AVRESE.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Аврезе Мария Лина, Девочка в голубом.png", "Аврезе Мария Лина, Девочка в голубом"));

            } else if (call_data.equals(ALIKS.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Аликс Ив, Сцена в суде.png", "Аликс Ив, Сцена в суде"));

            } else if (call_data.equals(AMELIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Амелин Альбин, Две женщины у окна.png", "Амелин Альбин, Две женщины у окна"));

            } else if (call_data.equals(ARTSER.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Артсер Питер, Торговец дичью.png", "Артсер Питер, Торговец дичью"));

            }

            else if (call_data.equals(WEB_HERM.toString())) {
                execute(Sender.sendMessage(chat_id, ""));

            }

        }
    }

}

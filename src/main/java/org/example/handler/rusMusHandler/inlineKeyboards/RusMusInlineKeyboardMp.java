package org.example.handler.rusMusHandler.inlineKeyboards;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

import static org.example.bot.settings.MessagesConst.*;
import static org.example.bot.settings.enums.AlphabetGroup.*;
import static org.example.bot.settings.enums.artists.RusMusArtists.*;

public class RusMusInlineKeyboardMp {

    public static SendMessage rusMusInlineKeyboardMp(long chat_id) {

        SendMessage message = new SendMessage();
        message.setChatId(chat_id);
        message.setText(ART);

        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();

        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();

        List<InlineKeyboardButton> rowInline1 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText(R_MAKOVSKY_VE.getArtName());
        inlineKeyboardButton1.setCallbackData(R_MAKOVSKY_VE.toString());
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        inlineKeyboardButton2.setText(R_MAKOVSKY_KE.getArtName());
        inlineKeyboardButton2.setCallbackData(R_MAKOVSKY_KE.toString());
        rowInline1.add(inlineKeyboardButton1);
        rowInline1.add(inlineKeyboardButton2);

        List<InlineKeyboardButton> rowInline2 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        inlineKeyboardButton3.setText(R_MAKSIMOV.getArtName());
        inlineKeyboardButton3.setCallbackData(R_MAKSIMOV.toString());
        InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
        inlineKeyboardButton4.setText(R_MALEVICH.getArtName());
        inlineKeyboardButton4.setCallbackData(R_MALEVICH.toString());
        rowInline2.add(inlineKeyboardButton3);
        rowInline2.add(inlineKeyboardButton4);

        List<InlineKeyboardButton> rowInline3 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
        inlineKeyboardButton5.setText(R_MALUTIN.getArtName());
        inlineKeyboardButton5.setCallbackData(R_MALUTIN.toString());
        InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
        inlineKeyboardButton6.setText(R_MALAVIN.getArtName());
        inlineKeyboardButton6.setCallbackData(R_MALAVIN.toString());
        rowInline3.add(inlineKeyboardButton5);
        rowInline3.add(inlineKeyboardButton6);

        List<InlineKeyboardButton> rowInline4 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
        inlineKeyboardButton7.setText(R_MASHKOV.getArtName());
        inlineKeyboardButton7.setCallbackData(R_MASHKOV.toString());
        InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
        inlineKeyboardButton8.setText(R_MOSHIN.getArtName());
        inlineKeyboardButton8.setCallbackData(R_MOSHIN.toString());
        rowInline4.add(inlineKeyboardButton7);
        rowInline4.add(inlineKeyboardButton8);

        List<InlineKeyboardButton> rowInline5 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();
        inlineKeyboardButton9.setText(R_MYLNIKOV.getArtName());
        inlineKeyboardButton9.setCallbackData(R_MYLNIKOV.toString());
        InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();
        inlineKeyboardButton10.setText(R_NESTEROV.getArtName());
        inlineKeyboardButton10.setCallbackData(R_NESTEROV.toString());
        rowInline5.add(inlineKeyboardButton9);
        rowInline5.add(inlineKeyboardButton10);

        List<InlineKeyboardButton> rowInline6 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();
        inlineKeyboardButton11.setText(R_PAKULIN.getArtName());
        inlineKeyboardButton11.setCallbackData(R_PAKULIN.toString());
        InlineKeyboardButton inlineKeyboardButton12 = new InlineKeyboardButton();
        inlineKeyboardButton12.setText(R_PASTERNAK.getArtName());
        inlineKeyboardButton12.setCallbackData(R_PASTERNAK.toString());
        rowInline6.add(inlineKeyboardButton11);
        rowInline6.add(inlineKeyboardButton12);

        List<InlineKeyboardButton> rowInline7 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton13 = new InlineKeyboardButton();
        inlineKeyboardButton13.setText(R_PEROV.getArtName());
        inlineKeyboardButton13.setCallbackData(R_PEROV.toString());
        InlineKeyboardButton inlineKeyboardButton14 = new InlineKeyboardButton();
        inlineKeyboardButton14.setText(R_PESTINSKY.getArtName());
        inlineKeyboardButton14.setCallbackData(R_PESTINSKY.toString());
        rowInline7.add(inlineKeyboardButton13);
        rowInline7.add(inlineKeyboardButton14);

        List<InlineKeyboardButton> rowInline8 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton15 = new InlineKeyboardButton();
        inlineKeyboardButton15.setText(R_PETROV_VODKIN.getArtName());
        inlineKeyboardButton15.setCallbackData(R_PETROV_VODKIN.toString());
        InlineKeyboardButton inlineKeyboardButton16 = new InlineKeyboardButton();
        inlineKeyboardButton16.setText(R_PLASTOV.getArtName());
        inlineKeyboardButton16.setCallbackData(R_PLASTOV.toString());
        rowInline8.add(inlineKeyboardButton15);
        rowInline8.add(inlineKeyboardButton16);

        List<InlineKeyboardButton> rowInline9 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton17 = new InlineKeyboardButton();
        inlineKeyboardButton17.setText(R_POLENOV.getArtName());
        inlineKeyboardButton17.setCallbackData(R_POLENOV.toString());
        InlineKeyboardButton inlineKeyboardButton18 = new InlineKeyboardButton();
        inlineKeyboardButton18.setText(R_POPOV.getArtName());
        inlineKeyboardButton18.setCallbackData(R_POPOV.toString());
        rowInline9.add(inlineKeyboardButton17);
        rowInline9.add(inlineKeyboardButton18);

        List<InlineKeyboardButton> rowInline10 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton19 = new InlineKeyboardButton();
        inlineKeyboardButton19.setText(R_POPOVA.getArtName());
        inlineKeyboardButton19.setCallbackData(R_POPOVA.toString());
        InlineKeyboardButton inlineKeyboardButton20 = new InlineKeyboardButton();
        inlineKeyboardButton20.setText(R_PUNI.getArtName());
        inlineKeyboardButton20.setCallbackData(R_PUNI.toString());
        rowInline10.add(inlineKeyboardButton19);
        rowInline10.add(inlineKeyboardButton20);

        List<InlineKeyboardButton> rowInline11 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton21 = new InlineKeyboardButton();
        inlineKeyboardButton21.setText(WEB_RM.getAbcGroup());
        inlineKeyboardButton21.setUrl(URL_RM);
        inlineKeyboardButton21.setCallbackData(WEB_RM.toString());
        rowInline11.add(inlineKeyboardButton21);

        rowsInline.add(rowInline1);
        rowsInline.add(rowInline2);
        rowsInline.add(rowInline3);
        rowsInline.add(rowInline4);
        rowsInline.add(rowInline5);
        rowsInline.add(rowInline6);
        rowsInline.add(rowInline7);
        rowsInline.add(rowInline8);
        rowsInline.add(rowInline9);
        rowsInline.add(rowInline10);
        rowsInline.add(rowInline11);

        markupInline.setKeyboard(rowsInline);
        message.setReplyMarkup(markupInline);

        return message;

    }

}

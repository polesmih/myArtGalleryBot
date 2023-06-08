package org.example.handler.tretGalHandler.inlineKeyboards;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

import static org.example.bot.settings.MessagesConst.*;
import static org.example.bot.settings.enums.AlphabetGroup.*;
import static org.example.bot.settings.enums.artists.TretGalArtists.*;

public class TretGalInlineKeyboardZk {

    public static SendMessage tretGalInlineKeyboardZk(long chat_id) {

        SendMessage message = new SendMessage();
        message.setChatId(chat_id);
        message.setText(ART);

        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();

        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();

        List<InlineKeyboardButton> rowInline1 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText(ZAICEV.getArtName());
        inlineKeyboardButton1.setCallbackData(ZAICEV.toString());
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        inlineKeyboardButton2.setText(ZACHAROV.getArtName());
        inlineKeyboardButton2.setCallbackData(ZACHAROV.toString());
        rowInline1.add(inlineKeyboardButton1);
        rowInline1.add(inlineKeyboardButton2);

        List<InlineKeyboardButton> rowInline2 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        inlineKeyboardButton3.setText(ZVERKOV.getArtName());
        inlineKeyboardButton3.setCallbackData(ZVERKOV.toString());
        InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
        inlineKeyboardButton4.setText(IVANOV_AI.getArtName());
        inlineKeyboardButton4.setCallbackData(IVANOV_AI.toString());
        rowInline2.add(inlineKeyboardButton3);
        rowInline2.add(inlineKeyboardButton4);

        List<InlineKeyboardButton> rowInline3 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
        inlineKeyboardButton5.setText(ISTOMIN.getArtName());
        inlineKeyboardButton5.setCallbackData(ISTOMIN.toString());
        InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
        inlineKeyboardButton6.setText(KANDINSKY.getArtName());
        inlineKeyboardButton6.setCallbackData(KANDINSKY.toString());
        rowInline3.add(inlineKeyboardButton5);
        rowInline3.add(inlineKeyboardButton6);

        List<InlineKeyboardButton> rowInline4 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
        inlineKeyboardButton7.setText(KELIN.getArtName());
        inlineKeyboardButton7.setCallbackData(KELIN.toString());
        InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
        inlineKeyboardButton8.setText(KIPRENSKY.getArtName());
        inlineKeyboardButton8.setCallbackData(KIPRENSKY.toString());
        rowInline4.add(inlineKeyboardButton7);
        rowInline4.add(inlineKeyboardButton8);

        List<InlineKeyboardButton> rowInline5 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();
        inlineKeyboardButton9.setText(KISELEV.getArtName());
        inlineKeyboardButton9.setCallbackData(KISELEV.toString());
        InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();
        inlineKeyboardButton10.setText(KOMAROV.getArtName());
        inlineKeyboardButton10.setCallbackData(KOMAROV.toString());
        rowInline5.add(inlineKeyboardButton9);
        rowInline5.add(inlineKeyboardButton10);

        List<InlineKeyboardButton> rowInline6 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();
        inlineKeyboardButton11.setText(KONENKOV.getArtName());
        inlineKeyboardButton11.setCallbackData(KONENKOV.toString());
        InlineKeyboardButton inlineKeyboardButton12 = new InlineKeyboardButton();
        inlineKeyboardButton12.setText(KORJEV.getArtName());
        inlineKeyboardButton12.setCallbackData(KORJEV.toString());
        rowInline6.add(inlineKeyboardButton11);
        rowInline6.add(inlineKeyboardButton12);

        List<InlineKeyboardButton> rowInline7 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton13 = new InlineKeyboardButton();
        inlineKeyboardButton13.setText(KORIN.getArtName());
        inlineKeyboardButton13.setCallbackData(KORIN.toString());
        InlineKeyboardButton inlineKeyboardButton14 = new InlineKeyboardButton();
        inlineKeyboardButton14.setText(KOROVIN.getArtName());
        inlineKeyboardButton14.setCallbackData(KOROVIN.toString());
        rowInline7.add(inlineKeyboardButton13);
        rowInline7.add(inlineKeyboardButton14);

        List<InlineKeyboardButton> rowInline8 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton15 = new InlineKeyboardButton();
        inlineKeyboardButton15.setText(KRAVCHENKO.getArtName());
        inlineKeyboardButton15.setCallbackData(KRAVCHENKO.toString());
        InlineKeyboardButton inlineKeyboardButton16 = new InlineKeyboardButton();
        inlineKeyboardButton16.setText(KRAMSKOY.getArtName());
        inlineKeyboardButton16.setCallbackData(KRAMSKOY.toString());
        rowInline8.add(inlineKeyboardButton15);
        rowInline8.add(inlineKeyboardButton16);

        List<InlineKeyboardButton> rowInline9 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton17 = new InlineKeyboardButton();
        inlineKeyboardButton17.setText(KUINDJI.getArtName());
        inlineKeyboardButton17.setCallbackData(KUINDJI.toString());
        InlineKeyboardButton inlineKeyboardButton18 = new InlineKeyboardButton();
        inlineKeyboardButton18.setText(KUPREYANOV.getArtName());
        inlineKeyboardButton18.setCallbackData(KUPREYANOV.toString());
        rowInline9.add(inlineKeyboardButton17);
        rowInline9.add(inlineKeyboardButton18);

        List<InlineKeyboardButton> rowInline10 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton19 = new InlineKeyboardButton();
        inlineKeyboardButton19.setText(KUSTODIEV.getArtName());
        inlineKeyboardButton19.setCallbackData(KUSTODIEV.toString());
        rowInline10.add(inlineKeyboardButton19);

        List<InlineKeyboardButton> rowInline11 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton20 = new InlineKeyboardButton();
        inlineKeyboardButton20.setText(WEB_TG.getAbcGroup());
        inlineKeyboardButton20.setUrl(URL_TG);
        inlineKeyboardButton20.setCallbackData(WEB_TG.toString());
        rowInline11.add(inlineKeyboardButton20);

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

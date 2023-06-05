package org.example.handler.hermitageHandler.inlineKeyboards;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

import static org.example.bot.settings.MessagesConst.*;
import static org.example.bot.settings.enums.AlphabetGroup.*;
import static org.example.bot.settings.enums.artists.HermitageArtists.*;

public class HermitageInlineKeyboardPr {

    public static SendMessage hermitageInlineKeyboardPr(long chat_id) {

        SendMessage message = new SendMessage();
        message.setChatId(chat_id);
        message.setText(ART);

        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();

        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();

        List<InlineKeyboardButton> rowInline1 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText(PALMA.getArtName());
        inlineKeyboardButton1.setCallbackData(PALMA.toString());
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        inlineKeyboardButton2.setText(PARKER.getArtName());
        inlineKeyboardButton2.setCallbackData(PARKER.toString());
        rowInline1.add(inlineKeyboardButton1);
        rowInline1.add(inlineKeyboardButton2);

        List<InlineKeyboardButton> rowInline2 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        inlineKeyboardButton3.setText(PEREDA.getArtName());
        inlineKeyboardButton3.setCallbackData(PEREDA.toString());
        InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
        inlineKeyboardButton4.setText(PERRONO.getArtName());
        inlineKeyboardButton4.setCallbackData(PERRONO.toString());
        rowInline2.add(inlineKeyboardButton3);
        rowInline2.add(inlineKeyboardButton4);

        List<InlineKeyboardButton> rowInline3 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
        inlineKeyboardButton5.setText(PETTENKOFEN.getArtName());
        inlineKeyboardButton5.setCallbackData(PETTENKOFEN.toString());
        InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
        inlineKeyboardButton6.setText(PIZIS.getArtName());
        inlineKeyboardButton6.setCallbackData(PIZIS.toString());
        rowInline3.add(inlineKeyboardButton5);
        rowInline3.add(inlineKeyboardButton6);

        List<InlineKeyboardButton> rowInline4 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
        inlineKeyboardButton7.setText(PIKACCO.getArtName());
        inlineKeyboardButton7.setCallbackData(PIKACCO.toString());
        InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
        inlineKeyboardButton8.setText(PISSARO.getArtName());
        inlineKeyboardButton8.setCallbackData(PISSARO.toString());
        rowInline4.add(inlineKeyboardButton7);
        rowInline4.add(inlineKeyboardButton8);

        List<InlineKeyboardButton> rowInline5 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();
        inlineKeyboardButton9.setText(PLEPP.getArtName());
        inlineKeyboardButton9.setCallbackData(PLEPP.toString());
        InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();
        inlineKeyboardButton10.setText(POTTER.getArtName());
        inlineKeyboardButton10.setCallbackData(POTTER.toString());
        rowInline5.add(inlineKeyboardButton9);
        rowInline5.add(inlineKeyboardButton10);

        List<InlineKeyboardButton> rowInline6 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();
        inlineKeyboardButton11.setText(PIETRO.getArtName());
        inlineKeyboardButton11.setCallbackData(PIETRO.toString());
        InlineKeyboardButton inlineKeyboardButton12 = new InlineKeyboardButton();
        inlineKeyboardButton12.setText(RAFAEL.getArtName());
        inlineKeyboardButton12.setCallbackData(RAFAEL.toString());
        rowInline6.add(inlineKeyboardButton11);
        rowInline6.add(inlineKeyboardButton12);

        List<InlineKeyboardButton> rowInline7 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton13 = new InlineKeyboardButton();
        inlineKeyboardButton13.setText(REINA.getArtName());
        inlineKeyboardButton13.setCallbackData(REINA.toString());
        InlineKeyboardButton inlineKeyboardButton14 = new InlineKeyboardButton();
        inlineKeyboardButton14.setText(REMBRANT.getArtName());
        inlineKeyboardButton14.setCallbackData(REMBRANT.toString());
        rowInline7.add(inlineKeyboardButton13);
        rowInline7.add(inlineKeyboardButton14);

        List<InlineKeyboardButton> rowInline8 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton15 = new InlineKeyboardButton();
        inlineKeyboardButton15.setText(RENUAR.getArtName());
        inlineKeyboardButton15.setCallbackData(RENUAR.toString());
        InlineKeyboardButton inlineKeyboardButton16 = new InlineKeyboardButton();
        inlineKeyboardButton16.setText(REFREJE.getArtName());
        inlineKeyboardButton16.setCallbackData(REFREJE.toString());
        rowInline8.add(inlineKeyboardButton15);
        rowInline8.add(inlineKeyboardButton16);

        List<InlineKeyboardButton> rowInline9 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton17 = new InlineKeyboardButton();
        inlineKeyboardButton17.setText(RISSANEN.getArtName());
        inlineKeyboardButton17.setCallbackData(RISSANEN.toString());
        InlineKeyboardButton inlineKeyboardButton18 = new InlineKeyboardButton();
        inlineKeyboardButton18.setText(RISHAR.getArtName());
        inlineKeyboardButton18.setCallbackData(RISHAR.toString());
        rowInline9.add(inlineKeyboardButton17);
        rowInline9.add(inlineKeyboardButton18);

        List<InlineKeyboardButton> rowInline10 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton19 = new InlineKeyboardButton();
        inlineKeyboardButton19.setText(ROIMERSVALE.getArtName());
        inlineKeyboardButton19.setCallbackData(ROIMERSVALE.toString());
        InlineKeyboardButton inlineKeyboardButton20 = new InlineKeyboardButton();
        inlineKeyboardButton20.setText(RUBENS.getArtName());
        inlineKeyboardButton20.setCallbackData(RUBENS.toString());
        rowInline10.add(inlineKeyboardButton19);
        rowInline10.add(inlineKeyboardButton20);

        List<InlineKeyboardButton> rowInline11 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton21 = new InlineKeyboardButton();
        inlineKeyboardButton21.setText(RUSSO.getArtName());
        inlineKeyboardButton21.setCallbackData(RUSSO.toString());
        rowInline11.add(inlineKeyboardButton21);

        List<InlineKeyboardButton> rowInline12 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton22 = new InlineKeyboardButton();
        inlineKeyboardButton22.setText(WEB_HERM.getAbcGroup());
        inlineKeyboardButton22.setUrl(URL_HERM);
        inlineKeyboardButton22.setCallbackData(WEB_HERM.toString());
        rowInline12.add(inlineKeyboardButton22);

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
        rowsInline.add(rowInline12);

        markupInline.setKeyboard(rowsInline);
        message.setReplyMarkup(markupInline);

        return message;

    }

}

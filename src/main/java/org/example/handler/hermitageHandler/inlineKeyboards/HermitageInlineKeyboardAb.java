package org.example.handler.hermitageHandler.inlineKeyboards;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

import static org.example.bot.settings.MessagesConst.*;
import static org.example.bot.settings.enums.AlphabetGroup.*;
import static org.example.bot.settings.enums.artists.HermitageArtists.*;

public class HermitageInlineKeyboardAb {

    public static SendMessage hermitageInlineKeyboardAb(long chat_id) {

        SendMessage message = new SendMessage();
        message.setChatId(chat_id);
        message.setText(ART);

        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();

        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();

        List<InlineKeyboardButton> rowInline1 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText(AVRESE.getArtName());
        inlineKeyboardButton1.setCallbackData(AVRESE.toString());
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        inlineKeyboardButton2.setText(ALIKS.getArtName());
        inlineKeyboardButton2.setCallbackData(ALIKS.toString());
        rowInline1.add(inlineKeyboardButton1);
        rowInline1.add(inlineKeyboardButton2);

        List<InlineKeyboardButton> rowInline2 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        inlineKeyboardButton3.setText(AMELIN.getArtName());
        inlineKeyboardButton3.setCallbackData(AMELIN.toString());
        InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
        inlineKeyboardButton4.setText(ARTSER.getArtName());
        inlineKeyboardButton4.setCallbackData(ARTSER.toString());
        rowInline2.add(inlineKeyboardButton3);
        rowInline2.add(inlineKeyboardButton4);

        List<InlineKeyboardButton> rowInline3 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
        inlineKeyboardButton5.setText(BAZILE.getArtName());
        inlineKeyboardButton5.setCallbackData(BAZILE.toString());
        InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
        inlineKeyboardButton6.setText(BEKKER.getArtName());
        inlineKeyboardButton6.setCallbackData(BEKKER.toString());
        rowInline3.add(inlineKeyboardButton5);
        rowInline3.add(inlineKeyboardButton6);

        List<InlineKeyboardButton> rowInline4 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
        inlineKeyboardButton7.setText(BARBE.getArtName());
        inlineKeyboardButton7.setCallbackData(BARBE.toString());
        InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
        inlineKeyboardButton8.setText(BARTEL.getArtName());
        inlineKeyboardButton8.setCallbackData(BARTEL.toString());
        rowInline4.add(inlineKeyboardButton7);
        rowInline4.add(inlineKeyboardButton8);

        List<InlineKeyboardButton> rowInline5 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();
        inlineKeyboardButton9.setText(BARTSON.getArtName());
        inlineKeyboardButton9.setCallbackData(BARTSON.toString());
        InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();
        inlineKeyboardButton10.setText(BELLANJ.getArtName());
        inlineKeyboardButton10.setCallbackData(BELLANJ.toString());
        rowInline5.add(inlineKeyboardButton9);
        rowInline5.add(inlineKeyboardButton10);

        List<InlineKeyboardButton> rowInline6 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();
        inlineKeyboardButton11.setText(BONNAR.getArtName());
        inlineKeyboardButton11.setCallbackData(BONNAR.toString());
        InlineKeyboardButton inlineKeyboardButton12 = new InlineKeyboardButton();
        inlineKeyboardButton12.setText(BORRA.getArtName());
        inlineKeyboardButton12.setCallbackData(BORRA.toString());
        rowInline6.add(inlineKeyboardButton11);
        rowInline6.add(inlineKeyboardButton12);

        List<InlineKeyboardButton> rowInline7 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton13 = new InlineKeyboardButton();
        inlineKeyboardButton13.setText(BOSH.getArtName());
        inlineKeyboardButton13.setCallbackData(BOSH.toString());
        InlineKeyboardButton inlineKeyboardButton14 = new InlineKeyboardButton();
        inlineKeyboardButton14.setText(BOTICHELLI.getArtName());
        inlineKeyboardButton14.setCallbackData(BOTICHELLI.toString());
        rowInline7.add(inlineKeyboardButton13);
        rowInline7.add(inlineKeyboardButton14);

        List<InlineKeyboardButton> rowInline8 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton15 = new InlineKeyboardButton();
        inlineKeyboardButton15.setText(BRAUVER.getArtName());
        inlineKeyboardButton15.setCallbackData(BRAUVER.toString());
        InlineKeyboardButton inlineKeyboardButton16 = new InlineKeyboardButton();
        inlineKeyboardButton16.setText(BREGEL_P.getArtName());
        inlineKeyboardButton16.setCallbackData(BREGEL_P.toString());
        rowInline8.add(inlineKeyboardButton15);
        rowInline8.add(inlineKeyboardButton16);

        List<InlineKeyboardButton> rowInline9 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton17 = new InlineKeyboardButton();
        inlineKeyboardButton17.setText(BREGEL_Y.getArtName());
        inlineKeyboardButton17.setCallbackData(BREGEL_Y.toString());
        InlineKeyboardButton inlineKeyboardButton18 = new InlineKeyboardButton();
        inlineKeyboardButton18.setText(BREIN.getArtName());
        inlineKeyboardButton18.setCallbackData(BREIN.toString());
        rowInline9.add(inlineKeyboardButton17);
        rowInline9.add(inlineKeyboardButton18);

        List<InlineKeyboardButton> rowInline10 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton19 = new InlineKeyboardButton();
        inlineKeyboardButton19.setText(BUALI.getArtName());
        inlineKeyboardButton19.setCallbackData(BUALI.toString());
        InlineKeyboardButton inlineKeyboardButton20 = new InlineKeyboardButton();
        inlineKeyboardButton20.setText(BUFFE.getArtName());
        inlineKeyboardButton20.setCallbackData(BUFFE.toString());
        rowInline10.add(inlineKeyboardButton19);
        rowInline10.add(inlineKeyboardButton20);

        List<InlineKeyboardButton> rowInline11 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton21 = new InlineKeyboardButton();
        inlineKeyboardButton21.setText(WEB_HERM.getAbcGroup());
        inlineKeyboardButton21.setUrl(URL_HERM);
        inlineKeyboardButton21.setCallbackData(WEB_HERM.toString());
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

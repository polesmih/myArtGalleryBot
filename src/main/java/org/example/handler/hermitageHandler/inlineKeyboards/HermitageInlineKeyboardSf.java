package org.example.handler.hermitageHandler.inlineKeyboards;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

import static org.example.bot.settings.MessagesConst.*;
import static org.example.bot.settings.enums.AlphabetGroup.*;
import static org.example.bot.settings.enums.artists.HermitageArtists.*;

public class HermitageInlineKeyboardSf {

    public static SendMessage hermitageInlineKeyboardSf(long chat_id) {

        SendMessage message = new SendMessage();
        message.setChatId(chat_id);
        message.setText(ART);

        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();

        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();

        List<InlineKeyboardButton> rowInline1 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText(SANCHES.getArtName());
        inlineKeyboardButton1.setCallbackData(SANCHES.toString());
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        inlineKeyboardButton2.setText(SEZANN.getArtName());
        inlineKeyboardButton2.setCallbackData(SEZANN.toString());
        rowInline1.add(inlineKeyboardButton1);
        rowInline1.add(inlineKeyboardButton2);

        List<InlineKeyboardButton> rowInline2 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        inlineKeyboardButton3.setText(SISLEI.getArtName());
        inlineKeyboardButton3.setCallbackData(SISLEI.toString());
        InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
        inlineKeyboardButton4.setText(SNEIDERS.getArtName());
        inlineKeyboardButton4.setCallbackData(SNEIDERS.toString());
        rowInline2.add(inlineKeyboardButton3);
        rowInline2.add(inlineKeyboardButton4);

        List<InlineKeyboardButton> rowInline3 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
        inlineKeyboardButton5.setText(STANCIONE.getArtName());
        inlineKeyboardButton5.setCallbackData(STANCIONE.toString());
        InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
        inlineKeyboardButton6.setText(STEVENS.getArtName());
        inlineKeyboardButton6.setCallbackData(STEVENS.toString());
        rowInline3.add(inlineKeyboardButton5);
        rowInline3.add(inlineKeyboardButton6);

        List<InlineKeyboardButton> rowInline4 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
        inlineKeyboardButton7.setText(STREIS.getArtName());
        inlineKeyboardButton7.setCallbackData(STREIS.toString());
        InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
        inlineKeyboardButton8.setText(SUTIN.getArtName());
        inlineKeyboardButton8.setCallbackData(SUTIN.toString());
        rowInline4.add(inlineKeyboardButton7);
        rowInline4.add(inlineKeyboardButton8);

        List<InlineKeyboardButton> rowInline5 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();
        inlineKeyboardButton9.setText(TENIRS.getArtName());
        inlineKeyboardButton9.setCallbackData(TENIRS.toString());
        InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();
        inlineKeyboardButton10.setText(TICIAN.getArtName());
        inlineKeyboardButton10.setCallbackData(TICIAN.toString());
        rowInline5.add(inlineKeyboardButton9);
        rowInline5.add(inlineKeyboardButton10);

        List<InlineKeyboardButton> rowInline6 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();
        inlineKeyboardButton11.setText(TOMA.getArtName());
        inlineKeyboardButton11.setCallbackData(TOMA.toString());
        InlineKeyboardButton inlineKeyboardButton12 = new InlineKeyboardButton();
        inlineKeyboardButton12.setText(TRUIBER.getArtName());
        inlineKeyboardButton12.setCallbackData(TRUIBER.toString());
        rowInline6.add(inlineKeyboardButton11);
        rowInline6.add(inlineKeyboardButton12);

        List<InlineKeyboardButton> rowInline7 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton13 = new InlineKeyboardButton();
        inlineKeyboardButton13.setText(TUSKETS.getArtName());
        inlineKeyboardButton13.setCallbackData(TUSKETS.toString());
        InlineKeyboardButton inlineKeyboardButton14 = new InlineKeyboardButton();
        inlineKeyboardButton14.setText(FAVORI.getArtName());
        inlineKeyboardButton14.setCallbackData(FAVORI.toString());
        rowInline7.add(inlineKeyboardButton13);
        rowInline7.add(inlineKeyboardButton14);

        List<InlineKeyboardButton> rowInline8 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton15 = new InlineKeyboardButton();
        inlineKeyboardButton15.setText(FANTEN.getArtName());
        inlineKeyboardButton15.setCallbackData(FANTEN.toString());
        InlineKeyboardButton inlineKeyboardButton16 = new InlineKeyboardButton();
        inlineKeyboardButton16.setText(FOKSEIL.getArtName());
        inlineKeyboardButton16.setCallbackData(FOKSEIL.toString());
        rowInline8.add(inlineKeyboardButton15);
        rowInline8.add(inlineKeyboardButton16);

        List<InlineKeyboardButton> rowInline9 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton17 = new InlineKeyboardButton();
        inlineKeyboardButton17.setText(FRAGONAR.getArtName());
        inlineKeyboardButton17.setCallbackData(FRAGONAR.toString());
        InlineKeyboardButton inlineKeyboardButton18 = new InlineKeyboardButton();
        inlineKeyboardButton18.setText(FRANC.getArtName());
        inlineKeyboardButton18.setCallbackData(FRANC.toString());
        rowInline9.add(inlineKeyboardButton17);
        rowInline9.add(inlineKeyboardButton18);

        List<InlineKeyboardButton> rowInline10 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton19 = new InlineKeyboardButton();
        inlineKeyboardButton19.setText(FRANCHESKINI.getArtName());
        inlineKeyboardButton19.setCallbackData(FRANCHESKINI.toString());
        InlineKeyboardButton inlineKeyboardButton20 = new InlineKeyboardButton();
        inlineKeyboardButton20.setText(FRIDRIH.getArtName());
        inlineKeyboardButton20.setCallbackData(FRIDRIH.toString());
        rowInline10.add(inlineKeyboardButton19);
        rowInline10.add(inlineKeyboardButton20);

        List<InlineKeyboardButton> rowInline11 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton21 = new InlineKeyboardButton();
        inlineKeyboardButton21.setText(FRANCHESKINI.getArtName());
        inlineKeyboardButton21.setCallbackData(FRANCHESKINI.toString());
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

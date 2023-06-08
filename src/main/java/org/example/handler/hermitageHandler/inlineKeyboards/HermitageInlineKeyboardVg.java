package org.example.handler.hermitageHandler.inlineKeyboards;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

import static org.example.bot.settings.MessagesConst.*;
import static org.example.bot.settings.enums.AlphabetGroup.*;
import static org.example.bot.settings.enums.artists.HermitageArtists.*;

public class HermitageInlineKeyboardVg {

    public static SendMessage hermitageInlineKeyboardVg(long chat_id) {

        SendMessage message = new SendMessage();
        message.setChatId(chat_id);
        message.setText(ART);

        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();

        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();

        List<InlineKeyboardButton> rowInline1 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText(VAN_GOG.getArtName());
        inlineKeyboardButton1.setCallbackData(VAN_GOG.toString());
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        inlineKeyboardButton2.setText(VAN_DEIK.getArtName());
        inlineKeyboardButton2.setCallbackData(VAN_DEIK.toString());
        rowInline1.add(inlineKeyboardButton1);
        rowInline1.add(inlineKeyboardButton2);

        List<InlineKeyboardButton> rowInline2 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        inlineKeyboardButton3.setText(VATTO.getArtName());
        inlineKeyboardButton3.setCallbackData(VATTO.toString());
        InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
        inlineKeyboardButton4.setText(VELASKES.getArtName());
        inlineKeyboardButton4.setCallbackData(VELASKES.toString());
        rowInline2.add(inlineKeyboardButton3);
        rowInline2.add(inlineKeyboardButton4);

        List<InlineKeyboardButton> rowInline3 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
        inlineKeyboardButton5.setText(VERONESE.getArtName());
        inlineKeyboardButton5.setCallbackData(VERONESE.toString());
        InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
        inlineKeyboardButton6.setText(VEROKKO.getArtName());
        inlineKeyboardButton6.setCallbackData(VEROKKO.toString());
        rowInline3.add(inlineKeyboardButton5);
        rowInline3.add(inlineKeyboardButton6);

        List<InlineKeyboardButton> rowInline4 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
        inlineKeyboardButton7.setText(VIDAL.getArtName());
        inlineKeyboardButton7.setCallbackData(VIDAL.toString());
        InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
        inlineKeyboardButton8.setText(VILEGAS.getArtName());
        inlineKeyboardButton8.setCallbackData(VILEGAS.toString());
        rowInline4.add(inlineKeyboardButton7);
        rowInline4.add(inlineKeyboardButton8);

        List<InlineKeyboardButton> rowInline5 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();
        inlineKeyboardButton9.setText(VLAMINK.getArtName());
        inlineKeyboardButton9.setCallbackData(VLAMINK.toString());
        InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();
        inlineKeyboardButton10.setText(VOS_PAUVEL.getArtName());
        inlineKeyboardButton10.setCallbackData(VOS_PAUVEL.toString());
        rowInline5.add(inlineKeyboardButton9);
        rowInline5.add(inlineKeyboardButton10);

        List<InlineKeyboardButton> rowInline6 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();
        inlineKeyboardButton11.setText(VOTE.getArtName());
        inlineKeyboardButton11.setCallbackData(VOTE.toString());
        InlineKeyboardButton inlineKeyboardButton12 = new InlineKeyboardButton();
        inlineKeyboardButton12.setText(GALLE.getArtName());
        inlineKeyboardButton12.setCallbackData(GALLE.toString());
        rowInline6.add(inlineKeyboardButton11);
        rowInline6.add(inlineKeyboardButton12);

        List<InlineKeyboardButton> rowInline7 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton13 = new InlineKeyboardButton();
        inlineKeyboardButton13.setText(GVIDI.getArtName());
        inlineKeyboardButton13.setCallbackData(GVIDI.toString());
        InlineKeyboardButton inlineKeyboardButton14 = new InlineKeyboardButton();
        inlineKeyboardButton14.setText(GOGEN.getArtName());
        inlineKeyboardButton14.setCallbackData(GOGEN.toString());
        rowInline7.add(inlineKeyboardButton13);
        rowInline7.add(inlineKeyboardButton14);

        List<InlineKeyboardButton> rowInline8 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton15 = new InlineKeyboardButton();
        inlineKeyboardButton15.setText(GOROFALO.getArtName());
        inlineKeyboardButton15.setCallbackData(GOROFALO.toString());
        InlineKeyboardButton inlineKeyboardButton16 = new InlineKeyboardButton();
        inlineKeyboardButton16.setText(GRUTCNER.getArtName());
        inlineKeyboardButton16.setCallbackData(GRUTCNER.toString());
        rowInline8.add(inlineKeyboardButton15);
        rowInline8.add(inlineKeyboardButton16);

        List<InlineKeyboardButton> rowInline9 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton17 = new InlineKeyboardButton();
        inlineKeyboardButton17.setText(GREZ.getArtName());
        inlineKeyboardButton17.setCallbackData(GREZ.toString());
        rowInline9.add(inlineKeyboardButton17);

        List<InlineKeyboardButton> rowInline10 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton18 = new InlineKeyboardButton();
        inlineKeyboardButton18.setText(WEB_HERM.getAbcGroup());
        inlineKeyboardButton18.setUrl(URL_HERM);
        inlineKeyboardButton18.setCallbackData(WEB_HERM.toString());
        rowInline10.add(inlineKeyboardButton18);

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

        markupInline.setKeyboard(rowsInline);
        message.setReplyMarkup(markupInline);

        return message;

    }

}

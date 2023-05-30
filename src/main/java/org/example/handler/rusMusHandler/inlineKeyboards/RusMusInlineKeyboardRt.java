package org.example.handler.rusMusHandler.inlineKeyboards;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

import static org.example.bot.settings.MessagesConst.ART;
import static org.example.bot.settings.enums.RusMusArtists.*;

public class RusMusInlineKeyboardRt {

    public static SendMessage rusMusInlineKeyboardRt(long chat_id) {

        SendMessage message = new SendMessage();
        message.setChatId(chat_id);
        message.setText(ART);

        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();

        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();

        List<InlineKeyboardButton> rowInline1 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText(R_RAEV.getArtName());
        inlineKeyboardButton1.setCallbackData(R_RAEV.toString());
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        inlineKeyboardButton2.setText(R_REITERN.getArtName());
        inlineKeyboardButton2.setCallbackData(R_REITERN.toString());
        rowInline1.add(inlineKeyboardButton1);
        rowInline1.add(inlineKeyboardButton2);

        List<InlineKeyboardButton> rowInline2 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        inlineKeyboardButton3.setText(R_REPIN.getArtName());
        inlineKeyboardButton3.setCallbackData(R_REPIN.toString());
        InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
        inlineKeyboardButton4.setText(R_RERIH.getArtName());
        inlineKeyboardButton4.setCallbackData(R_RERIH.toString());
        rowInline2.add(inlineKeyboardButton3);
        rowInline2.add(inlineKeyboardButton4);

        List<InlineKeyboardButton> rowInline3 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
        inlineKeyboardButton5.setText(R_ROZANOV.getArtName());
        inlineKeyboardButton5.setCallbackData(R_ROZANOV.toString());
        InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
        inlineKeyboardButton6.setText(R_RUSAKOVA.getArtName());
        inlineKeyboardButton6.setCallbackData(R_RUSAKOVA.toString());
        rowInline3.add(inlineKeyboardButton5);
        rowInline3.add(inlineKeyboardButton6);

        List<InlineKeyboardButton> rowInline4 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
        inlineKeyboardButton7.setText(R_RUTKOVSKY.getArtName());
        inlineKeyboardButton7.setCallbackData(R_RUTKOVSKY.toString());
        InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
        inlineKeyboardButton8.setText(R_RYLOV.getArtName());
        inlineKeyboardButton8.setCallbackData(R_RYLOV.toString());
        rowInline4.add(inlineKeyboardButton7);
        rowInline4.add(inlineKeyboardButton8);

        List<InlineKeyboardButton> rowInline5 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();
        inlineKeyboardButton9.setText(R_RYABUSHKIN.getArtName());
        inlineKeyboardButton9.setCallbackData(R_RYABUSHKIN.toString());
        InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();
        inlineKeyboardButton10.setText(R_RYANGINA.getArtName());
        inlineKeyboardButton10.setCallbackData(R_RYANGINA.toString());
        rowInline5.add(inlineKeyboardButton9);
        rowInline5.add(inlineKeyboardButton10);

        List<InlineKeyboardButton> rowInline6 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();
        inlineKeyboardButton11.setText(R_SAVRASOV.getArtName());
        inlineKeyboardButton11.setCallbackData(R_SAVRASOV.toString());
        InlineKeyboardButton inlineKeyboardButton12 = new InlineKeyboardButton();
        inlineKeyboardButton12.setText(R_SAMOHVALOV.getArtName());
        inlineKeyboardButton12.setCallbackData(R_SAMOHVALOV.toString());
        rowInline6.add(inlineKeyboardButton11);
        rowInline6.add(inlineKeyboardButton12);

        List<InlineKeyboardButton> rowInline7 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton13 = new InlineKeyboardButton();
        inlineKeyboardButton13.setText(R_SAPUNOV.getArtName());
        inlineKeyboardButton13.setCallbackData(R_SAPUNOV.toString());
        InlineKeyboardButton inlineKeyboardButton14 = new InlineKeyboardButton();
        inlineKeyboardButton14.setText(R_SARYAN.getArtName());
        inlineKeyboardButton14.setCallbackData(R_SARYAN.toString());
        rowInline7.add(inlineKeyboardButton13);
        rowInline7.add(inlineKeyboardButton14);

        List<InlineKeyboardButton> rowInline8 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton15 = new InlineKeyboardButton();
        inlineKeyboardButton15.setText(R_SVETOSLAVSKY.getArtName());
        inlineKeyboardButton15.setCallbackData(R_SVETOSLAVSKY.toString());
        InlineKeyboardButton inlineKeyboardButton16 = new InlineKeyboardButton();
        inlineKeyboardButton16.setText(R_SEREBRAKOVA.getArtName());
        inlineKeyboardButton16.setCallbackData(R_SEREBRAKOVA.toString());
        rowInline8.add(inlineKeyboardButton15);
        rowInline8.add(inlineKeyboardButton16);

        List<InlineKeyboardButton> rowInline9 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton17 = new InlineKeyboardButton();
        inlineKeyboardButton17.setText(R_SEROV.getArtName());
        inlineKeyboardButton17.setCallbackData(R_SEROV.toString());
        InlineKeyboardButton inlineKeyboardButton18 = new InlineKeyboardButton();
        inlineKeyboardButton18.setText(R_SKOTTI.getArtName());
        inlineKeyboardButton18.setCallbackData(R_SKOTTI.toString());
        rowInline9.add(inlineKeyboardButton17);
        rowInline9.add(inlineKeyboardButton18);

        List<InlineKeyboardButton> rowInline10 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton19 = new InlineKeyboardButton();
        inlineKeyboardButton19.setText(R_SOMOV.getArtName());
        inlineKeyboardButton19.setCallbackData(R_SOMOV.toString());
        InlineKeyboardButton inlineKeyboardButton20 = new InlineKeyboardButton();
        inlineKeyboardButton20.setText(R_SURIKOV.getArtName());
        inlineKeyboardButton20.setCallbackData(R_SURIKOV.toString());
        rowInline10.add(inlineKeyboardButton19);
        rowInline10.add(inlineKeyboardButton20);

        List<InlineKeyboardButton> rowInline11 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton21 = new InlineKeyboardButton();
        inlineKeyboardButton21.setText(R_TATLIN.getArtName());
        inlineKeyboardButton21.setCallbackData(R_TATLIN.toString());
        InlineKeyboardButton inlineKeyboardButton22 = new InlineKeyboardButton();
        inlineKeyboardButton22.setText(R_TOROPOV.getArtName());
        inlineKeyboardButton22.setCallbackData(R_TOROPOV.toString());
        rowInline11.add(inlineKeyboardButton21);
        rowInline11.add(inlineKeyboardButton22);

        List<InlineKeyboardButton> rowInline12 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton23 = new InlineKeyboardButton();
        inlineKeyboardButton23.setText(R_TROPININ.getArtName());
        inlineKeyboardButton23.setCallbackData(R_TROPININ.toString());
        rowInline12.add(inlineKeyboardButton21);

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

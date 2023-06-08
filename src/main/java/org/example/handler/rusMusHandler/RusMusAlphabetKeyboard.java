package org.example.handler.rusMusHandler;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.Arrays;

import static org.example.bot.settings.enums.AlphabetGroup.*;


public class RusMusAlphabetKeyboard {

    public static ReplyKeyboardMarkup createRusMusAlphabetKeyboard() {

        KeyboardRow row1 = new KeyboardRow();
        row1.add(A_V_RM.getAbcGroup());
        row1.add(G_I_RM.getAbcGroup());
        row1.add(K_L_RM.getAbcGroup());

        KeyboardRow row2 = new KeyboardRow();
        row2.add(M_P_RM.getAbcGroup());
        row2.add(R_T_RM.getAbcGroup());
        row2.add(U_Y_RM.getAbcGroup());

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row1, row2));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }

}

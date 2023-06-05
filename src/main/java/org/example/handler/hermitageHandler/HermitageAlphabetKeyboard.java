package org.example.handler.hermitageHandler;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.Arrays;

import static org.example.bot.settings.enums.AlphabetGroup.*;


public class HermitageAlphabetKeyboard {

    public static ReplyKeyboardMarkup createHermitageAlphabetKeyboard() {

        KeyboardRow row1 = new KeyboardRow();
        row1.add(A_B_ER.getAbcGroup());
        row1.add(V_G_ER.getAbcGroup());

        KeyboardRow row2 = new KeyboardRow();
        row2.add(D_K_ER.getAbcGroup());
        row2.add(L_N_ER.getAbcGroup());
        row2.add(P_R_ER.getAbcGroup());

        KeyboardRow row3 = new KeyboardRow();
        row3.add(S_F_ER.getAbcGroup());
        row3.add(H_Y_ER.getAbcGroup());

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row1, row2, row3));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }

}

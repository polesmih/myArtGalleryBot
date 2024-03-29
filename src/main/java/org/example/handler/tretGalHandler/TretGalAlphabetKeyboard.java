package org.example.handler.tretGalHandler;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.Arrays;

import static org.example.bot.settings.enums.AlphabetGroup.*;


public class TretGalAlphabetKeyboard {

    public static ReplyKeyboardMarkup createTretGalAlphabetKeyboard() {

        KeyboardRow row1 = new KeyboardRow();
        row1.add(A_B_TG.getAbcGroup());
        row1.add(V_J_TG.getAbcGroup());

        KeyboardRow row2 = new KeyboardRow();
        row2.add(Z_K_TG.getAbcGroup());
        row2.add(L_N_TG.getAbcGroup());
        row2.add(O_R_TG.getAbcGroup());

        KeyboardRow row3 = new KeyboardRow();
        row3.add(S_U_TG.getAbcGroup());
        row3.add(F_Y_TG.getAbcGroup());

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row1, row2, row3));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }

}

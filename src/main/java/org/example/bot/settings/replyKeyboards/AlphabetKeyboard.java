package org.example.bot.settings.replyKeyboards;

import org.example.bot.settings.enums.AlphabetType;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.Arrays;

import static org.example.bot.settings.enums.AlphabetType.*;

public class AlphabetKeyboard {

    public static ReplyKeyboardMarkup createAlphabetKeyboard() {

        KeyboardRow row1 = new KeyboardRow();
        row1.add(A_B.getAbcType());
        row1.add(V_G.getAbcType());


        KeyboardRow row2 = new KeyboardRow();
        row2.add(Z_K.getAbcType());
        row2.add(L_N.getAbcType());
        row2.add(O_R.getAbcType());

        KeyboardRow row3 = new KeyboardRow();
        row3.add(S_U.getAbcType());
        row3.add(F_Y.getAbcType());

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row1, row2, row3));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }

}

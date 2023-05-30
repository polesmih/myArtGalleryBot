package org.example.handler.rusMusHandler;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.Arrays;


public class RusMusAlphabetKeyboard {

    public static ReplyKeyboardMarkup createRusMusAlphabetKeyboard() {

        KeyboardRow row1 = new KeyboardRow();
        row1.add("А - В");
        row1.add("Г - И");

        KeyboardRow row2 = new KeyboardRow();
        row2.add("К - Л");
        row2.add("М - П");

        KeyboardRow row3 = new KeyboardRow();
        row3.add("Р - Т");
        row3.add("У - Я");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row1, row2, row3));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }

}

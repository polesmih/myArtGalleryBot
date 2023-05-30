package org.example.handler.tretGalHandler;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.Arrays;


public class TretGalAlphabetKeyboard {

    public static ReplyKeyboardMarkup createTretGalAlphabetKeyboard() {

        KeyboardRow row1 = new KeyboardRow();
        row1.add("А - Б");
        row1.add("В - Ж");

        KeyboardRow row2 = new KeyboardRow();
        row2.add("З - К");
        row2.add("Л - Н");
        row2.add("О - Р");

        KeyboardRow row3 = new KeyboardRow();
        row3.add("С - У");
        row3.add("Ф - Я");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row1, row2, row3));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }

}

package org.example.handler.serviceCommandHandler.replyKeyboards;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.Arrays;

import static org.example.handler.typesOfMuseumHandler.MuseumTypesConst.*;

public class MuseumKeyboard {

    public ReplyKeyboardMarkup createMuseumKeyboard() {

        KeyboardRow row1 = new KeyboardRow();
        row1.add(HERMITAGE);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(RUS_MUS);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(TRET_GAL);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row1, row2, row3));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }

}

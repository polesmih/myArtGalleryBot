package org.example.bot.settings;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;

import java.io.File;

public class Sender {

    public static SendMessage sendMessage (Long chatId, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId.toString());
        sendMessage.setText(text);
        return sendMessage;
    }

    public static SendPhoto sendPhoto(Long chatId, String path, String caption) {

        File img = new File(path);
        SendPhoto photo = new SendPhoto();
        photo.setChatId(chatId.toString());
        photo.setPhoto(new InputFile(img));
        photo.setCaption(caption);
        return photo;
    }

}

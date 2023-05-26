package org.example.handler.commandHandler;

import lombok.SneakyThrows;
import org.example.bot.settings.ConfigSettings;
import org.example.bot.settings.Sender;
import org.example.db.UserConnection;
import org.example.db.WriteUser;
import org.example.bot.settings.replyKeyboards.MuseumKeyboard;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;

import java.time.LocalDateTime;

//import static org.example.bot.settings.CommandConst.*;
import static org.example.bot.settings.MessagesConst.*;
import static org.example.bot.settings.enums.Command.*;

public class CommandSelectionHandler extends TelegramLongPollingBot {

    long chat_id;
    String message_text;
    private final static ConfigSettings settings = ConfigSettings.getInstance();


    @Override
    public String getBotUsername() {
        return settings.getUserName();
    }

    @Override
    public String getBotToken() {
        return settings.getToken();
    }

    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {
        update.getUpdateId();
        chat_id = update.getMessage().getChatId();
        message_text = update.getMessage().getText();

        Message message = update.getMessage();
        User from = message.getFrom();

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(update.getMessage().getChatId().toString());

        if (update.hasMessage() && update.getMessage().hasText()) {

            if (message_text.equals(START.getCommandType())) {
                execute(Sender.sendMessage(chat_id, "Привет, " + message.getFrom().getFirstName() + HELLO));

                sendMessage.setText(CHOOSE);
                sendMessage.setReplyMarkup(new MuseumKeyboard().createMuseumKeyboard());
                execute(sendMessage);

                WriteUser.writeUserIntoDb(LocalDateTime.now().withNano(0),
                        from.getId(), from.getFirstName(), from.getUserName());


            } else if (message_text.equals(KEY.getCommandType())) {
                sendMessage.setText(CHOOSE);
                sendMessage.setReplyMarkup(new MuseumKeyboard().createMuseumKeyboard());
                execute(sendMessage);


            } else if (message_text.equals(DONATE.getCommandType())) {
                execute(Sender.sendMessage(chat_id, DOG_SHELTER));


            } else if (message_text.equals(INFO.getCommandType())) {
                execute(Sender.sendMessage(chat_id,
                        VISIT + UserConnection.countOfVisits()));

            }

        }
    }

}

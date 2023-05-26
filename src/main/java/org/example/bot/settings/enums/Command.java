package org.example.bot.settings.enums;

import java.util.Arrays;
import java.util.stream.Stream;

public enum Command {

    START ("/start"),
    KEY ("/key"),
    DONATE ("/donate"),
    INFO ("/info");

    private final String commandType;


    Command(String commandType) {
        this.commandType = commandType;
    }

    public String getCommandType() {
        return commandType;
    }


}

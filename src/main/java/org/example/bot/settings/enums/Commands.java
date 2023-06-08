package org.example.bot.settings.enums;

public enum Commands {

    START ("/start"),
    KEY ("/key"),
    DONATE ("/donate"),
    INFO ("/info");

    private final String commandType;


    Commands(String commandType) {
        this.commandType = commandType;
    }

    public String getCommandType() {
        return commandType;
    }


}

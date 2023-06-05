package org.example.handler.commandHandler;

import java.util.HashSet;
import java.util.Set;

import static org.example.bot.settings.enums.Commands.*;

public class CommandTypes {

    public Set<String> types () {

        Set<String> types = new HashSet<String>();
        types.add(START.getCommandType());
        types.add(KEY.getCommandType());
        types.add(DONATE.getCommandType());
        types.add(INFO.getCommandType());

        return types;

    }


}

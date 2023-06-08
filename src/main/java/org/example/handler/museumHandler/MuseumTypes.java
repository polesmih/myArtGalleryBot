package org.example.handler.museumHandler;

import java.util.HashSet;
import java.util.Set;

import static org.example.bot.settings.enums.Museums.*;


public class MuseumTypes {

    public Set<String> types () {

        Set<String> types = new HashSet<String>();
        types.add(HERMITAGE.getMuseumType());
        types.add(RUS_MUS.getMuseumType());
        types.add(TRET_GAL.getMuseumType());

        return types;

    }


}

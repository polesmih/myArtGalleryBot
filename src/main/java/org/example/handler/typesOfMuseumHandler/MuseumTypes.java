package org.example.handler.typesOfMuseumHandler;

import java.util.HashSet;
import java.util.Set;

import static org.example.handler.typesOfMuseumHandler.MuseumTypesConst.*;

public class MuseumTypes {

    public Set<String> types () {

        Set<String> types = new HashSet<String>();
        types.add(HERMITAGE);
        types.add(RUS_MUS);
        types.add(TRET_GAL);

        return types;

    }


}

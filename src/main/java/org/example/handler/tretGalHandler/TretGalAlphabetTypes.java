package org.example.handler.tretGalHandler;

import java.util.HashSet;
import java.util.Set;

import static org.example.bot.settings.enums.AlphabetType.*;

public class TretGalAlphabetTypes {

    public Set<String> types() {

        Set<String> types = new HashSet<String>();
        types.add(A_B.getAbcType());
        types.add(V_G.getAbcType());
        types.add(Z_K.getAbcType());
        types.add(L_N.getAbcType());
        types.add(O_R.getAbcType());
        types.add(S_U.getAbcType());
        types.add(F_Y.getAbcType());

        return types;

    }

}

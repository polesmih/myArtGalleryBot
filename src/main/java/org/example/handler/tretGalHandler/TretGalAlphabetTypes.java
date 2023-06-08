package org.example.handler.tretGalHandler;

import java.util.HashSet;
import java.util.Set;

import static org.example.bot.settings.enums.AlphabetGroup.*;


public class TretGalAlphabetTypes {

    public Set<String> types() {

        Set<String> types = new HashSet<String>();
        types.add(A_B_TG.getAbcGroup());
        types.add(V_J_TG.getAbcGroup());
        types.add(Z_K_TG.getAbcGroup());
        types.add(L_N_TG.getAbcGroup());
        types.add(O_R_TG.getAbcGroup());
        types.add(S_U_TG.getAbcGroup());
        types.add(F_Y_TG.getAbcGroup());

        return types;

    }

}

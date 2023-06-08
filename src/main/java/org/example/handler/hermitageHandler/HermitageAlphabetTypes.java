package org.example.handler.hermitageHandler;

import java.util.HashSet;
import java.util.Set;

import static org.example.bot.settings.enums.AlphabetGroup.*;

public class HermitageAlphabetTypes {

    public Set<String> types () {

        Set<String> types = new HashSet<String>();
        types.add(A_B_ER.getAbcGroup());
        types.add(V_G_ER.getAbcGroup());
        types.add(D_K_ER.getAbcGroup());
        types.add(L_N_ER.getAbcGroup());
        types.add(P_R_ER.getAbcGroup());
        types.add(S_F_ER.getAbcGroup());
        types.add(H_Y_ER.getAbcGroup());

        return types;

    }

}

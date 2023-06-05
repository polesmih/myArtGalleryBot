package org.example.handler.rusMusHandler;

import java.util.HashSet;
import java.util.Set;

import static org.example.bot.settings.enums.AlphabetGroup.*;


public class RusMusAlphabetTypes {

    public Set<String> types () {

        Set<String> types = new HashSet<String>();
        types.add(A_V_RM.getAbcGroup());
        types.add(G_I_RM.getAbcGroup());
        types.add(K_L_RM.getAbcGroup());
        types.add(M_P_RM.getAbcGroup());
        types.add(R_T_RM.getAbcGroup());
        types.add(U_Y_RM.getAbcGroup());

        return types;

    }

}

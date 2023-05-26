package org.example.bot.settings.enums;

public enum AlphabetType {

    A_B("А - Б"),
    V_G("В - Ж"),
    Z_K("З - К"),
    L_N("Л - Н"),
    O_R("О - Р"),
    S_U("С - У"),
    F_Y("Ф - Я");


    private final String abcType;

    AlphabetType(String abcType) {
        this.abcType = abcType;
    }

    public String getAbcType() {
        return abcType;
    }

}

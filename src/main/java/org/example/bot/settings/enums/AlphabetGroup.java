package org.example.bot.settings.enums;

public enum AlphabetGroup {

    A_B_TG ("А-Б"),
    V_J_TG ("В-Ж"),
    Z_K_TG ("З-К"),
    L_N_TG ("Л-Н"),
    O_R_TG ("О-Р"),
    S_U_TG ("С-У"),
    F_Y_TG ("Ф-Я"),
    WEB_TG ("Сайт Третьяковки"),

    A_V_RM ("А-В"),
    G_I_RM ("Г-И"),
    K_L_RM ("К-Л"),
    M_P_RM ("М-П"),
    R_T_RM ("Р-Т"),
    U_Y_RM ("У-Я"),
    WEB_RM ("Сайт Русского музея"),

    A_B_ER ("А - Б"),
    V_G_ER ("В - Г"),
    D_K_ER ("Д - К"),
    L_N_ER ("Л - Н"),
    P_R_ER ("П - Р"),
    S_F_ER ("С - Ф"),
    H_Y_ER ("Х - Я"),
    WEB_HERM("Сайт Эрмитажа");

    private final String abcGroup;

    AlphabetGroup(String abcGroup) {
        this.abcGroup = abcGroup;
    }

    public String getAbcGroup() {
        return abcGroup;
    }

}

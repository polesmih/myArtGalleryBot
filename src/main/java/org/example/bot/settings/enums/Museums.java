package org.example.bot.settings.enums;

public enum Museums {

   HERMITAGE ("Эрмитаж,\nколлекция западноевропейской живописи"),
   RUS_MUS ("Русский музей"),
   TRET_GAL ("Третьяковская галерея");

    private final String museumType;


    Museums(String museumType) {
        this.museumType = museumType;
    }

    public String getMuseumType() {
        return museumType;
    }


}

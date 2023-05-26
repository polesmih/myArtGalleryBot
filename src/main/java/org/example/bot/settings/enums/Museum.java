package org.example.bot.settings.enums;

public enum Museum {

   HERMITAGE ("Эрмитаж,\nколлекция западноевропейской живописи"),
   RUS_MUS ("Русский музей"),
   TRET_GAL ("Третьяковская галерея");

    private final String museumType;


    Museum(String museumType) {
        this.museumType = museumType;
    }

    public String getMuseumType() {
        return museumType;
    }


}

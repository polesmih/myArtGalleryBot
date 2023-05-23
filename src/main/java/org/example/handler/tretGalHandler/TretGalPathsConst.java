package org.example.handler.tretGalHandler;

import org.example.bot.settings.ConfigSettings;

import static org.example.bot.settings.MessagesConst.MENU;

public class TretGalPathsConst {
    private final static ConfigSettings settings = ConfigSettings.getInstance();


    public final static String ROOT = settings.getPath() + "\\tretGal\\";
    public final static String ONE = ROOT + "Айвазовский Иван Радуга.jpg";
    public final static String TWO = ROOT + "Андреенков Владимир Портрет А. Шервинской.png";

}

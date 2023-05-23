package org.example.handler.rusMusHandler;

import org.example.bot.settings.ConfigSettings;

import static org.example.bot.settings.MessagesConst.MENU;

public class RusMusPathsConst {
    private final static ConfigSettings settings = ConfigSettings.getInstance();


    public final static String RM_MENU = MENU +
            " 36" + " - Абутков Н.Г. Зима. Петербургский вид 1859\n" +
           " 37" + " - Айвазовский И.К. Аул Гуниб в Дагестане 1869\n";


    public final static String ROOT = settings.getPath() + "\\rusMus\\";
    public final static String THIRTY_SIX = ROOT + "Абутков Н.Г. Зима. Петербургский вид 1859.jpg";
    public final static String THIRTY_SEVEN = ROOT + "Айвазовский И.К. Аул Гуниб в Дагестане 1869.jpg";

}

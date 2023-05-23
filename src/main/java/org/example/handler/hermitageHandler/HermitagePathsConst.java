package org.example.handler.hermitageHandler;

import org.example.bot.settings.ConfigSettings;

import static org.example.bot.settings.MessagesConst.MENU;

public class HermitagePathsConst {

    private final static ConfigSettings settings = ConfigSettings.getInstance();

    public final static String HG_MENU = MENU +
            " 12" + " - Бартель Беха. Мужской портрет XVI в.\n" +
            " 13" + " - Франс Поурбус старший. Женский портрет XVII в.\n";


    public final static String ROOT = settings.getPath() + "\\hermitage\\";
    public final static String TWELVE = ROOT + "Бартель Беха Мужской портрет XVI века.png";
    public final static String THIRTEEN = ROOT + "Франс Поурбус старший Женский портрет XVII века.png";


}

package org.example.bot.settings;

import static org.example.bot.settings.EmojiConst.*;

public class MessagesConst {

    public final static String HELLO = "! " + HI + "\nС помощью этого бота ты можешь погулять " +
            "по Русскому музею, Эрмитажу, Третьяковской галерее " +
            "и полюбоваться картинами некоторых художников.\nПриятного путешествия!";

    public final static String DOG_SHELTER = "Хочешь меня отблагодарить? -\n" +
            "помоги Фонду \"Помощь бездомным собакам\" " + DOG +
            "\"https://donate.priut.ru\"";

    public final static String CHOOSE = "Чтобы выбрать музей, воспользуйся клавиатурой " + DOWN;

    public final static String ABC = "Выбери заглавную букву фамилии художника " + DOWN;

    public final static String ART = "Чтобы увидеть картины, нажми на фамилию художника " + DOWN;


    public final static String VISIT = "Количество посещений " + VISIT_COUNT + " ";

    public final static String MENU = "А теперь просто отправь номер, " +
            "указанный рядом с картиной, чтобы ее увидеть:\n";

    public final static String UNKNOWN = "Неизвестный запрос... " + THINKING;

}

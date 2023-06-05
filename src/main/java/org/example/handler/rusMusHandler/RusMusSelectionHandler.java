package org.example.handler.rusMusHandler;

import lombok.SneakyThrows;
import org.example.bot.settings.ConfigSettings;
import org.example.bot.settings.Sender;
import org.example.handler.rusMusHandler.inlineKeyboards.*;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

import static org.example.bot.settings.enums.AlphabetGroup.*;
import static org.example.bot.settings.enums.artists.RusMusArtists.*;

public class RusMusSelectionHandler extends TelegramLongPollingBot {

    String message_text;
    private final static ConfigSettings settings = ConfigSettings.getInstance();
    public final static String ROOT = settings.getPath() + "\\rusMus\\";


    @Override
    public String getBotUsername() {
        return settings.getUserName();
    }

    @Override
    public String getBotToken() {
        return settings.getToken();
    }

    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();

            if (message_text.equals(A_V_RM.getAbcGroup())) {
                execute(RusMusInlineKeyboardAv.rusMusInlineKeyboardAv(chat_id));
            } else if (message_text.equals(G_I_RM.getAbcGroup())) {
                execute(RusMusInlineKeyboardGi.rusMusInlineKeyboardGi(chat_id));
            } else if (message_text.equals(K_L_RM.getAbcGroup())) {
                execute(RusMusInlineKeyboardKl.rusMusInlineKeyboardKl(chat_id));
            } else if (message_text.equals(M_P_RM.getAbcGroup())) {
                execute(RusMusInlineKeyboardMp.rusMusInlineKeyboardMp(chat_id));
            } else if (message_text.equals(R_T_RM.getAbcGroup())) {
                execute(RusMusInlineKeyboardRt.rusMusInlineKeyboardRt(chat_id));
            } else if (message_text.equals(U_Y_RM.getAbcGroup())) {
                execute(RusMusInlineKeyboardUy.rusMusInlineKeyboardUy(chat_id));
            }

        } else if (update.hasCallbackQuery()) {
            String call_data = update.getCallbackQuery().getData();
            long chat_id = update.getCallbackQuery().getMessage().getChatId();

            if (call_data.equals(R_ABUTKOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Абутков Н.Г. Зима. Петербургский вид 1859.jpg", "Абутков, Зима. Петербургский вид"));

            } else if (call_data.equals(R_AIVAZOVSKY.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Айвазовский И.К. Аул Гуниб в Дагестане 1869.jpg", "Айвазовский, Аул Гуниб в Дагестане"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Айвазовский И.К. Буря у мса Айя 1875.jpg", "Айвазовский, Буря у мса Айя"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Айвазовский И.К. Дворец дожей в Венеции при лунном освещении 1878.jpg", "Айвазовский, Дворец дожей в Венеции при лунном освещении"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Айвазовский И.К. Девятый вал 1850.jpg", "Айвазовский, Девятый вал"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Айвазовский И.К. Лунная ночь 1849.jpg", "Айвазовский, Лунная ночь"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Айвазовский И.К. Морской вид пр луне 1878.jpg", "Айвазовский, Морской вид при луне"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Айвазовский И.К. Морской пролив с маяком 1841.jpg", "Айвазовский, Морской пролив с маяком"));

            } else if (call_data.equals(R_ALTMAN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Альтман Н.И. Автопортрет 1911.jpg", "Альтман, Автопортрет"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Альтман Н.И. Подсолнухи 1915.jpg", "Альтман, Подсолнухи"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Альтман Н.И. Портрет А.А. Ахматовой 1915.jpg", "Альтман, Портрет А.А. Ахматовой"));

            } else if (call_data.equals(R_ANNENKOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Анненков Ю.П. Портрет танцовщицы Е.Б. Анненковой 1917.jpg", "Анненков, Портрет танцовщицы Е.Б. Анненковой"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Анненков Ю.П. Портрет фотографа-художника М.А. Шерлинга 1918.jpg", "Анненков, Портрет фотографа-художника М.А. Шерлинга"));

            } else if (call_data.equals(R_ARNAUTOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Арнаутов В.М. Завтрак рабочего 1929.jpg", "Арнаутов, Завтрак рабочего"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Арнаутов В.М. Зима. Сан-Франциско 1944.jpg", "Арнаутов, Зима. Сан-Франциско"));

            } else if (call_data.equals(R_ARCHIPOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Архипов А.Е. В гостях (В весенний праздник) 1915.jpg", "Архипов, В гостях (В весенний праздник)"));

            } else if (call_data.equals(R_BAKST.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Бакст Л.С. Автопортрет 1893.jpg", "Бакст, Автопортрет"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Бакст Л.С. Афиша для Базара кукол 1899.jpg", "Бакст, Афиша для Базара кукол"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Бакст Л.С. Портрет С.П. Дягилева с няней 1906.jpg", "Бакст, Портрет С.П. Дягилева с няней"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Бакст Л.С. Ужин 1902.jpg", "Бакст, Ужин"));

            } else if (call_data.equals(R_BASHKIRCEVA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Башкирцева М.К. Дождевой зонтик 1883.jpg", "Башкирцева, Дождевой зонтик"));

            } else if (call_data.equals(R_BELKIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Белкин А.П. Натюрморт с птицей 1995.jpg", "Белкин, Натюрморт с птицей"));

            } else if (call_data.equals(R_BENUA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Бенуа Н.А. Город 1916.jpg", "Бенуа, Город"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Бенуа Н.А. Фантастичесий пейзаж с фигурами 1916.jpg", "Бенуа, Фантастичесий пейзаж с фигурами"));

            } else if (call_data.equals(R_BILIBIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Билибин И.Я. Корабль 1926.jpg", "Билибин, Корабль"));

            } else if (call_data.equals(R_BOGDANOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Богданов-Бельский Н.П. Сочинение Около 1903.jpg", "Богданов-Бельский, Сочинение"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Богданов-Бельскиц Н.П. У дверей школы 1897.jpg", "Богданов-Бельскиц, У дверей школы"));

            } else if (call_data.equals(R_BOGOLUBOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Боголюбов А.П. Лунная ночь на море 1874.jpg", "Боголюбов, Лунная ночь на море"));

            } else if (call_data.equals(R_BODAREVSKY.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Бодаревский Н.К. Равноапостольная Мария Магдалина До 1900.jpg", "Бодаревский, Равноапостольная Мария Магдалина"));

            } else if (call_data.equals(R_BORISOV_MUSATOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Борисов-Мусатов В.Э. Деревце 1896-1898.jpg", "Борисов-Мусатов, Деревце"));

            } else if (call_data.equals(R_BRODSKY.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Бродский И.И. Серый день 1909.jpg", "Бродский, Серый день"));

            } else if (call_data.equals(R_BRONNIKOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Бронников Ф.А. Цыганская девочка 1851.jpg", "Бронников, Цыганская девочка"));

            } else if (call_data.equals(R_BRUNI.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Бруни Н.А. Святая великая княгиня Ольга 1901.jpg", "Бруни, Святая великая княгиня Ольга"));

            } else if (call_data.equals(R_BRULLOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Брюллов К.П. Итальянский полдень1827.jpg", "Брюллов, Итальянский полдень"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Брюллов К.П. Портрет сестер Шишмаревых 1839.jpg", "Брюллов, Портрет сестер Шишмаревых"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Брюллов К.П. Последний день Помпеи 1833.jpg", "Брюллов, Последний день Помпеи"));

            } else if (call_data.equals(R_VASNECOV_V.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Васнецов В.М. Акробаты (На празднике в окрестностях Парижа) 1877.jpg", "Васнецов В., Акробаты (На празднике в окрестностях Парижа)"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Васнецов В.М. Витязь на распутье 1882.jpg", "Васнецов В., Витязь на распутье"));

            } else if (call_data.equals(R_VENECIANOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Венецианов А.Г. Гадание на картах 1842.jpg", "Венецианов, Гадание на картах"));

            } else if (call_data.equals(R_VENIG.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Вениг К.Б. Русская девушка 1889.jpg", "Вениг, Русская девушка"));

            } else if (call_data.equals(R_VERECHAGIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин В.В. Близ Георгиевского монастыря. Крым конец 1880-х-1890-е.jpg", "Верещагин, Близ Георгиевского монастыря"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин В.В. В Иерусалиме. Царские гробницы 1884.jpg", "Верещагин, В Иерусалиме. Царские гробницы"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин В.В. Гора Казбек 1898.jpg", "Верещагин, Гора Казбек"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин В.В. Калмыцкий лама 1873.jpg", "Верещагин, Калмыцкий лама"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин В.В. Колоннада в джайнском храме на горе Абу (вечером) 1874-1876.jpg", "Верещагин, Колоннада в джайнском храме на горе Абу (вечером)"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин В.В. Ночь. Шакалы 1868-1870.jpg", "Верещагин, Ночь. Шакалы"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин В.В. Портрет мужчины в белой чалме 1867 (8).jpg", "Верещагин, Портрет мужчины в белой чалме"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин В.В. Прогулка в лодке 1903.jpg", "Верещагин, Прогулка в лодке"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин В.В. Удверей мечети 1873.jpg", "Верещагин, Удверей мечети"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин В.В. Японский священник 1903.jpg", "Верещагин, Японский священник"));

            } else if (call_data.equals(R_VRUBEL.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Врубель М.А. Тридцать три богатыря 1901.jpg", "Врубель, Тридцать три богатыря"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Врубель М.А. Шестикрылый Серафим 1904.jpg", "Врубель, Шестикрылый Серафим"));

            } else if (call_data.equals(R_GE.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Ге Н.Н. Перевозка мрамора в Карраре 1868.jpg", "Ге, Перевозка мрамора в Карраре"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Ге Н.Н. Петр I допрашивает царевича Алексея в Петергофе 1872.jpg", "Ге, Петр I допрашивает царевича Алексея в Петергофе"));

            } else if (call_data.equals(R_GINE.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Гине А.В. Перед грозой 1860.jpg", "Гине, Перед грозой"));

            } else if (call_data.equals(R_GONCHAROVA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Гончарова Н.С. Велосипедист 1913.jpg", "Гончарова, Велосипедист"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Гончарова Н.С. Зима 1911.jpg", "Гончарова, Зима"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Гончарова Н.С. Натюрморт с портретом и белой скатертью 1908-1909.jpg", "Гончарова, Натюрморт с портретом и белой скатертью"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Гончарова Н.С. Подсолнухи 1908.jpg", "Гончарова, Подсолнухи"));

            } else if (call_data.equals(R_GRABAR.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Грабарь И.Э. Роскошный иней 1941.jpg", "Грабарь, Роскошный иней"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Грабарь И.Э. Цветы и фрукты на рояле 1904.jpg", "Грабарь, Цветы и фрукты на рояле"));

            } else if (call_data.equals(R_GRIGOREV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Григорьев Б.Д. Девочка с бидоном (Утро в деревне) 1917.jpg", "Григорьев, Девочка с бидоном (Утро в деревне)"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Григорьев Б.Д. Крестьянская земля 1917.jpg", "Григорьев, Крестьянская земля"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Григорьев Б.Д. Портрет Мейерхольда 1916.jpg", "Григорьев, Портрет Мейерхольда"));

            } else if (call_data.equals(R_GUN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Гун К.Ф. Канун Варфоломеевской ночи 1868.jpg", "Гун, Канун Варфоломеевской ночи"));

            } else if (call_data.equals(R_DELAVOSKADOVSKAYA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Делла-Вос-Кардовская О.Л. Маленькая женщина 1910.jpg", "Делла-Вос-Кардовская, Маленькая женщина"));

            } else if (call_data.equals(R_DEMIDOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Демидов В.К. Царица Наталья Кирилловна с царевичем Петром на красном крыльце 1848.jpg", "Демидов, Царица Наталья Кирилловна с царевичем Петром на красном крыльце"));

            } else if (call_data.equals(R_DMITRIEV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Дмитриев-Оренбургский Н.Д. Пожар в деревне конец 1870-х.jpg", "Дмитриев-Оренбургский, Пожар в деревне"));

            } else if (call_data.equals(R_DOBUJINSKY.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Добужинский М.В. Автопортрет 1901.jpg", "Добужинский, Автопортрет"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Добужинский М.В. Петербург 1914.jpg", "Добужинский, Петербург"));

            } else if (call_data.equals(R_DREVIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Древин А.Д. Беженка 1916.jpg", "Древин, Беженка"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Древин А.Д. Ужин 1915.jpg", "Древин, Ужин"));

            } else if (call_data.equals(R_DUBOVSKY.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Дубовский Н.Н. Притихло 1890.jpg", "Дубовский, Притихло"));

            } else if (call_data.equals(R_JILINKY.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Жилинский Д.Д. Гимнасты СССР 1964-1965.jpg", "Жилинский, Гимнасты СССР"));

            } else if (call_data.equals(R_JUKOVSKY.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Жуковский С.Ю. Поэзия старого дворянского гнезда 1912.jpg", "Жуковский, Поэзия старого дворянского гнезда"));

            } else if (call_data.equals(R_JURAVLEV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Журавлев Ф.С. Дети-нищие 1860-е.jpg", "Журавлев, Дети-нищие"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Журавлев Ф.С. Перед венцом 1874.jpg", "Журавлев, Перед венцом"));

            } else if (call_data.equals(R_IVANOV_AA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Иванов А.А. Явление Христа народу 1836 - не ранее 1855.jpg", "Иванов А.А., Явление Христа народу"));

            } else if (call_data.equals(R_IVANOV_AM.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Иванов А.М. Дети, пускающие мыльные пузыри не позднее 1839.jpg", "Иванов А.М., Дети, пускающие мыльные пузыри"));

            } else if (call_data.equals(R_IVANOV_SP.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Иванов С.П. Портрет А.Н. Бенуа 1944.jpg", "Иванов С.П., Портрет А.Н. Бенуа"));

            } else if (call_data.equals(R_KALMAKOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Калмаков Н.К. Артемида и спящий Эндимион 1917.jpg", "Калмаков, Артемида и спящий Эндимион"));

            } else if (call_data.equals(R_KANDINSKY.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Кандинский В.В. Амазонка с голубыми львами 1918.jpg", "Кандинский, Амазонка с голубыми львами"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Кандинский В.В. Красная церковь Между 1901 и 1903.jpg", "Кандинский, Красная церковь"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Кандинский В.В. Река летом Между 1901 и 1903.jpg", "Кандинский, Река летом"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Кандинский В.В. святой Георгий (II) 1911.jpg", "Кандинский, святой Георгий"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Кандинский В.В. Синий гребень 1917.jpg", "Кандинский, Синий гребень"));

            } else if (call_data.equals(R_KASATKIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Касаткин Н.А. Осиротели 1891.jpg", "Касаткин, Осиротели"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Касаткин Н.А. Сбор угля бедными на выработанной шахте 1894.jpg", "Касаткин, Сбор угля бедными на выработанной шахте"));

            } else if (call_data.equals(R_KIVSHENKO.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Кившенко А.Д. Сортировка перьев 1891.jpg", "Кившенко, Сортировка перьев"));

            } else if (call_data.equals(R_KLEVER.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Клевер Ю.С.Ю. (старший) Окрестности Петербурга. Финский залив 1880.jpg", "Клевер, Окрестности Петербурга. Финский залив"));

            } else if (call_data.equals(R_KLODT.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Клодт фон Юргенсбург М.К. Долина реки Аа в Лифляндии 1862.jpg", "Клодт фон Юргенсбург, Долина реки Аа в Лифляндии"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Клодт фон Юргенсбург М.К. Морской вид 1890-е.jpg", "Клодт фон Юргенсбург, Морской вид"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Клодт фон Юргенсбург М.К. На Волге 1880.jpg", "Клодт фон Юргенсбург, На Волге"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Клодт фон Юргенсбург М.К. Стадо у реки в полдень 1869.jpg", "Клодт фон Юргенсбург, Стадо у реки в полдень"));

            } else if (call_data.equals(R_KLUN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Клюн И.В. Граммофон 1914.jpg", "Клюн, Граммофон"));

            } else if (call_data.equals(R_KOROVIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Коровин К.А., Клодт Н.А. Птицы 1899.jpg", "Коровин, Клодт Н.А., Птицы"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Коровин К.А. Сирень 1915.jpg", "Коровин, Сирень"));

            } else if (call_data.equals(R_KOSHELEV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Кошелев Н.А. Дети, катающие пасхальные яйца 1855.jpg", "Кошелев, Дети, катающие пасхальные яйца"));

            } else if (call_data.equals(R_KRACHKOVSKY.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Крачковский И.Е. Перед грозой 1886.jpg", "Крачковский, Перед грозой"));

            } else if (call_data.equals(R_KRYJICKY.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Крыжицкий К.Я. Дорога в горах 1897.jpg", "Крыжицкий, Дорога в горах"));

            } else if (call_data.equals(R_KUZNECOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Кузнецов П.В. Продавец птиц 1909.jpg", "Кузнецов, Продавец птиц"));

            } else if (call_data.equals(R_KUINDJI.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Куинджи А.И. Ай-Петри. Крым 1890-е.jpg", "Куинджи, Ай-Петри. Крым"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Куинджи А.И. Березовая роща 1879.jpg", "Куинджи, Березовая роща"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Куинджи А.И. Днепр Начало 1900-х.jpg", "Куинджи, Днепр"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Куинджи А.И. Ладожское озеро 1873.jpg", "Куинджи, Ладожское озеро"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Куинджи А.И. Лунная ночь на Днепре 1880.jpg", "Куинджи, Лунная ночь на Днепре"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Куинджи А.И. Осенняя распутица 1872.jpg", "Куинджи, Осенняя распутица"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Куинджи А.И. Прибой в дожливый день 1890-е.jpg", "Куинджи, Прибой в дожливый день"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Куинджи А.И. Прозрачная вода. Крым Между 1876 и 1890.jpg", "Куинджи, Прозрачная вода. Крым"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Куинджи А.И. Радуга 1900-1905.jpg", "Куинджи, Радуга"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Куинджи А.И. Солнечные пятна на инее 1876-1890.jpg", "Куинджи, Солнечные пятна на инее"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Куинджи А.И. Сосновый лес с речкой 1878.jpg", "Куинджи, Сосновый лес с речкой"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Куинджи А.И. Узун-Таш. Крым 1887.jpg", "Куинджи, Узун-Таш. Крым"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Куинджи И.И. Вечер на Украине 1878-1901.jpg", "Куинджи, Вечер на Украине"));

            } else if (call_data.equals(R_KUSTODIEV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Кустодиев Б.М. Иней 1917.jpg", "Кустодиев, Иней"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Кустодиев Б.М. Купчиха за чаем 1918.jpg", "Кустодиев, Купчиха за чаем"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Кустодиев Б.М. Купчиха 1915.jpg", "Кустодиев, Купчиха"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Кустодиев Б.М. Портрет Ренэ Нотгафт 1914.jpg", "Кустодиев, Портрет Ренэ Нотгафт"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Кустодиев Б.М. Портрет Ф.И. Шаляпина 1922.jpg", "Кустодиев, Портрет Ф.И. Шаляпина"));

            } else if (call_data.equals(R_LAPCHENKO.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Лапченко Г.И. Сусанна и старцы 1831.jpg", "Лапченко, Сусанна и старцы"));

            } else if (call_data.equals(R_LARIONOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Ларионов М.Ф. Акации весной 1904.jpg", "Ларионов, Акации весной"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Ларионов М.Ф. Венера 1912.jpg", "Ларионов, Венера"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Ларионов М.Ф. Весенний сад 1904.jpg", "Ларионов, Весенний сад"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Ларионов М.Ф. Парикмахер 1907.jpg", "Ларионов, Парикмахер"));

            } else if (call_data.equals(R_LEBEDEV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Лебедев В.В. катька 1918.jpg", "Лебедев, катька"));

            } else if (call_data.equals(R_LEVITAN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Левитан И.И. Долина реки. Осень 1896.jpg", "Левитан, Долина реки. Осень"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Левитан И.И. Заросший пруд 1887.jpg", "Левитан, Заросший пруд"));

            } else if (call_data.equals(R_LEMOH.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Лемох К.В. Новое знакомство 1885.jpg", "Лемох, Новое знакомство"));

            } else if (call_data.equals(R_LENTULOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Лентулов А.В. Монастырь Начало 1910-х (1917).jpg", "Лентулов, Монастырь"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Лентулов А.В. Портрет А.Я. Таирова 1918-1919.jpg", "Лентулов, Портрет А.Я. Таирова"));

            } else if (call_data.equals(R_MAKOVSKY_VE.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Маковский В.Е. Ссора из-за карт 1889.jpg", "Маковский В., Ссора из-за карт"));

            } else if (call_data.equals(R_MAKOVSKY_KE.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Маковский К.Е. Жница 1871.jpg", "Маковский К., Жница"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Маковский К.Е. Селедочница 1867.jpg", "Маковский К., Селедочница"));

            } else if (call_data.equals(R_MAKSIMOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Максимов В.М. Семейный раздел третья четверть 19 века.jpg", "Максимов, Семейный раздел"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Максимов В.М. Слепой хозяин 1884.jpg", "Максимов, Слепой хозяин"));

            } else if (call_data.equals(R_MALEVICH.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Малевич К.С. Авиатор 1914.jpg", "Малевич, Авиатор"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Малевич К.С. Девушки в поле 1928-1929.jpg", "Малевич, Девушки в полеg"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Малевич К.С. Композиция с Джокондой (Частичное затмение) 1914.jpg", "Малевич, Композиция с Джокондой (Частичное затмение)"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Малевич К.С. Красный квадрат (Живописный реализм крестьянки в двух измерениях) 1915.jpg", "Малевич, Красный квадрат (Живописный реализм крестьянки в двух измерениях)"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Малевич К.С. Отдых (Общество в цилиндрах) 1908.jpg", "Малевич, Отдых (Общество в цилиндрах)"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Малевич К.С. Портет Ивана Васильевича Клюна (Усовершенствованный портрет Клюна (Строитель) 1913.jpg", "Малевич, Портет Ивана Васильевича Клюна (Усовершенствованный портрет Клюна (Строитель)"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Малевич К.С. Черный квадрат Около 1923.jpg", "Малевич, Черный квадрат"));

            } else if (call_data.equals(R_MALUTIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Малютин С.В. Портрет Веры Сергеевны Малютиной 1909.jpg", "Малютин, Портрет Веры Сергеевны Малютиной"));

            } else if (call_data.equals(R_MALAVIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Малявин Ф.А. Бабы 1905.jpg", "Малявин, Бабы"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Малявин Ф.А. Верка 1913.jpg", "Малявин, Верка"));

            } else if (call_data.equals(R_MASHKOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Машков И.И. Дама с контрабасом 1915.jpg", "Машков, Дама с контрабасом"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Машков И.И. Натюрморт с ананасом 1908.jpg", "Машков, Натюрморт с ананасом"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Машков И.И. Натюрморт с маками и васильками 1912-1913.jpg", "Машков, Натюрморт с маками и васильками"));

            } else if (call_data.equals(R_MOSHIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Мошин С. Портрет женщины в старинном костюме 1863.jpg", "Мошин, Портрет женщины в старинном костюме"));

            } else if (call_data.equals(R_MYLNIKOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Мыльников А.А. Верочка. портрет дочери 1955.jpg", "Мыльников, Верочка. портрет дочери"));

            } else if (call_data.equals(R_NESTEROV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Нестеров М.В. Великиц постриг 1898.jpg", "Нестеров, Великиц постриг"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Нестеров М.В. Девочка Середина 1890-х.jpg", "Нестеров, Девочка"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Нестеров М.В. Думы 1900.jpg", "Нестеров, Думы"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Нестеров М.В. За приворотным зельем 1887-1888.jpg", "Нестеров, За приворотным зельем"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Нестеров М.В. Отец Геннадий 1888.jpg", "Нестеров, Отец Геннадий"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Нестеров М.В. Портрет О.М. Нестервой  (Амазонка) 1906.jpg", "Нестеров, Портрет О.М. Нестервой (Амазонка)"));

            } else if (call_data.equals(R_PAKULIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Пакулин В.В. Белый натюрморт Начало 1920-х.jpg", "Пакулин, Белый натюрморт"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Пакулин в.В. Смена (Героический реализм) 1925.jpg", "Пакулин, Смена (Героический реализм)"));

            } else if (call_data.equals(R_PASTERNAK.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Пастернак Л.О. Лев Толстой с семьей в Ясной Поляне 1902.jpg", "Пастернак, Лев Толстой с семьей в Ясной Поляне"));

            } else if (call_data.equals(R_PEROV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Перов В.Г. Гитарист-бобыль 1865.jpg", "Перов, Гитарист-бобыль"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Перов В.Г. Голова киргиза-каторжника 1873.jpg", "Перов, Голова киргиза-каторжника"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Перов В.Г. Дети-сироты на кладбище 1864.jpg", "Перов, Дети-сироты на кладбище"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Перов В.Г. Охотники на привале.jpg", "Перов, Охотники на привале"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Перов В.Г. Приезд институтки к слепому отцу конец 1860-х или 1870-е.jpg", "Перов, Приезд институтки к слепому отцу"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Перов В.Г. Трапеза 1865-1876.jpg", "Перов, Трапеза"));

            } else if (call_data.equals(R_PESTINSKY.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Пестинский Б.В. Бобо Мурат -торговец водой 1933.jpg", "Пестинский Б.В. Бобо Мурат -торговец водой 1933.jpg"));

            } else if (call_data.equals(R_PETROV_VODKIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Петров -Водкин К.С. Утренний натюрморт 1918.jpg", "Петров -Водкин, Утренний натюрморт"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Петров-Водкин К.С. Жаждущий воин 1915.jpg", "Петров-Водкин, Жаждущий воин"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Петров-Водкин К.С. Кафе 1907 (8).jpg", "Петров-Водкин, Кафе"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Петров-Водкин К.С. Мать 1915.jpg", "Петров-Водкин, Мать"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Петров-Водкин К.С. Портрет А.А. Ахматовой 1922.jpg", "Петров-Водкин, Портрет А.А. Ахматовой"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Петров-Водкин К.С. Селедка 1918.jpg", "Петров-Водкин, Селедка"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Петров-Водкин К.С. Смерть комиссара 1928.jpg", "Петров-Водкин, Смерть комиссара"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Петров-Водкин К.С. Сон 1910.jpg", "Петров-Водкин, Сон"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Петров-Водкин К.С. Умиление злых сердец 1914-1915.jpg", "Петров-Водкин, Умиление злых сердец"));

            } else if (call_data.equals(R_PLASTOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Пластов А.А. Юность (Отдых) 1954.jpg", "Пластов, Юность (Отдых)"));

            } else if (call_data.equals(R_POLENOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Поленов В.Д. В парке. Местечко Вель в Нормандии 1874.jpg", "Поленов, В парке. Местечко Вель в Нормандии "));
                execute(Sender.sendPhoto(chat_id, ROOT + "Поленов В.Д. Заросший пруд 1880.jpg", "Поленов, Заросший пруд"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Поленов В.Д. Мечты (на горе) 1890-1900-е.jpg", "Поленов, Мечты (на горе)"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Поленов В.Д. Московский дворик 1902.jpg", "Поленов, Московский дворик"));

            } else if (call_data.equals(R_POPOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Попов (Московский) А.П. Москва. Берег Яузы 1860.jpg", "Попов (Московский), Москва. Берег Яузы"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Попов А. Утро в деревне 1861.jpg", "Попов (Московский), Утро в деревне"));

            } else if (call_data.equals(R_POPOVA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Попова Л.С. Портрет философа 1915.jpg", "Попова, Портрет философа"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Попова Л.С. Человек+воздух+пространство 1913.jpg", "Попова, Человек+воздух+пространство"));

            } else if (call_data.equals(R_PUNI.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Пуни И.А. Портрет жены художника 1914.jpg", "Пуни, Портрет жены художника"));

            } else if (call_data.equals(R_RAEV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Раев В.Е. Блаженный Алипий, иконописец Печерский 1848.jpg", "Раев, Блаженный Алипий, иконописец Печерский"));

            } else if (call_data.equals(R_REITERN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Рейтерн Е.Р. Двор в усадьбе зимой 1840-е.jpg", "Рейтерн, Двор в усадьбе зимой"));

            } else if (call_data.equals(R_REPIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Репин И.Е. Бурлаки на Волге 1870-1873.jpg", "Репин, Бурлаки на Волге"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Репин И.Е. Головы мужчин 1873-1875.jpg", "Репин, Головы мужчин"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Репин И.Е. Запорожцы 1880-1891.jpg", "Репин, Запорожцы"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Репин И.Е. Крестный ход 1877.jpg", "Репин, Крестный ход"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Репин И.Е. Негритянка конец 1875-начало 1876.jpg", "Репин, Негритянка"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Репин И.Е. Портрет Н.В. Стасовой 1884.jpg", "Репин, Портрет Н.В. Стасовой"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Репин И.Е. Портрет трудовика 1907.jpg", "Репин, Портрет трудовика"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Репин И.Е. Портрет художник Архипа Ивановича Куинджи 1877.jpg", "Репин, Портрет художника Архипа Ивановича Куинджи"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Репин И.Е. Приготовление к экзамену 1864.jpg", "Репин, Приготовление к экзамену"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Репин И.Е. Юбилейный обед 1893.jpg", "Репин, Юбилейный обед"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Репин И.Е. Яблоки и листья 1879.jpg", "Репин, Яблоки и листья"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Репин И.Е. Яблоки и листья 1879.jpg", "Репин, Яблоки и листья"));

            } else if (call_data.equals(R_RERIH.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Рерих Н.К. В монастыре 1914.jpg", "Рерих, В монастыре"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Рерих Н.К. Гималаи.Ракопоши 1933.jpg", "Рерих, Гималаи.Ракопоши"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Рерих Н.К. Дед Мороз 1912.jpg", "Рерих, Дед Мороз"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Рерих Н.К. Идолы 1901.jpg", "Рерих, Идолы"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Рерих Н.К. Иноземные гости 1901.jpg", "Рерих, Иноземные гости"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Рерих Н.К. Нанда-Деви 1941.jpg", "Рерих, Нанда-Деви"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Рерих Н.К. небесный бой 1912.jpg", "Рерих, Небесный бой"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Рерих Н.К. Снегурочка 1912.jpg", "Рерих, Снегурочка"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Рерих Н.К. Успенская Пароменская церковь в Пскове 1900-х.jpg", "Рерих, Успенская Пароменская церковь в Пскове"));

            } else if (call_data.equals(R_ROZANOVA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Розанова О.В. Беспредметная композиция Около 1916.jpg", "Розанова, Беспредметная композиция"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Розанова О.В. Кубистическая композиция с фруктом 1914-1915.jpg", "Розанова, Кубистическая композиция с фруктом"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Розанова О.В. Письменный стол 1916.jpg", "Розанова, Письменный стол"));

            } else if (call_data.equals(R_RUSAKOVA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Русакова А.И. Блокадный интерьер 1942.jpg", "Русакова, Блокадный интерьер"));

            } else if (call_data.equals(R_RUTKOVSKY.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Рутковский Н.Х. За водой 1942.jpg", "Рутковский, За водой"));

            } else if (call_data.equals(R_RYLOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Рылов А.А. Над буйным прибоем 1918.jpg", "Рылов, Над буйным прибоем"));

            } else if (call_data.equals(R_RYABUSHKIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Рябушкин А.П. Московская девушка 17 века 1903.jpg", "Рябушкин, Московская девушка 17 века"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Рябушкин А.П. Московская улица 17 века в праздничный день 1895.jpg", "Рябушкин, Московская улица 17 века в праздничный день"));

            } else if (call_data.equals(R_RYANGINA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Рянгина С.В. Жена 1929.jpg", "Рянгина, Жена"));

            } else if (call_data.equals(R_SAVRASOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Саврасов А.К. Весенний вечер. Ольха цветет 1880-е.jpg", "Саврасов, Весенний вечер. Ольха цветет"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Саврасов А.К. Закат над болотом 1871.jpg", "Саврасов, Закат над болотом"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Саврасов А.К. Зима конец 1870-х -начало 1880-х.jpg", "Саврасов, Зима"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Саврасов А.К. Оттепель. Ярославль 1874.jpg", "Саврасов, Оттепель. Ярославль"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Саврасов А.К. Ранняя весна. Половодье 1868.jpg", "Саврасов, Ранняя весна. Половодье"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Саврасов А.К. Ранняя весна 1880-е-1890-е.jpg", "Саврасов, Ранняя весна"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Саврасов А.К. Степь днем 1852.jpg", "Саврасов, Степь днем"));

            } else if (call_data.equals(R_SAMOHVALOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Самохвалов А.Н. Кондукторша 1928.jpg", "Самохвалов, Кондукторша"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Самохвалов А.Н. На стадионе 1934-1935.jpg", "Самохвалов, На стадионе"));

            } else if (call_data.equals(R_SAPUNOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Сапунов Н.Н. Карусель 1908.jpg", "Сапунов, Карусель"));

            } else if (call_data.equals(R_SARYAN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Сарьян М.С. (С.) Египетские женщины 1912.jpg", "Сарьян, Египетские женщины"));

            } else if (call_data.equals(R_SVETOSLAVSKY.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Светославский С.И. Осень 1892.jpg", "Светославский, Осень"));

            } else if (call_data.equals(R_SEREBRAKOVA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Серебрякова З.Е. Автопортрет 1922.jpg", "Серебрякова, Автопортрет"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Серебрякова З.Е. Балетная уборная. Снежинки (балет П.И. Чайковского Щелкунчик) 1923.jpg", "Серебрякова, Балетная уборная. Снежинки (балет П.И. Чайковского Щелкунчик)"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Серебрякова З.Е. Баня 1913.jpg", "Серебрякова, Баня"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Серебрякова З.Е. Две крестьянские девушки около 1915.jpg", "Серебрякова, Две крестьянские девушки"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Серебрякова З.Е. Карточный домик 1919.jpg", "Серебрякова, Карточный домик"));

            } else if (call_data.equals(R_SEROV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Серов В.А. Зимой 1898.jpg", "Серов, Зимой"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Серов В.А. Купание лошади  1905.jpg", "Серов, Купание лошади"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Серов В.А. Портрет великой княжны Ольги Александровны в детстве 1893.jpg", "Серов, Портрет великой княжны Ольги Александровны в детстве"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Серов В.А. Портрет Иды Рубинштейн 1910.jpg", "Серов, Портрет Иды Рубинштейн"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Серов В.А. Портрет княгини З.Н. Юсуповой 1902.jpg", "Серов, Портрет княгини З.Н. Юсуповой"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Серов В.А. Портрет княгини ольги Орловой 1911.jpg", "Серов, Портрет княгини ольги Орловой"));

            } else if (call_data.equals(R_SKOTTI.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Скотти М.И. Пять братьев Бенуа 1847.jpg", "Скотти, Пять братьев Бенуа"));

            } else if (call_data.equals(R_SOMOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Сомов К.А. Зима. Каток 1915.jpg", "Сомов, Зима. Каток"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Сомов К.А. Осмеянный поцелуй 1908.jpg", "Сомов, Осмеянный поцелуй"));

            } else if (call_data.equals(R_SURIKOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Суриков В.И. Степан Разин 1906 (частично переписана в 1910).jpg", "Суриков, Степан Разин"));

            } else if (call_data.equals(R_TATLIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Татлин В.Е. Натурщица 1913.jpg", "Татлин, Натурщица"));

            } else if (call_data.equals(R_TOROPOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Торопов Ф.Г. Семейный портрет 1848.jpg", "Торопов, Семейный портрет"));

            } else if (call_data.equals(R_TROPININ.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Тропинин В.А. Девочка с куклой 1841.jpg", "Тропинин, Девочка с куклой"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Тропинин В.А. Портрет писательницы В.И. Лизогуб 1847.jpg", "Тропинин, Портрет писательницы В.И. Лизогуб"));

            } else if (call_data.equals(R_UDALCOVA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Удальцова Н.А. Натурщица 1914.jpg", "Удальцова, Натурщица"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Удальцова Н.А. Ресторан 1915.jpg", "Удальцова, Ресторан"));

            } else if (call_data.equals(R_FEDOTOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Федотов П.А. Вдовушка 1850-1852.jpg", "Федотов, Вдовушка"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Федотов П.А. Портрет Н.П. Жданович за фортепиано 1849.jpg", "Федотов, Портрет Н.П. Жданович за фортепиано"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Федотов П.А. Сватовство майора около 1851.jpg", "Федотов, Сватовство майора"));

            } else if (call_data.equals(R_FEKLISTOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Феклистов В.Е. Приготовление к венцу 1848.jpg", "Феклистов, Приготовление к венцу"));

            } else if (call_data.equals(R_FILONOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Филонов П.Н. Германская война 1915.jpg", "Филонов, Германская война"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Филонов П.Н. Голова (I) 1930-е.jpg", "Филонов, Голова (I)"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Филонов П.Н. Две девочка 1915.jpg", "Филонов, Две девочки"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Филонов П.Н. За столом 1912-1913.jpg", "Филонов, За столом"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Филонов П.Н. Кому нечего терять 1911-1912.jpg", "Филонов, Кому нечего терять"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Филонов П.Н. Крестьянская семья (Святое семейство) 1914.jpg", "Филонов, Крестьянская семья (Святое семейство)"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Филонов П.Н. Масленица и вывод из зимы в лето 1913-1914.jpg", "Филонов, Масленица и вывод из зимы в лето"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Филонов П.Н. Мужчина и женщина 1912-1913.jpg", "Филонов, Мужчина и женщина"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Филонов П.Н. Перерождение интеллигента (переождение человека) 1914-1915.jpg", "Филонов, Перерождение интеллигента (переождение человека)"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Филонов П.Н. Пир королей 1912-1913.jpg", "Филонов, Пир королей"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Филонов П.Н. Портрет певицы Е.Н. Глебовой 1915.jpg", "Филонов, Портрет певицы Е.Н. Глебовой"));

            } else if (call_data.equals(R_FLAVICKY.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Флавицкий К.Д. Голова княжны Таракановой.jpg", "Флавицкий, Голова княжны Таракановой"));

            } else if (call_data.equals(R_FRENC.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Френц р.Р. Клятва 1924.jpg", "Френц, Клятва"));

            } else if (call_data.equals(R_HARLAMOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Харламов А.А, Девочка-итальянка 1874.jpg", "Харламов, Девочка-итальянка"));

            } else if (call_data.equals(R_CHERNECOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Чернецов Г.Г. Вид Сюкеевских гор на Волге в Казанской губернии 1840.jpg", "Чернецов, Вид Сюкеевских гор на Волге в Казанской губернии"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Чернецов Г.Г. Мертвое море 1850.jpg", "Чернецов, Мертвое море"));

            } else if (call_data.equals(R_CHERNYSHEV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Чернышев Н.М. Верба распустилась 1926.jpg", "Чернышев, Верба распустилась"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Чернышев Н.М. Пионерки на берегу 1925.jpg", "Чернышев, Пионерки на берегу"));

            } else if (call_data.equals(R_SHAGAL.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Шагал М.З. Красный еврей 1915.jpg", "Шагал, Красный еврей"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Шагал М.З. Лавка в Витебске 1914.jpg", "Шагал, Лавка в Витебске"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Шагал М.З. Отец и бабушка 1914.jpg", "Шагал, Отец и бабушка"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Шагал М.З. Прогулка 1917.jpg", "Шагал, Прогулка"));

            } else if (call_data.equals(R_SHEVCHENKO.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Шевченко А.В. Завтрак 1916.jpg", "Шевченко, Завтрак"));

            } else if (call_data.equals(R_SHISHKIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Шишкин И.И. Буковый лес в Швейцарии 1863.jpg", "Шишкин, Буковый лес в Швейцарии"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Шишкин И.И. В роще 1865.jpg", "Шишкин, В роще"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Шишкин И.И. Дубы 1865.jpg", "Шишкин, Дубы"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Шишкин И.И. Из окрестностей Гурзуфа 1879.jpg", "Шишкин, Из окрестностей Гурзуфа"));

            } else if (call_data.equals(R_SHTERNBERG.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Штеренберг Д.П. Натюрморт с вишнями 1919.jpg", "Штеренберг, Натюрморт с вишнями"));

            } else if (call_data.equals(R_EKSTER.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Экстер А.А. Город ночью 1913.jpg", "Экстер, Город ночью"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Экстер А.А. Натюрморт с яйцами 1914.jpg", "Экстер, Натюрморт с яйцами"));

            } else if (call_data.equals(R_UON.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Юон К.Ф. Весенний солнечный день. Сергиев посад 1910.jpg", "Юон, Весенний солнечный день. Сергиев посад"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Юон К.Ф. Комсомолки. Подмосковный молодняк 1926.jpg", "Юон, Комсомолки. Подмосковный молодняк"));

            } else if (call_data.equals(R_YAKOBI.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Якоби (Якобий) В.И. Ледяной дом 1878.jpg", "Якоби (Якобий), Ледяной дом"));

            } else if (call_data.equals(R_YAKOVLEV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Яковлев А.Е. Портрет Р. Монтенегро 1915.jpg", "Яковлев, Портрет Р. Монтенегро"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Яковлев А.Е. Скрипач 1915.jpg", "Яковлев, Скрипач"));

            } else if (call_data.equals(R_YAROSHENKO.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Ярошенко Н.А. В теплых краях 1890.jpg", "Ярошенко, В теплых краях"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Ярошенко Н.А. Курсистка 1880.jpg", "Ярошенко, Курсистка"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Ярошенко Н.А. Эльбрус в облаках 1894.jpg", "Ярошенко, Эльбрус в облаках"));

            } else if (call_data.equals(WEB_RM.toString())) {
                execute(Sender.sendMessage(chat_id, ""));

            }
        }
    }

}

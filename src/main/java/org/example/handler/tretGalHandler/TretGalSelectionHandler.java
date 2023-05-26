package org.example.handler.tretGalHandler;

import lombok.SneakyThrows;
import org.example.bot.settings.ConfigSettings;
import org.example.bot.settings.Sender;
import org.example.handler.tretGalHandler.inlineKeyboards.*;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

import static org.example.bot.settings.enums.AlphabetType.*;
import static org.example.bot.settings.enums.TretGalArtists.*;

public class TretGalSelectionHandler extends TelegramLongPollingBot {

    String message_text;
    private final static ConfigSettings settings = ConfigSettings.getInstance();
    public final static String ROOT = settings.getPath() + "\\tretGal\\";


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

            if (message_text.equals(A_B.getAbcType())) {
                execute(TretGalInlineKeyboardAb.tretGalInlineKeyboardAb(chat_id));
            } else if (message_text.equals(V_G.getAbcType())) {
                execute(TretGalInlineKeyboardVj.tretGalInlineKeyboardVj(chat_id));
            } else if (message_text.equals(Z_K.getAbcType())) {
                    execute(TretGalInlineKeyboardZk.tretGalInlineKeyboardZk(chat_id));
            } else if (message_text.equals(L_N.getAbcType())) {
                    execute(TretGalInlineKeyboardLn.tretGalInlineKeyboardLn(chat_id));
            } else if (message_text.equals(O_R.getAbcType())) {
                    execute(TretGalInlineKeyboardOr.tretGalInlineKeyboardOr(chat_id));
            } else if (message_text.equals(S_U.getAbcType())) {
                execute(TretGalInlineKeyboardSu.tretGalInlineKeyboardSu(chat_id));
            } else if (message_text.equals(F_Y.getAbcType())) {
                execute(TretGalInlineKeyboardFy.tretGalInlineKeyboardFy(chat_id));

            }

        } else if (update.hasCallbackQuery()) {
            String call_data = update.getCallbackQuery().getData();
            long chat_id = update.getCallbackQuery().getMessage().getChatId();

            if (call_data.equals(AIVAZOVSKY.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Айвазовский Иван Радуга.jpg", "Айвазовский, Радуга"));

            } else if (call_data.equals(ANDREENKOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Андреенков Владимир Портрет А. Шервинской.png", "Андреенков, Портрет А. Шервинской"));

            } else if (call_data.equals(ARCHIPOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Архипов Абрам Крестьянка в зеленом фартуке.jpg", "Архипов, Крестьянка в зеленом фартуке"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Архипов Абрам Прачки.jpg", "Архипов, Прачки"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Архипов Абрам Северная деревня.jpg", "Архипов, Северная деревня"));

            } else if (call_data.equals(BAKST.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Бакст Лев Нос в Гостином дворе.jpg", "Бакст, Нос в Гостином дворе"));

            } else if (call_data.equals(BASYROV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Басыров Гариф Лист № 9 Из серии Миниатюры. Архаика.jpg", "Басыро, Лист № 9 Из серии Миниатюры. Архаика"));

            } else if (call_data.equals(BESIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Безин Иван Двор на Чкаловской. Зимнее солнце.png", "Безин, Двор на Чкаловской. Зимнее солнце"));

            } else if (call_data.equals(BELASHOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Белашов Александр Лосенок.jpg", "Белашов, Лосенок"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Белашов Александр Медведица с медвежонком.jpg", "Белашов, Медведица с медвежонком"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Белашов Александр Самка с детенышем. Лежбище моржей.jpg", "Белашов, Самка с детенышем. Лежбище моржей"));

            } else if (call_data.equals(BERINGOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Берингов Митрофан В стране полуночного солнца.jpg", "Берингов, В стране полуночного солнца"));

            } else if (call_data.equals(BOGDANOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Богданов-Бельский Николай Устный счет. В народной школе С.А. Рачинского.jpg", "Богданов-Бельский, Устный счет. В народной школе С.А. Рачинского"));

            } else if (call_data.equals(BORISOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Борисов Александр Баржа. Северная Двина.jpg", "Борисов, Баржа. Северная Двина"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Борисов Александр Мальчик-ненец. Маточкин Шар. Новая Земля.jpg", "Борисов, Мальчик-ненец. Маточкин Шар. Новая Земля"));

            } else if (call_data.equals(BORISOV_MUSATOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Борисов-Мусатов Виктор Изумрудное ожерелье.png", "Борисов-Мусатов, Изумрудное ожерелье"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Борисов-Мусатов Виктор Куст орешника.png", "Борисов-Мусатов, Куст орешника"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Борисов-Мусатов Виктор Луннная ночь. Открытое окно.jpg", "Борисов-Мусатов, Луннная ночь. Открытое окно"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Борисов-Мусатов Виктор Портрет дамы.png", "Борисов-Мусатов, Портрет дамы"));

            } else if (call_data.equals(BOROVIKOVSKY.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Боровиковский Владимир Портрет М.И. Лопухиной.jpg", "Боровиковский, Портрет М.И. Лопухиной"));

            } else if (call_data.equals(BOCHAROV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Бочаров Михаил Вид в Римской Кампанье.jpg", "Бочаров, Вид в Римской Кампанье"));

            } else if (call_data.equals(BRAZ.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Браз Иосиф (Осип Хайм-Иосель) Портрет писателя Антона Павловича Чехова.png", "Браз (Осип Хайм-Иосель), Портрет писателя Антона Павловича Чехова"));

            } else if (call_data.equals(BRODSKY.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Бродский Исаак Опавшие листья.jpg", "Бродский, Опавшие листья"));

            } else if (call_data.equals(BRULLOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Брюллов Карл Автопортрет.png", "Брюллов, Автопортрет"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Брюллов Карл Всадница.jpg", "Брюллов, Всадница"));

            } else if (call_data.equals(VASILEV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Васильев Федор Оттепель.jpg", "Васильев, Оттепель"));

            } else if (call_data.equals(VASNECOV_A.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Васнецов Аполлинарий Дом бывшего Археологического Общества на Берсеневке.jpg", "Васнецов А., Дом бывшего Археологического Общества на Берсеневке"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Васнецов Аполлинарий Кама.png", "Васнецов А., Кама"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Васнецов Аполлинарий Лиственный лес.jpg", "Васнецов А., Лиственный лес"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Васнецов Аполлинарий Москва XVI столетия.png", "Васнецов А., Москва XVI столетия"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Васнецов Аполлинарий Московский Кремль. Соборы.jpg", "Васнецов А., Московский Кремль. Соборы"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Васнецов Аполлинарий Старая Москва. Медведчики.png", "Васнецов А., Старая Москва. Медведчики"));

            } else if (call_data.equals(VASNECOV_V.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Васнецов Виктор Аленушка.jpg", "Васнецов В., Аленушка"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Васнецов Виктор Богатыри.jpg", "Васнецов В., Богатыри"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Васнецов Виктор Иван-царевич на Сером Волке.jpg", "Васнецов В., Иван-царевич на Сером Волке"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Васнецов Виктор Портрет Александры Саввишны Мамонтовой.jpg", "Васнецов В., Портрет Александры Саввишны Мамонтовой"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Васнецов Виктор Сирин и Алконост. Песнь радости и печали.jpg", "Васнецов В., Сирин и Алконост. Песнь радости и печали"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Васнецов Виктор Три царевны подземного царства.jpg", "Васнецов В., Три царевны подземного царства"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Васнецов Виктор Улица в Ялте.png", "Васнецов В., Улица в Ялте"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Васнецов Виктор Царевна-Несмеяна.jpg", "Васнецов В., Царевна-Несмеяна"));

            } else if (call_data.equals(VENECIANOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Венецианов Алексей Вот-те и батькин обед!.png", "Венецианов, Вот-те и батькин обед!"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Венецианов Алексей На пашне. Весна.jpg", "Венецианов, На пашне. Весна"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Венецианоы Алексей На жатве. Лето.jpg", "Венецианов, На жатве. Лето"));

            } else if (call_data.equals(VERECHAGIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин Василий. Перекочевка киргизов. Лист из альбома..png", "Верещагин, Перекочевка киргизов. Лист из альбома"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин Василий Апофеоз войны.jpg", "Верещагин, Апофеоз войны"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин Василий В горах Алатау.jpg", "Верещагин, В горах Алатау"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин Василий В горах Алатау 1.jpg", "Верещагин, В горах Алатау 1"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин Василий Гробница Шейха Селима Чишти в Фатехпур-Сикри.jpg", "Верещагин, Гробница Шейха Селима Чишти в Фатехпур-Сикри"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин Василий Двери Тимура (Тамерлана).jpg", "Верещагин, Двери Тимура (Тамерлана)"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин Василий Дервиши в праздничных нарядах Ташкент.jpg", "Верещагин, Дервиши в праздничных нарядах Ташкент"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин Василий Дети племени солонов.jpg", "Верещагин, Дети племени солонов"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин Василий Жители западного Тибета.jpg", "Верещагин, Жители западного Тибета"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин Василий Ионастырь Хемис в Ладаке.jpg", "Верещагин, Ионастырь Хемис в Ладаке"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин Василий Калмыцкий лама.jpg", "Верещагин, Калмыцкий лама"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин Василий Мавзолей Шахи-Зинда в Самарканде.jpg", "Верещагин, Мавзолей Шахи-Зинда в Самарканде"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин Василий Медресе Шир-Дор на площади Регистан в Самарканде.jpg", "Верещагин, Медресе Шир-Дор на площади Регистан в Самарканде"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин Василий Моти Масджид (Жемчужная мечеть) в Агре.jpg", "Верещагин, Моти Масджид (Жемчужная мечеть) в Агре"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин Василий Мусульманин шиитской секты в Гималаях.jpg", "Верещагин, Мусульманин шиитской секты в Гималаях"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин Василий Наряд киргизки невесты с головным убором, закрывающим лицо. Лист из альбома.jpg", "Верещагин, Наряд киргизки невесты с головным убором, закрывающим лицо. Лист из альбома"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин Василий Перекочевка киргизов.jpg", "Верещагин, Перекочевка киргизов"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин Василий Побежденные. Панихида.png", "Верещагин, Побежденные. Панихида"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин Василий Политики в опиумной лавочке. Ташкент.jpg", "Верещагин, Политики в опиумной лавочке. Ташкент"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин Василий Посмертные памятники в Ладаке.jpg", "Верещагин, Посмертные памятники в Ладаке"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин Василий Представляют трофеи.jpg", "Верещагин, Представляют трофеи"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин Василий Свидание заключенного со своим семейством.jpg", "Верещагин, Свидание заключенного со своим семейством"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин Василий Торжествуют.png", "Верещагин, Торжествуют"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин Василий Тронный зал Великих Моголов Шах-Джахана и Аурангзеба в форте Дели.jpg", "Верещагин, Тронный зал Великих Моголов Шах-Джахана и Аурангзеба в форте Дели"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагин Василий Угол в мавзолее Гур-Эмир.jpg", "Верещагин, Угол в мавзолее Гур-Эмир"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагтн Василий Афганец.jpg", "Верещагин, Афганец"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагтн Василий Ледник по дороге из Кашмира в Ладак.jpg", "Верещагин, Ледник по дороге из Кашмира в Ладак"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Верещагтн Василий Узбекская женщина в Ташкенте.jpg", "Верещагин, Узбекская женщина в Ташкенте"));

            } else if (call_data.equals(VOLKOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Волков Александр Чайханы старого города.jpg", "Волков, Чайханы старого города"));

            } else if (call_data.equals(VOLOSHIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Волошин Максимилиан Киммерийская осень.png", "Волошин, Киммерийская осень"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Волошин Максимилиан Пепельный свет.jpg", "Волошин, Пепельный свет"));

            } else if (call_data.equals(VOROBEV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Воробьев Максим Вид с башней близ Палермо.png", "Воробьев, Вид с башней близ Палермо"));

            } else if (call_data.equals(VRUBEL.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Врубель Михаил Пан.png", "Врубель, Пан"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Врубель Михаил Полет Фауста и Мефистофеля.jpg", "Врубель, Полет Фауста и Мефистофеля"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Врубель Михаил Сирень.jpg", "Врубель, Сирень"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Врубель Михаил Тамара в гробу. Иллюстрация к поэме М.Ю. Лермонтова Демон.png", "Врубель, Тамара в гробу. Иллюстрация к поэме М.Ю. Лермонтова Демон"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Врубель Михаил Царевна-лебедь.jpg", "Врубель, Царевна-лебедь"));

            } else if (call_data.equals(GE.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Ге Николай Мальчики у берега моря.jpg", "Ге, Мальчики у берега моря"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Ге Николай Портрет Л.Н. Толстого.jpg", "Ге, Портрет Л.Н. Толстого"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Ге Николай Что есть истина. Христос и Пилат.jpg", "Ге, Что есть истина. Христос и Пилат"));

            } else if (call_data.equals(GOLOVIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Головин Александр Портрет Ф.И. Шаляпина в роли Олоферна.jpg", "Головин, Портрет Ф.И. Шаляпина в роли Олоферна"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Головин Александр Умбрийская долина.jpg", "Головин, Умбрийская долина"));

            } else if (call_data.equals(GONCHAROVA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Гончарова Наталия Павлин под ярким солнцем (стиль египетский).jpg", "Гончарова, Павлин под ярким солнцем (стиль египетский)"));

            } else if (call_data.equals(GORONOVICH.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Горонович Андрей Язык цветов.jpg", "Горонович, Язык цветов"));

            } else if (call_data.equals(DEMENTEV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Дементьев Вадим Ветлы.png", "Дементьев, Ветлы"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Дементьев Вадим Малая Ордынка.png", "Дементьев, Малая Ордынка"));

            } else if (call_data.equals(JARENOVA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Жаренова Элеонора Автопортрет с ангелами.jpg", "Жаренова, Автопортрет с ангелами"));

            } else if (call_data.equals(JILINKY.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Жилинский Дмитрий Времена года.png", "Жилинский, Времена года"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Жилинский Дмитрий Купающиеся солдаты.jpg", "Жилинский, Купающиеся солдаты"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Жилинский Дмитрий Хурма.png", "Жилинский, Хурма"));

            } else if (call_data.equals(JUKOVSKY.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Жуковский Станислав Лунная ночь зимой.jpg", "Жуковский, Лунная ночь зимой"));

            } else if (call_data.equals(ZAICEV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Зайцев Николай У бабушки Кати.jpg", "Зайцев, У бабушки Кати"));

            } else if (call_data.equals(ZACHAROV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Захаров Гурий Интерьер. В Кимрах.png", "Захаров, Интерьер. В Кимрах"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Захаров Гурий Краснохолмский мост. Авария. Из серии Москва.png", "Захаров, Краснохолмский мост. Авария. Из серии Москва"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Захаров Гурий Московский ужин. Из серии Москва.png", "Захаров, Московский ужин. Из серии Москва"));

            } else if (call_data.equals(ZVERKOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Зверьков Ефрем Новая лодка.png", "Зверьков, Новая лодка"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Зверьков Ефрем Северная весна.jpg", "Зверьков, Северная весна"));

            } else if (call_data.equals(IVANOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Иванов Александр Автопортрет.jpg", "Иванов, Автопортрет"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Иванов Александр Аполлон, Гиацинт и Кипарис, занимающиеся музыкой и пением.jpg", "Иванов, Аполлон, Гиацинт и Кипарис, занимающиеся музыкой и пением"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Иванов Александр Явление Христа народа (Явление Мессии).jpg", "Иванов Александр Явление Христа народа (Явление Мессии).jpg"));

            } else if (call_data.equals(ISTOMIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Истомин Константин Вузовки.png", "Истомин, Вузовки"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Истомин Константин Дочь столяра Дочь рыбака.jpg", "Истомин, Дочь столяра Дочь рыбака"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Истомин Константин Засохшие цветы.jpg", "Истомин, Засохшие цветы"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Истомин Константин Зима (Надя).jpg", "Истомин, Зима (Надя)"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Истомин Константин Зимний пейзаж. Московский переулок.png", "Истомин, Зимний пейзаж. Московский переулок"));

            }
        }
    }

}

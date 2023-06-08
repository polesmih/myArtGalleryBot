package org.example.handler.tretGalHandler;

import lombok.SneakyThrows;
import org.example.bot.settings.ConfigSettings;
import org.example.bot.settings.Sender;
import org.example.handler.tretGalHandler.inlineKeyboards.*;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

import static org.example.bot.settings.enums.AlphabetGroup.*;
import static org.example.bot.settings.enums.artists.TretGalArtists.*;

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

            if (message_text.equals(A_B_TG.getAbcGroup())) {
                execute(TretGalInlineKeyboardAb.tretGalInlineKeyboardAb(chat_id));
            } else if (message_text.equals(V_J_TG.getAbcGroup())) {
                execute(TretGalInlineKeyboardVj.tretGalInlineKeyboardVj(chat_id));
            } else if (message_text.equals(Z_K_TG.getAbcGroup())) {
                execute(TretGalInlineKeyboardZk.tretGalInlineKeyboardZk(chat_id));
            } else if (message_text.equals(L_N_TG.getAbcGroup())) {
                execute(TretGalInlineKeyboardLn.tretGalInlineKeyboardLn(chat_id));
            } else if (message_text.equals(O_R_TG.getAbcGroup())) {
                execute(TretGalInlineKeyboardOr.tretGalInlineKeyboardOr(chat_id));
            } else if (message_text.equals(S_U_TG.getAbcGroup())) {
                execute(TretGalInlineKeyboardSu.tretGalInlineKeyboardSu(chat_id));
            } else if (message_text.equals(F_Y_TG.getAbcGroup())) {
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
                execute(Sender.sendPhoto(chat_id, ROOT + "Басыров Гариф Лист № 9 Из серии Миниатюры. Архаика.jpg", "Басыров, Лист № 9 Из серии Миниатюры. Архаика"));

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

            } else if (call_data.equals(IVANOV_AI.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Иванов Александр Автопортрет.jpg", "Иванов А.И., Автопортрет"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Иванов Александр Аполлон, Гиацинт и Кипарис, занимающиеся музыкой и пением.jpg", "Иванов А.И., Аполлон, Гиацинт и Кипарис, занимающиеся музыкой и пением"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Иванов Александр Явление Христа народа (Явление Мессии).jpg", "Иванов А.И. Явление Христа народа (Явление Мессии)"));

            } else if (call_data.equals(ISTOMIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Истомин Константин Вузовки.png", "Истомин, Вузовки"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Истомин Константин Дочь столяра Дочь рыбака.jpg", "Истомин, Дочь столяра Дочь рыбака"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Истомин Константин Засохшие цветы.jpg", "Истомин, Засохшие цветы"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Истомин Константин Зима (Надя).jpg", "Истомин, Зима (Надя)"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Истомин Константин Зимний пейзаж. Московский переулок.png", "Истомин, Зимний пейзаж. Московский переулок"));

            } else if (call_data.equals(KANDINSKY.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Кандинский Василий Дамы в кринолинах.jpg", "Кандинский, Дамы в кринолинах"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Кандинский Василий Композиция VII.jpg", "Кандинский, Композиция VII"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Кандинский Василий Москва. Красная площадь.jpg", "Кандинский, Москва. Красная площадь"));

            } else if (call_data.equals(KELIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Келин Петр Ажурницы.png", "Келин. Ажурницы"));

            } else if (call_data.equals(KIPRENSKY.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Кипренский Орест Портрет поэта А.С. Пушкина.jpg", "Кипренский, Портрет поэта А.С. Пушкина"));

            } else if (call_data.equals(KISELEV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Киселев Александр Весенний снег.jpg", "Киселев, Весенний снег"));

            } else if (call_data.equals(KOMAROV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Комаров Василий Портрет Вали Ходасевич.jpg", "Комаров, Портрет Вали Ходасевич"));

            } else if (call_data.equals(KONENKOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Коненков Сергей Ниночка.jpg", "Коненков, Ниночка"));

            } else if (call_data.equals(KORJEV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Коржев Гелий Адам Андреевич и Ева Петровна.jpg", "Коржев, Адам Андреевич и Ева Петровна"));

            } else if (call_data.equals(KORIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Корин Павел Отец и сын (Сергей Михайлович Чураков и Степан Сергеевич Чураков).png", "Корин, Отец и сын (Сергей Михайлович Чураков и Степан Сергеевич Чураков)"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Корин Павел Протодиакон Михаил Кузьмич Холмогоров.jpg", "Корин, Протодиакон Михаил Кузьмич Холмогоров"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Корин Павел Схимница.jpg", "Корин, Схимница"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Корин Павел Эскиз мозаики Марш в будущее для дворца Советов. Фрагмент.png", "Корин, Эскиз мозаики Марш в будущее для дворца Советов. Фрагмент"));

            } else if (call_data.equals(KOROVIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Коровин Константин Гвоздики и фиалки.png", "Коровин, Гвоздики и фиалки"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Коровин Константин Париж ночью. Итальянский бульвар.jpg", "Коровин, Париж ночью. Итальянский бульвар"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Коровин Константин У открытого окна. Портрет дочерей Ф.И. Шаляпина.jpg", "Коровин, У открытого окна. Портрет дочерей Ф.И. Шаляпина"));

            } else if (call_data.equals(KRAVCHENKO.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Кравченко Алексей Нь-Йорк. Бруклинский мост.png", "Кравченко, Нь-Йорк. Бруклинский мост"));

            } else if (call_data.equals(KRAMSKOY.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Крамской Иван Лунная ночь.png", "Крамской, Лунная ночь"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Крамской Иван Неизвестная.jpg", "Крамской, Неизвестная"));

            } else if (call_data.equals(KUINDJI.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Куинджи Архип Березовая роща.jpg", "Куинджи, Архип Березовая роща"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Куинджи Архип Лес.jpg", "Куинджи, Лес"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Куинджи Архип После дождя.jpg", "Куинджи, После дождя"));

            } else if (call_data.equals(KUPREYANOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Купреянов Николай Игрушки.png", "Купреянов, Игрушки"));

            } else if (call_data.equals(KUSTODIEV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Кустодиев Борис Большевик.jpg", "Кустодиев Борис Большевик"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Кустодиев Борис Московский трактир.jpg", "Кустодиев, Московский трактир"));

            } else if (call_data.equals(LAVROVA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Лаврова Анна Трикотажница.jpg", "Лаврова, Трикотажница"));

            } else if (call_data.equals(LAGODA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Лагода-Шишкина Ольга Рожь.jpg", "Лагода-Шишкина, Рожь"));

            } else if (call_data.equals(LAGORIO.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Лагорио Лев Батум.jpg", "Лагорио, Батум"));

            } else if (call_data.equals(LARIONOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Ларионов Михаил Портрет Н.С. Гончаровой.jpg", "Ларионов, Портрет Н.С. Гончаровой"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Ларионов Михаил Танцующие.jpg", "Ларионов, Танцующие"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Лприонов Михаил Ванька с Катькой. Иллюстрация к поэме А.Блока Двенадцать.png", "Лприонов, Ванька с Катькой. Иллюстрация к поэме А.Блока Двенадцать"));

            } else if (call_data.equals(LEVITAN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Левитае Исаак Лесные фиалки и незабудки.jpg", "Левитан, Лесные фиалки и незабудки"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Левитан Исаак Березовая роща.jpg", "Левитан, Березовая роща"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Левитан Исаак Бурный день.jpg", "Левитан, Бурный день"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Левитан Исаак Золотая осень.jpg", "Левитан, Золотая осень"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Левитан Исаак Крым. В горах.jpg", "Левитан, Крым. В горах"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Левитан Исаак Над вечным покоем.jpg", "Левитан, Над вечным покоем"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Левитан Исаак Осеннее утро. Туман.jpg", "Левитан, Осеннее утро. Туман"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Левитан Исаак Осенний день. Сокольники.jpg", "Левитан, Осенний день. Сокольники"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Левитан Исаак Осень.jpg", "Левитан, Осень"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Левитан Исаак Разлив.png", "Левитан, Разлив"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Левитан Исаак Тихая обитель.jpg", "Левитан, Тихая обитель"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Левитан Исаак У омута.jpg", "Левитан, У омута"));

            } else if (call_data.equals(LENTULOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Лентулов Аристарх Колокольня Ивана Великого.jpg", "Лентулов, Колокольня Ивана Великого"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Лентулов Аристарх Москва.jpg", "Лентулов, Москва"));

            } else if (call_data.equals(LOSHAKOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Лошаков Олег Старый Владивосток.jpg", "Лошаков, Старый Владивосток"));

            } else if (call_data.equals(LUBENNIKOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Лубенников Иван Портрет мальчика.jpg", "Лубенников, Портрет мальчика"));

            } else if (call_data.equals(MAVRINA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Маврина Татьяна В Колобовском переулке.jpg", "Маврина, В Колобовском переулке"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Маврина Татьяна Голубая натурщица.jpg", "Маврина, Голубая натурщица"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Маврина Татьяна Церковь Успения Пресвятой Богородицы в Гончарах.jpg", "Маврина, Церковь Успения Пресвятой Богородицы в Гончарах"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Маврина Татьяна Церковь Филиппа Апостола на Арбате.jpg", "Маврина, Церковь Филиппа Апостола на Арбате"));

            } else if (call_data.equals(MAKOVSKY_VE.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Маковский Владимир Вечеринка.png", "Маковский В., Вечеринка"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Маковский Владимир За лекарством.png", "Маковский В., За лекарством"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Маковский Константин В мастерской художника.png", "Маковский В., В мастерской художника"));

            } else if (call_data.equals(MALEVICH.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Малевич Казимир Сестры.jpg", "Малевич, Сестры"));

            } else if (call_data.equals(MALAVIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Малявин Филипп Вихрь.jpg", "Малявин, Вихрь"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Малявин Филипп Крестьянская девушка с чулком.jpg", "Малявин, Крестьянская девушка с чулком"));

            } else if (call_data.equals(MASHKOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Машков Илья Автопортрет.jpg", "Машков, Автопортрет"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Машков Илья Натюрморт с фарфоровыми статуэтками.jpg", "Машков, Натюрморт с фарфоровыми статуэтками"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Машков Илья Портрет Е.И. Киркальди.jpg", "Машков, Портрет Е.И. Киркальди"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Машков Илья Снедб московская. Хлебы.jpg", "Машков, Снедь московская. Хлебы"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Машков Илья Фркты на блюде.png", "Машков, Фркты на блюде"));

            } else if (call_data.equals(MILMAN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Мильман Адольф Натюрморт с куклой.jpg", "Мильман Адольф Натюрморт с куклой.jpg"));

            } else if (call_data.equals(NESTEROV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Нестеров Михаил Видение отроку Варфоломею.jpg", "Нестеров, Видение отроку Варфоломею"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Нестеров Михаил Голова девочки.jpg", "Нестеров, Голова девочки"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Нестеров Михаил Молчание.jpg", "Нестеров, Молчание"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Нестеров Михаил Осенний пейзаж.jpg", "Нестеров, Осенний пейзаж"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Нестеров Михаил Портрет академика А.Н. Северцова.png", "Нестеров, Портрет академика А.Н. Северцова"));

            } else if (call_data.equals(NESTEROVA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Нестерова Наталья Зимний парк. Нью-Йорк.jpg", "Нестерова, Зимний парк. Нью-Йорк"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Нестерова Наталья Кафе в Ялте.jpg", "Нестерова, Кафе в Ялте"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Нестерова Наталья Крик.jpg", "Нестерова, Крик"));

            } else if (call_data.equals(NIVINSKY.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Нивинский Игнатий Цветы.jpg", "Нивинский, Цветы"));

            } else if (call_data.equals(NIKICH.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Никич Анатолий Праздничный натюрморт.png", "Никич, Праздничный натюрморт"));

            } else if (call_data.equals(NIKONOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Никонов Павел Красный Питер.png", "Никонов, Красный Питер"));

            } else if (call_data.equals(OSTROUCHOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Остроухов Илья Сиверко.png", "Остроухов, Сиверко"));

            } else if (call_data.equals(PAVLOVEC.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Павловец Никита Воскрешение Лазаря.png", "Павловец, Воскрешение Лазаря"));

            } else if (call_data.equals(PEROV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Перов Василий Дворник-самоучка.png", "Перов, Дворник-самоучка"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Перов Василий Дилетант.png", "Перов, Дилетант"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Перов Василий Охотники на привале.jpg", "Перов, Охотники на привале"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Перов Василий Парижская шарманщица.jpg", "Перов, Парижская шарманщица"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Перов Василий Портрет Ф.М. Достоевского.jpg", "Перов, Портрет Ф.М. Достоевского"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Перов Василий Портртет А.Н. Островского.png", "Перов, Портртет А.Н. Островского"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Перов Василий Приезд гувернантки в купеческий дом.png", "Перов, Приезд гувернантки в купеческий дом"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Перов Василий Тройка. Ученики-мастеровые везут воду.png", "Перов, Тройка. Ученики-мастеровые везут воду"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Перов Василий Утополенница.jpg", "Перов, Утополенница"));

            } else if (call_data.equals(PETROV_VODKIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Петров-Водкин Кузбма Розовый натюрморт.png", "Петров-Водкин, Розовый натюрморт"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Петров-Водкин Кузьма Купание красного коня.jpg", "Петров-Водкин, Купание красного коня"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Петров-Водкин Кузьма Новоселье. (Рабочий Петроград).png", "Петров-Водкин, Новоселье. (Рабочий Петроград)"));

            } else if (call_data.equals(PIROSNAMASHVILI.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Пиросманашвили Нико (Николай Асланович) Рыбак среди скал.jpg", "Пиросманашвили, Рыбак среди скал"));

            } else if (call_data.equals(POLENOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Поленов Василий Заросший пруд.png", "Поленов, Заросший пруд"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Поленов Василий Мертвое море.png", "Поленов, Мертвое море"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Поленов Василий Московский дворик.jpg", "Поленов, Московский дворик"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Поленов Василий Предел храма Гроба Господня.jpg", "Поленов, Предел храма Гроба Господня"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Поленов Василий Ранний снег.png", "Поленов, Ранний снег"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Поленов Василий Фасад храма Гроба Господня.jpg", "Поленов, Фасад храма Гроба Господня"));

            } else if (call_data.equals(POPKOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Попков Виктор Северная песня. Ой, да как всех мужей побрали на войну.jpg", "Попков, Северная песня. Ой, да как всех мужей побрали на войну"));

            } else if (call_data.equals(PUKIREV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Пукирев Василий Неравный брак.jpg", "Пукирев, Неравный брак"));

            } else if (call_data.equals(RABIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Рабин Оскар Виза на кладбище.png", "Рабин, Виза на кладбище"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Рабин Оскар Оптимистический пейзаж.jpg", "Рабин, Оптимистический пейзаж"));

            } else if (call_data.equals(REPIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Репин Илья Запорожцы пишут письмо турецкому султану.png", "Репин, Запорожцы пишут письмо турецкому султану"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Репин Илья Не ждали.png", "Репин, Не ждали"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Репин Илья Портрет баронессы В.И. Икскуль фон Гильденбандт.jpg", "Репин, Портрет баронессы В.И. Икскуль фон Гильденбандт"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Репин Илья Портрет В.И. Репиной в детстве.jpg", "Репин, Портрет В.И. Репиной в детстве"));

            } else if (call_data.equals(RERIH.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Рерих Николай Свято-Сергиева часовня на путях. Гималаи.jpg", "Рерих, Свято-Сергиева часовня на путях. Гималаи"));

            } else if (call_data.equals(ROGINSKY.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Рогинский Михаил Коммунальная кухня.jpg", "Рогинский, Коммунальная кухня"));

            } else if (call_data.equals(ROZANOVA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Розанова Ольга Зима. Снегири на дереве.jpg", "Розанова, Зима. Снегири на дереве"));

            } else if (call_data.equals(ROKOTOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Рокотов Федор Портрет неизвестного в треуголке.png", "Рокотов, Портрет неизвестного в треуголке"));

            } else if (call_data.equals(RUBLEV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Рублев Андрей Архангел Михаил, из Деисусного (Звенигородского) чина.png", "Рублев, Архангел Михаил, из Деисусного (Звенигородского) чина"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Рублев Андрей Святая Троица.png", "Рублев, Святая Троица"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Рублев Андрей Христос Вседержитель, из Деисусного (Звенигородского) чина.png", "Рублев, Христос Вседержитель, из Деисусного (Звенигородского) чина"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Рублев Андрей Черный Даниил Воскресение - Сошествие во ад.png", "Рублев, Черный Даниил Воскресение - Сошествие во ад"));

            } else if (call_data.equals(SAVRASOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Саврасов Алексей Весенний пейзаж.png", "Саврасов, Весенний пейзаж"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Саврасов Алексей Грачи прилетели.jpg", "Саврасов, Грачи прилетели"));

            } else if (call_data.equals(SALACHOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Салахов Таир Женщины Апшерона.jpg", "Салахов, Женщины Апшерона"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Салахов Таир Мексиканская коррида.jpg", "Салахов, Мексиканская коррида"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Салахов Ьатр Тихий Каспий. (Скалы).jpg", "Салахов, Тихий Каспий. (Скалы)"));

            } else if (call_data.equals(SAPUNOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Сапунов Николай Голубые гортензии.jpg", "Сапунов, Голубые гортензии"));

            } else if (call_data.equals(SEROV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Серов Валентин Девочка с персиками.jpg", "Серов Валентин Девочка с персиками.jpg"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Серов Валентин Мика Морозов.jpg", "Серов, Мика Морозов"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Серов Валентин Одиссей и Навзикая.jpg", "Серов, Одиссей и Навзикая"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Серов Валентин Портет Н.Я. Дервиз с ребенком.jpg", "Серов, Портет Н.Я. Дервиз с ребенком"));

            } else if (call_data.equals(SITNIKOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Ситников Александр Раненый петух.jpg", "Ситников, Раненый петух"));

            } else if (call_data.equals(SOMOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Сомов Константин Арлекин и Смерть.jpg", "Сомов, Арлекин и Смерть"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Сомов Константин Дама в голубом.jpg", "Сомов, Дама в голубом"));

            } else if (call_data.equals(SOTNIKOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Сотников Алексей Дед Мазай и зайцы.jpg", "Сотников, Дед Мазай и зайцы"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Сотников Алексей Материнство...jpg", "Сотников, Материнство"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Сотников Алексей Материнство.jpg", "Сотников, Материнство"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Сотников Алексей Материнство (Переполох).jpg", "Сотников, Материнство (Переполох)"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Сотников Алексей Рождение жизни.jpg", "Сотников, Рождение жизни"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Сотников Алексей Ягненок.jpg", "Сотников, Ягненок"));

            } else if (call_data.equals(SUDEIKIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Судейкин Сергей Гулянье.jpg", "Судейкин, Гулянье"));

            } else if (call_data.equals(SURIKOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Суриков Василий Боярыня Морозова.jpg", "Суриков, Боярыня Морозова"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Суриков Василий Портет О.В. Суриковой в детстве.png", "Суриков, Портет О.В. Суриковой в детстве"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Суриков Василий Сибирская красавица.png", "Суриков, Сибирская красавица"));

            } else if (call_data.equals(TKACHEV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Ткачев Сергей Ткачев Алексей У старых бань.png", "Ткачев, Ткачев Алексей У старых бань"));

            } else if (call_data.equals(TOLSTOY.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Толстой Федор Букет цветов, бабочка и птичка.jpg", "Толстой, Букет цветов, бабочка и птичка"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Толстой Федор Нарциссы.png", "Толстой, Нарциссы"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Толстой Федор Ягоды красной и белой смородины.jpg", "Толстой, Ягоды красной и белой смородины"));

            } else if (call_data.equals(TROPININ.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Тропинин Василий Кружевница.png", "Тропинин, Кружевница"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Тропинин Василий Пряха.jpg", "Тропинин, Пряха"));

            } else if (call_data.equals(TRUBECKOY.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Трубецкой Павел Детсткие головки.jpg", "Трубецкой, Детсткие головки"));

            } else if (call_data.equals(TURNOVA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Турнова Наталия Знать.jpg", "Турнова, Знать"));

            } else if (call_data.equals(TYRSA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Тырса Иван Лицо Анны Ахматовой.jpg", "Тырса, Лицо Анны Ахматовой"));

            } else if (call_data.equals(UDALCOVA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Удальцова Надежда Автопортрет.jpg", "Удальцова, Автопортрет"));

            } else if (call_data.equals(USHAKOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Ушаков Симон Богоматерь Киккская.jpg", "Ушаков, Богоматерь Киккская"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Ушаков Симон Спас Нерукотворный.png", "Ушаков, Спас Нерукотворный"));

            } else if (call_data.equals(FALK.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Фальк Роберт Москва. Улица Горького.jpg", "Фальк, Москва. Улица Горького"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Фальк Роберт Старуха. Франция.jpg", "Фальк, Старуха. Франция"));

            } else if (call_data.equals(FEDOTOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Федотов Павел Завтрак аристократа.png", "Федотов, Завтрак аристократа"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Федотов Павел Сватовство майора.jpg", "Федотов, Сватовство майора"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Федотов Павел Свежий кавалер. Утро чиновника, получившего первый крестик.jpg", "Федотов, Свежий кавалер. Утро чиновника, получившего первый крестик"));

            } else if (call_data.equals(FILONOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Филонов Павел Голгофа.png", "Филонов, Голгофа"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Филонов Павел Голова.png", "Филонов, Голова"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Филонов Павел Головы.png", "Филонов, Головы"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Филонов Павел Композиция. Корабли.png", "Филонов, Композиция. Корабли"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Филонов Павел Формула Вселенной.png", "Филонов, Формула Вселенной"));

            } else if (call_data.equals(HOHRAKOV.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Хохряков Николай Дворик. Дом, освещенный солнцем.png", "Хохряков, Дворик. Дом, освещенный солнцем"));

            } else if (call_data.equals(CHASHNIC.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Чашник Илья Супрематизм.jpg", "Чашник, Супрематизм"));

            } else if (call_data.equals(CHEKRYGIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Чекрыгин Василий Расстрел.jpg", "Чекрыгин, Расстрел"));

            } else if (call_data.equals(CHEREMUSHKIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Черемушкин Герман Бассейн Москва Из серии Москва.jpg", "Черемушкин, Бассейн Москва Из серии Москва"));

            } else if (call_data.equals(SHANKS.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Шанкс Эмилия Новенькая в школе.jpg", "Шанкс, Новенькая в школе"));

            } else if (call_data.equals(SHACHOVSKY.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Шаховский Дмитрий Девочка с кошкой.jpg", "Шаховский, Девочка с кошкой"));

            } else if (call_data.equals(SHEVCHENKO.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Шевченко Александр Голова девушки в платке.jpg", "Шевченко, Голова девушки в платке"));

            } else if (call_data.equals(SHISHKIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Шишкин Иван Рожь.jpg", "Шишкин, Рожь"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Шишкин Иван Утро в сосновом лесу.jpg", "Шишкин, Утро в сосновом лесу"));

            } else if (call_data.equals(CHEDRIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Щедрин Сильвестр Новый Рим. Замок Святого Ангела.jpg", "Щедрин, Новый Рим. Замок Святого Ангела"));

            } else if (call_data.equals(CHIPICIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Щипицын Александр Женщины, идущие за клюквой.png", "Щипицын Александр Женщины, идущие за клюквой.png"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Щипицын Александр На золотом прииске.jpg", "Щипицын, На золотом прииске"));

            } else if (call_data.equals(ERASSI.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Эрасси Михаил Рейхенбахский водопад у Мейрингена в Швейцарии.png", "Эрасси, Рейхенбахский водопад у Мейрингена в Швейцарии"));

            } else if (call_data.equals(YAROSHENKO.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Ярошенко Николай Портрет актрисы Пелагеи Антиповны Стрепетовой.png", "Ярошенко, Портрет актрисы Пелагеи Антиповны Стрепетовой"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Ярошенко Николай Портрет неизвестной.png", "Ярошенко, Портрет неизвестной"));

            } else if (call_data.equals(WEB_TG.toString())) {
                execute(Sender.sendMessage(chat_id, ""));

            }

        }
    }

}

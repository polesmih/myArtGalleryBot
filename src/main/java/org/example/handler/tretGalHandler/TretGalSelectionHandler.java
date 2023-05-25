package org.example.handler.tretGalHandler;

import lombok.SneakyThrows;
import org.example.bot.settings.ConfigSettings;
import org.example.handler.PhotoHandler;
import org.example.handler.tretGalHandler.inlineKeyboards.*;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

import static org.example.handler.tretGalHandler.TretGalArtists.*;

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

            switch (message_text) {
                case "А - Б":
                    execute(TretGalInlineKeyboardAb.tretGalInlineKeyboardAb(chat_id));
                    break;

                case "В - Ж":
                    execute(TretGalInlineKeyboardVj.tretGalInlineKeyboardVj(chat_id));
                    break;

                case "З - К":
                    execute(TretGalInlineKeyboardZk.tretGalInlineKeyboardZk(chat_id));
                    break;

                case "Л - Н":
                    execute(TretGalInlineKeyboardLn.tretGalInlineKeyboardLn(chat_id));
                    break;

                case "О - Р":
                    execute(TretGalInlineKeyboardOr.tretGalInlineKeyboardOr(chat_id));
                    break;

                case "С - У":
                    execute(TretGalInlineKeyboardSu.tretGalInlineKeyboardSu(chat_id));
                    break;

                case "Ф - Я":
                    execute(TretGalInlineKeyboardFy.tretGalInlineKeyboardFy(chat_id));
                    break;

            }

        } else if (update.hasCallbackQuery()) {
            String call_data = update.getCallbackQuery().getData();
            long chat_id = update.getCallbackQuery().getMessage().getChatId();

            if (call_data.equals(AIVAZOVSKY.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Айвазовский Иван Радуга.jpg", "Айвазовский, Радуга"));

            } else if (call_data.equals(ANDREENKOV.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Андреенков Владимир Портрет А. Шервинской.png", "Андреенков, Портрет А. Шервинской"));

            } else if (call_data.equals(ARCHIPOV.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Архипов Абрам Крестьянка в зеленом фартуке.jpg", "Архипов, Крестьянка в зеленом фартуке"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Архипов Абрам Прачки.jpg", "Архипов, Прачки"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Архипов Абрам Северная деревня.jpg", "Архипов, Северная деревня"));

            } else if (call_data.equals(BAKST.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Бакст Лев Нос в Гостином дворе.jpg", "Бакст, Нос в Гостином дворе"));

            } else if (call_data.equals(BASYROV.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Басыров Гариф Лист № 9 Из серии Миниатюры. Архаика.jpg", "Басыро, Лист № 9 Из серии Миниатюры. Архаика"));

            } else if (call_data.equals(BESIN.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Безин Иван Двор на Чкаловской. Зимнее солнце.png", "Безин, Двор на Чкаловской. Зимнее солнце"));

            } else if (call_data.equals(BELASHOV.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Белашов Александр Лосенок.jpg", "Белашов, Лосенок"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Белашов Александр Медведица с медвежонком.jpg", "Белашов, Медведица с медвежонком"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Белашов Александр Самка с детенышем. Лежбище моржей.jpg", "Белашов, Самка с детенышем. Лежбище моржей"));

            } else if (call_data.equals(BERINGOV.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Берингов Митрофан В стране полуночного солнца.jpg", "Берингов, В стране полуночного солнца"));

            } else if (call_data.equals(BOGDANOV.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Богданов-Бельский Николай Устный счет. В народной школе С.А. Рачинского.jpg", "Богданов-Бельский, Устный счет. В народной школе С.А. Рачинского"));

            } else if (call_data.equals(BORISOV.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Борисов Александр Баржа. Северная Двина.jpg", "Борисов, Баржа. Северная Двина"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Борисов Александр Мальчик-ненец. Маточкин Шар. Новая Земля.jpg", "Борисов, Мальчик-ненец. Маточкин Шар. Новая Земля"));

            } else if (call_data.equals(BORISOV_MUSATOV.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Борисов-Мусатов Виктор Изумрудное ожерелье.png", "Борисов-Мусатов, Изумрудное ожерелье"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Борисов-Мусатов Виктор Куст орешника.png", "Борисов-Мусатов, Куст орешника"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Борисов-Мусатов Виктор Луннная ночь. Открытое окно.jpg", "Борисов-Мусатов, Луннная ночь. Открытое окно"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Борисов-Мусатов Виктор Портрет дамы.png", "Борисов-Мусатов, Портрет дамы"));

            } else if (call_data.equals(BOROVIKOVSKY.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Боровиковский Владимир Портрет М.И. Лопухиной.jpg", "Боровиковский, Портрет М.И. Лопухиной"));

            } else if (call_data.equals(BOCHAROV.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Бочаров Михаил Вид в Римской Кампанье.jpg", "Бочаров, Вид в Римской Кампанье"));

            } else if (call_data.equals(BRAZ.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Браз Иосиф (Осип Хайм-Иосель) Портрет писателя Антона Павловича Чехова.png", "Браз (Осип Хайм-Иосель), Портрет писателя Антона Павловича Чехова"));

            } else if (call_data.equals(BRODSKY.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Бродский Исаак Опавшие листья.jpg", "Бродский, Опавшие листья"));

            } else if (call_data.equals(BRULLOV.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Брюллов Карл Автопортрет.png", "Брюллов, Автопортрет"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Брюллов Карл Всадница.jpg", "Брюллов, Всадница"));

            } else if (call_data.equals(VASILEV.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Васильев Федор Оттепель.jpg", "Васильев, Оттепель"));

            } else if (call_data.equals(VASNECOV_A.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Васнецов Аполлинарий Дом бывшего Археологического Общества на Берсеневке.jpg", "Васнецов А., Дом бывшего Археологического Общества на Берсеневке"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Васнецов Аполлинарий Кама.png", "Васнецов А., Кама"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Васнецов Аполлинарий Лиственный лес.jpg", "Васнецов А., Лиственный лес"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Васнецов Аполлинарий Москва XVI столетия.png", "Васнецов А., Москва XVI столетия"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Васнецов Аполлинарий Московский Кремль. Соборы.jpg", "Васнецов А., Московский Кремль. Соборы"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Васнецов Аполлинарий Старая Москва. Медведчики.png", "Васнецов А., Старая Москва. Медведчики"));

            } else if (call_data.equals(VASNECOV_V.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Васнецов Виктор Аленушка.jpg", "Васнецов В., Аленушка"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Васнецов Виктор Богатыри.jpg", "Васнецов В., Богатыри"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Васнецов Виктор Иван-царевич на Сером Волке.jpg", "Васнецов В., Иван-царевич на Сером Волке"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Васнецов Виктор Портрет Александры Саввишны Мамонтовой.jpg", "Васнецов В., Портрет Александры Саввишны Мамонтовой"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Васнецов Виктор Сирин и Алконост. Песнь радости и печали.jpg", "Васнецов В., Сирин и Алконост. Песнь радости и печали"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Васнецов Виктор Три царевны подземного царства.jpg", "Васнецов В., Три царевны подземного царства"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Васнецов Виктор Улица в Ялте.png", "Васнецов В., Улица в Ялте"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Васнецов Виктор Царевна-Несмеяна.jpg", "Васнецов В., Царевна-Несмеяна"));

            } else if (call_data.equals(VENECIANOV.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Венецианов Алексей Вот-те и батькин обед!.png", "Венецианов, Вот-те и батькин обед!"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Венецианов Алексей На пашне. Весна.jpg", "Венецианов, На пашне. Весна"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Венецианоы Алексей На жатве. Лето.jpg", "Венецианов, На жатве. Лето"));

            } else if (call_data.equals(VERECHAGIN.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Верещагин Василий. Перекочевка киргизов. Лист из альбома..png", "Верещагин, Перекочевка киргизов. Лист из альбома"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Верещагин Василий Апофеоз войны.jpg", "Верещагин, Апофеоз войны"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Верещагин Василий В горах Алатау.jpg", "Верещагин, В горах Алатау"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Верещагин Василий В горах Алатау 1.jpg", "Верещагин, В горах Алатау 1"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Верещагин Василий Гробница Шейха Селима Чишти в Фатехпур-Сикри.jpg", "Верещагин, Гробница Шейха Селима Чишти в Фатехпур-Сикри"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Верещагин Василий Двери Тимура (Тамерлана).jpg", "Верещагин, Двери Тимура (Тамерлана)"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Верещагин Василий Дервиши в праздничных нарядах Ташкент.jpg", "Верещагин, Дервиши в праздничных нарядах Ташкент"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Верещагин Василий Дети племени солонов.jpg", "Верещагин, Дети племени солонов"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Верещагин Василий Жители западного Тибета.jpg", "Верещагин, Жители западного Тибета"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Верещагин Василий Ионастырь Хемис в Ладаке.jpg", "Верещагин, Ионастырь Хемис в Ладаке"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Верещагин Василий Калмыцкий лама.jpg", "Верещагин, Калмыцкий лама"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Верещагин Василий Мавзолей Шахи-Зинда в Самарканде.jpg", "Верещагин, Мавзолей Шахи-Зинда в Самарканде"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Верещагин Василий Медресе Шир-Дор на площади Регистан в Самарканде.jpg", "Верещагин, Медресе Шир-Дор на площади Регистан в Самарканде"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Верещагин Василий Моти Масджид (Жемчужная мечеть) в Агре.jpg", "Верещагин, Моти Масджид (Жемчужная мечеть) в Агре"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Верещагин Василий Мусульманин шиитской секты в Гималаях.jpg", "Верещагин, Мусульманин шиитской секты в Гималаях"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Верещагин Василий Наряд киргизки невесты с головным убором, закрывающим лицо. Лист из альбома.jpg", "Верещагин, Наряд киргизки невесты с головным убором, закрывающим лицо. Лист из альбома"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Верещагин Василий Перекочевка киргизов.jpg", "Верещагин, Перекочевка киргизов"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Верещагин Василий Побежденные. Панихида.png", "Верещагин, Побежденные. Панихида"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Верещагин Василий Политики в опиумной лавочке. Ташкент.jpg", "Верещагин, Политики в опиумной лавочке. Ташкент"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Верещагин Василий Посмертные памятники в Ладаке.jpg", "Верещагин, Посмертные памятники в Ладаке"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Верещагин Василий Представляют трофеи.jpg", "Верещагин, Представляют трофеи"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Верещагин Василий Свидание заключенного со своим семейством.jpg", "Верещагин, Свидание заключенного со своим семейством"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Верещагин Василий Торжествуют.png", "Верещагин, Торжествуют"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Верещагин Василий Тронный зал Великих Моголов Шах-Джахана и Аурангзеба в форте Дели.jpg", "Верещагин, Тронный зал Великих Моголов Шах-Джахана и Аурангзеба в форте Дели"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Верещагин Василий Угол в мавзолее Гур-Эмир.jpg", "Верещагин, Угол в мавзолее Гур-Эмир"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Верещагтн Василий Афганец.jpg", "Верещагин, Афганец"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Верещагтн Василий Ледник по дороге из Кашмира в Ладак.jpg", "Верещагин, Ледник по дороге из Кашмира в Ладак"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Верещагтн Василий Узбекская женщина в Ташкенте.jpg", "Верещагин, Узбекская женщина в Ташкенте"));

            } else if (call_data.equals(VOLKOV.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Волков Александр Чайханы старого города.jpg", "Волков, Чайханы старого города"));

            } else if (call_data.equals(VOLOSHIN.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Волошин Максимилиан Киммерийская осень.png", "Волошин, Киммерийская осень"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Волошин Максимилиан Пепельный свет.jpg", "Волошин, Пепельный свет"));

            } else if (call_data.equals(VOROBEV.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Воробьев Максим Вид с башней близ Палермо.png", "Воробьев, Вид с башней близ Палермо"));

            } else if (call_data.equals(VRUBEL.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Врубель Михаил Пан.png", "Врубель, Пан"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Врубель Михаил Полет Фауста и Мефистофеля.jpg", "Врубель, Полет Фауста и Мефистофеля"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Врубель Михаил Сирень.jpg", "Врубель, Сирень"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Врубель Михаил Тамара в гробу. Иллюстрация к поэме М.Ю. Лермонтова Демон.png", "Врубель, Тамара в гробу. Иллюстрация к поэме М.Ю. Лермонтова Демон"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Врубель Михаил Царевна-лебедь.jpg", "Врубель, Царевна-лебедь"));

            } else if (call_data.equals(GE.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Ге Николай Мальчики у берега моря.jpg", "Ге, Мальчики у берега моря"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Ге Николай Портрет Л.Н. Толстого.jpg", "Ге, Портрет Л.Н. Толстого"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Ге Николай Что есть истина. Христос и Пилат.jpg", "Ге, Что есть истина. Христос и Пилат"));

            } else if (call_data.equals(GOLOVIN.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Головин Александр Портрет Ф.И. Шаляпина в роли Олоферна.jpg", "Головин, Портрет Ф.И. Шаляпина в роли Олоферна"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Головин Александр Умбрийская долина.jpg", "Головин, Умбрийская долина"));

            } else if (call_data.equals(GONCHAROVA.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Гончарова Наталия Павлин под ярким солнцем (стиль египетский).jpg", "Гончарова, Павлин под ярким солнцем (стиль египетский)"));

            } else if (call_data.equals(GORONOVICH.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Горонович Андрей Язык цветов.jpg", "Горонович, Язык цветов"));

            } else if (call_data.equals(DEMENTEV.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Дементьев Вадим Ветлы.png", "Дементьев, Ветлы"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Дементьев Вадим Малая Ордынка.png", "Дементьев, Малая Ордынка"));

            } else if (call_data.equals(JARENOVA.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Жаренова Элеонора Автопортрет с ангелами.jpg", "Жаренова, Автопортрет с ангелами"));

            } else if (call_data.equals(JILINKY.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Жилинский Дмитрий Времена года.png", "Жилинский, Времена года"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Жилинский Дмитрий Купающиеся солдаты.jpg", "Жилинский, Купающиеся солдаты"));
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Жилинский Дмитрий Хурма.png", "Жилинский, Хурма"));

            } else if (call_data.equals(JUKOVSKY.toString())) {
                execute(PhotoHandler.sendPhoto(chat_id, ROOT + "Жуковский Станислав Лунная ночь зимой.jpg", "Жуковский, Лунная ночь зимой"));

            }

        }
    }


}

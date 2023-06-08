package org.example.handler.hermitageHandler;

import lombok.SneakyThrows;
import org.example.bot.settings.ConfigSettings;
import org.example.bot.settings.Sender;
import org.example.handler.hermitageHandler.inlineKeyboards.*;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.nio.Buffer;

import static org.example.bot.settings.enums.AlphabetGroup.*;
import static org.example.bot.settings.enums.artists.HermitageArtists.*;

public class HermitageSelectionHandler extends TelegramLongPollingBot {

    String message_text;
    private final static ConfigSettings settings = ConfigSettings.getInstance();
    public final static String ROOT = settings.getPath() + "\\hermitage\\";

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

            if (message_text.equals(A_B_ER.getAbcGroup())) {
                execute(HermitageInlineKeyboardAb.hermitageInlineKeyboardAb(chat_id));
            } else if (message_text.equals(V_G_ER.getAbcGroup())) {
                execute(HermitageInlineKeyboardVg.hermitageInlineKeyboardVg(chat_id));
            } else if (message_text.equals(D_K_ER.getAbcGroup())) {
                execute(HermitageInlineKeyboardDk.hermitageInlineKeyboardDk(chat_id));
            } else if (message_text.equals(L_N_ER.getAbcGroup())) {
                execute(HermitageInlineKeyboardLn.hermitageInlineKeyboardLn(chat_id));
            } else if (message_text.equals(P_R_ER.getAbcGroup())) {
                execute(HermitageInlineKeyboardPr.hermitageInlineKeyboardPr(chat_id));
            } else if (message_text.equals(S_F_ER.getAbcGroup())) {
                execute(HermitageInlineKeyboardSf.hermitageInlineKeyboardSf(chat_id));
            } else if (message_text.equals(H_Y_ER.getAbcGroup())) {
                execute(HermitageInlineKeyboardHy.hermitageInlineKeyboardHy(chat_id));

            }

        } else if (update.hasCallbackQuery()) {
            String call_data = update.getCallbackQuery().getData();
            long chat_id = update.getCallbackQuery().getMessage().getChatId();

            if (call_data.equals(AVRESE.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Аврезе Мария Лина, Девочка в голубом.png", "Аврезе Мария Лина, Девочка в голубом"));

            } else if (call_data.equals(ALIKS.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Аликс Ив, Сцена в суде.png", "Аликс Ив, Сцена в суде"));

            } else if (call_data.equals(AMELIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Амелин Альбин, Две женщины у окна.png", "Амелин Альбин, Две женщины у окна"));

            } else if (call_data.equals(ARTSER.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Артсер Питер, Торговец дичью.png", "Артсер Питер, Торговец дичью"));

            } else if (call_data.equals(BAZILE.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Базилье Андре, Школа верховой езды в Сомюре (Черный каре из Самюра).png", "Базилье Андре, Школа верховой езды в Сомюре (Черный каре из Самюра)"));

            } else if (call_data.equals(BEKKER.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Баккер Якоб Адрианс, Гранида и Даифоло.png", "Баккер Якоб Адрианс, Гранида и Даифоло"));

            } else if (call_data.equals(BARBE.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Барбье Жорж, Царица ночи.png", "Барбье Жорж, Царица ночи"));

            } else if (call_data.equals(BARTEL.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Бартель Беха Мужской портрет XVI века.png", "Бартель Беха Мужской портрет XVI века"));

            } else if (call_data.equals(BARTSON.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Бартсон Альберт, Вечер на Шельде.png", "Бартсон Альберт, Вечер на Шельде"));

            } else if (call_data.equals(BELLANJ.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Белланж Жак-Шарль, Оплакивание Христа.png", "Белланж Жак-Шарль, Оплакивание Христа"));

            } else if (call_data.equals(BONNAR.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Боннар Пьер, Вечер в Париже.png", "Боннар Пьер, Вечер в Париже"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Боннар Пьер, Утро в Париже.png", "Боннар Пьер, Утро в Париже"));

            } else if (call_data.equals(BORRA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Борра Помпео, Обнаженная.png", "Борра Помпео, Обнаженная"));

            } else if (call_data.equals(BOSH.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Босх Иероним, Райский сад.png", "Босх Иероним, Райский сад"));

            } else if (call_data.equals(BOTICHELLI.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Ботичелли Сандро, Св. Иероним.png", "Ботичелли Сандро, Св. Иероним"));

            } else if (call_data.equals(BRAUVER.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Браувер Адриан, Операция - Извлечение камня глупости.png", "Браувер Адриан, Операция - Извлечение камня глупости"));

            } else if (call_data.equals(BREGEL_P.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Брейгель Питер Младший, Зимний пейзаж с конькобежцами и ловушкой для птиц.png", "Брейгель Питер Младший, Зимний пейзаж с конькобежцами и ловушкой для птиц"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Брейгель Питер Младший, Поклонение волхвов.png", "Брейгель Питер Младший, Поклонение волхвов"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Брейгель Питер Младший, Ярмарка с театральным представлением.png", "Брейгель Питер Младший, Ярмарка с театральным представлением"));

            } else if (call_data.equals(BREGEL_Y.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Брейгель Ян Старший, Отдых на пути в Египет.png", "Брейгель Ян Старший, Отдых на пути в Египет"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Брейгель Ян Старший, Поклонение волхвов.png", "Брейгель Ян Старший, Поклонение волхвов"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Брейгель Ян Старший, Призвание апостолов Петра и Андрея.png", "Брейгель Ян Старший, Призвание апостолов Петра и Андрея"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Брейгель Ян Старший, Проселочная дорога.png", "Брейгель Ян Старший, Проселочная дорога"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Брейгель Ян Старший, Улица в деревне.png", "Брейгель Ян Старший, Улица в деревне"));

            } else if (call_data.equals(BREIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Брейн Бартоломеус Старший, Череп в нише.png", "Брейн Бартоломеус Старший, Череп в нише"));

            } else if (call_data.equals(BUALI.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Буальи Луи-Леопольд, Политиканы в Тюильрийском саду.png", "Буальи Луи-Леопольд, Политиканы в Тюильрийском саду"));

            } else if (call_data.equals(BUFFE.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Бюффе Бернар, В рыбной лавке.png", "Бюффе Бернар, В рыбной лавке"));

            } else if (call_data.equals(VAN_GOG.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Ван Гог Винсент, Арльские дамы.png", "Ван Гог Винсент, Арльские дамы"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Ван Гог Винсент, Куст.png", "Ван Гог Винсент, Куст"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Ван Гог Винсент, Хижины.png", "Ван Гог Винсент, Хижины"));

            } else if (call_data.equals(VAN_DEIK.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Ван Дейк Антонис, Автопортрет.png", "Ван Дейк Антонис, Автопортрет"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Ван Дейк Антонис, Портрет Генри Денверса, графа Денби, в костюме кавалера ордена Подвязки.png", "Ван Дейк Антонис, Портрет Генри Денверса, графа Денби, в костюме кавалера ордена Подвязки"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Ван Дейк Антонис, Портрет Елизаветы и Филадельфии Уортон.png", "Ван Дейк Антонис, Портрет Елизаветы и Филадельфии Уортон"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Ван Дейк Антонис, Семейный портрет.png", "Ван Дейк Антонис, Семейный портрет"));

            } else if (call_data.equals(VATTO.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Ватто Антуан, Актеры Итальянской комедии.png", "Ватто Антуан, Актеры Итальянской комедии"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Ватто Антуан, Капризница.png", "Ватто Антуан, Капризница"));

            } else if (call_data.equals(VELASKES.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Веласкес де Сильва Диего, Крестьянский завтрак.png", "Веласкес де Сильва Диего, Крестьянский завтрак"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Веласкес де Сильва Диего, Мужская голова в профиль.png", "Веласкес де Сильва Диего, Мужская голова в профиль"));

            } else if (call_data.equals(VERONESE.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Веронезе Паоло, Автопортрет.png", "Веронезе Паоло, Автопортрет"));

            } else if (call_data.equals(VEROKKO.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Верроккьо Андреа дель, Мадонна с младенцем на троне.png", "Верроккьо Андреа дель, Мадонна с младенцем на троне"));

            } else if (call_data.equals(VIDAL.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Видаль Венсен, Кокетка.png", "Видаль Венсен, Кокетка"));

            } else if (call_data.equals(VILEGAS.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Вильегас-и-Кордеро, Два сенатора.png", "Вильегас-и-Кордеро, Два сенатора"));

            } else if (call_data.equals(VLAMINK.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Вламинк Морис Де, Городок с церковью, .png", "Вламинк Морис Де, Городок с церковью"));

            } else if (call_data.equals(VOS_PAUVEL.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Вос Паувель де; Вильденс Ян, Охота на Медведей.png", "Вос Паувель де; Вильденс Ян, Охота на Медведей"));

            } else if (call_data.equals(VOTE.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Вотье Марк Луи Беньямин, Дети за обедом.png", "Вотье Марк Луи Беньямин, Дети за обедом"));

            } else if (call_data.equals(GALLE.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Галле Луи, Семья рыбака.png", "Галле Луи, Семья рыбака"));

            } else if (call_data.equals(GVIDI.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Гвиди Вирджилио, Визит.png", "Гвиди Вирджилио, Визит"));

            } else if (call_data.equals(GOGEN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Гоген Поль, Беседа.png", "Гоген Поль, Беседа"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Гоген Поль, Пирога.png", "Гоген Поль, Пирога"));

            } else if (call_data.equals(GOROFALO.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Горофало, Аллегория Ветхого и Нового Завета.png", "Горофало, Аллегория Ветхого и Нового Завета"));

            } else if (call_data.equals(GRUTCNER.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Грютцнер Эдуард фон, Монах с газетой.png", "Грютцнер Эдуард фон, Монах с газетой"));

            } else if (call_data.equals(GREZ.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Грёз Жан Батист, Портрет молодого человека.png", "Грёз Жан Батист, Портрет молодого человека"));

            } else if (call_data.equals(DEGA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Дега Эдгар, Площадь Согласия.png", "Дега Эдгар, Площадь Согласия"));

            } else if (call_data.equals(DESUBLEO.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Дезублео Микеле, Персидская Сивилла.png", "Дезублео Микеле, Персидская Сивилла"));

            } else if (call_data.equals(DENI.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Дени Морис, Весенний пейзаж с фигурами.png", "Дени Морис, Весенний пейзаж с фигурами"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Дени Морис, Свадебое шествие.png", "Дени Морис, Свадебое шествие"));

            } else if (call_data.equals(DENNER.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Деннер Бальтазар, Портрет старухи.png", "Деннер Бальтазар, Портрет старухи"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Деннер Бальтазар, Старуха.png", "Деннер Бальтазар, Старуха.png"));

            } else if (call_data.equals(DEREN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Дерен Андре, Гавань в Провансе (Мартиг).png", "Дерен Андре, Гавань в Провансе (Мартиг)"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Дерен Андре, Натюрморт. Корзина с хлебом, кувшин и бокал с красным вином.png", "Дерен Андре, Натюрморт. Корзина с хлебом, кувшин и бокал с красным вином"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Дерен Андре, Натюрморт с черепом.png", "Дерен Андре, Натюрморт с черепом"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Дерен Андре, Роща.png", "Дерен Андре, Роща"));

            } else if (call_data.equals(DJAMPERTION.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Джампьетрино, Мадонна с младенцем.png", "Джампьетрино, Мадонна с младенцем"));

            }  else if (call_data.equals(DJORDJONE.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Джорджоне, Юдифь.png", "Джорджоне, Юдифь"));

            } else if (call_data.equals(DOME.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Домье Оноре, Ноша.png", "Домье Оноре, Ноша"));

            } else if (call_data.equals(DUFI.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Дюфи Рауль. Парусники в гавани Довиля.png", "Дюфи Рауль. Парусники в гавани Довиля"));

            } else if (call_data.equals(JEROM.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Жером Жан-Леон, Дуэль после маскарада.png", "Жером Жан-Леон, Дуэль после маскарада"));

            } else if (call_data.equals(IOS.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Иос ван Клеве, Святое семейство.png", "Иос ван Клеве, Святое семейство"));

            } else if (call_data.equals(IORDANS.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Йорданс Якоб, Три детских головки.png", "Йорданс Якоб, Три детских головки"));

            } else if (call_data.equals(KAMPEDONK.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Кампедонк Генрих, Челове и животные среди природы.png", "Кампедонк Генрих, Челове и животные среди природы"));

            } else if (call_data.equals(KAMPILI.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Кампильи Массимо, Швеи.png", "Кампильи Массимо, Швеи"));

            } else if (call_data.equals(KAPRIOLA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Каприола Доменико, Автопортрет.png", "Каприола Доменико, Автопортрет"));

            } else if (call_data.equals(KARAVAJO.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Караваджо, Вакх.png", "Караваджо, Вакх"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Караваджо, Юноша с лютней.png", "Караваджо, Юноша с лютней"));

            } else if (call_data.equals(KARER.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Карьер Эжен, Женщина, облокотившаяся о стол.png", "Карьер Эжен, Женщина, облокотившаяся о стол"));

            } else if (call_data.equals(KENT.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Кент Рокуэлл, Гора Ассинибойн. Канадские скалистые горы.png", "Кент Рокуэлл, Гора Ассинибойн. Канадские скалистые горы"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Кент Рокуэлл, Летний день. Асгор.png", "Кент Рокуэлл, Летний день. Асгор"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Кент Рокуэлл, Начало ноября. Северная Гренландия.png", "Кент Рокуэлл, Начало ноября. Северная Гренландия"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Кент Рокуэлл, Приближение бури.png", "Кент Рокуэлл, Приближение бури"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Кент Рокуэлл, Пролив Адмиралтейства.png", "Кент Рокуэлл, Пролив Адмиралтейства"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Кент Рокуэлл, Стог Дэна Уорда.png", "Кент Рокуэлл, Стог Дэна Уорда"));

            } else if (call_data.equals(KNAUS.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Кнаус Людвиг, Первый барыш.png", "Кнаус Людвиг, Первый барыш"));

            }  else if (call_data.equals(KOTTE.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Котте Шарль, Вид Венеции с моря.png", "Котте Шарль, Вид Венеции с моря"));

            } else if (call_data.equals(KRANAH.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Кранах Лукас Старший, Женский портрет.png", "Кранах Лукас Старший, Женский портрет"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Кранах Лукас Старший, Мадонна с младенцем под яблоней.png", "Кранах Лукас Старший, Мадонна с младенцем под яблоней"));

            } else if (call_data.equals(KRESPI.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Креспи Джузеппе Мариа, Автопортрет.png", "Креспи Джузеппе Мариа, Автопортрет"));

            } else if (call_data.equals(LAMBERT.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Ламберт Джордж Вашингтон, Аллегорическая сцена (Маска).png", "Ламберт Джордж Вашингтон, Аллегорическая сцена (Маска)"));

            } else if (call_data.equals(LEJE.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Леже Фернан, Открытка.png", "Леже Фернан, Открытка"));

            } else if (call_data.equals(LEIBL.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Лейбль Вильгельм, Спящий мальчик-савояр.png", "Лейбль Вильгельм, Спящий мальчик-савояр"));

            } else if (call_data.equals(LEONARDO.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Леонардо да Винчи, Мадонна Бенуа.png", "Леонардо да Винчи, Мадонна Бенуа"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Леонардо да Винчи, Мадонна Литта.png", "Леонардо да Винчи, Мадонна Литта"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Леонардо да Винчи, Мона Лиза (копия неизвестного художника).png", "Леонардо да Винчи, Мона Лиза (копия неизвестного художника)"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Леонардо да Винчи, Обнаженная женщина.png", "Леонардо да Винчи, Обнаженная женщина"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Леонардо да Винчи, Тайная вечеря (копия неизвестного художника).png", "Леонардо да Винчи, Тайная вечеря (копия неизвестного художника)"));

            } else if (call_data.equals(LUKA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Лука Джордано, Битва Кентавров и Лапифов.png", "Лука Джордано, Битва Кентавров и Лапифов"));

            } else if (call_data.equals(MANDEIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Мандейн Ян, Пейзаж с легендой о св. Христофоре.png", "Мандейн Ян, Пейзаж с легендой о св. Христофоре"));

            } else if (call_data.equals(MARKE.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Марке Альбер, Гамбургский порт.png", "Марке Альбер, Гамбургский порт"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Марке Альбер, Неаполитанский залив.png", "Марке Альбер, Неаполитанский залив"));

            } else if (call_data.equals(MATISS.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Матисс Анри, Музыка.png", "Матисс Анри, Музыка"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Матисс Анри, Семейный портрет.png", "Матисс Анри, Семейный портрет"));

            } else if (call_data.equals(MATTEO.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Маттео Ди Джованни, Мадонна с младенцем.png", "Маттео Ди Джованни, Мадонна с младенцем"));

            } else if (call_data.equals(MELCI.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Мельци Франческо, Коломбина.png", "Мельци Франческо, Коломбина"));

            } else if (call_data.equals(MILLE.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Милле Жан-Батист, Дети идущие из леса с вязанкой хвороста.png", "Милле Жан-Батист, Дети идущие из леса с вязанкой хвороста"));

            } else if (call_data.equals(MONE.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Моне Клод, Берег пруда в Монжероне.png", "Моне Клод, Берег пруда в Монжероне"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Моне Клод, Большая набережная в Гавре.png", "Моне Клод, Большая набережная в Гавре"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Моне Клод, Уголок сада в Монжероне.png", "Моне Клод, Уголок сада в Монжероне"));

            } else if (call_data.equals(MORELSE.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Морельсе Паулюс, Портрет молодой женщины в виде Граниды.png", "Морельсе Паулюс, Портрет молодой женщины в виде Граниды"));

            } else if (call_data.equals(MOURER.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Моурер Альфред Генри, В кафе.png", "Моурер Альфред Генри, В кафе"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Моурер Альфред Генри, В саду.png", "Моурер Альфред Генри, В саду"));

            } else if (call_data.equals(MURILO.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Мурильо Бартоломэ Эстебан, Мальчик с собакой.png", "Мурильо Бартоломэ Эстебан, Мальчик с собакой"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Мурильо Бартоломэ Эстебан, Младенец Иоанн Креститель.png", "Мурильо Бартоломэ Эстебан, Младенец Иоанн Креститель"));

            } else if (call_data.equals(NAGEL.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Нагель Отто, Старый рабочий.png", "Нагель Отто, Старый рабочий"));

            } else if (call_data.equals(NEMO.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Неизвестный немецкий художник, Курильщик.png", "Неизвестный немецкий художник, Курильщик"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Неизвестный немецкий художник, Обедающий крестьянин.png", "Неизвестный немецкий художник, Обедающий крестьянин"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Неизвестный нидерландский художник, Череп.png", "Неизвестный нидерландский художник, Череп"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Неизвестный фламандский художник, Монах.png", "Неизвестный фламандский художник, Монах"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Неизвестный художник, Ад.png", "Неизвестный художник, Ад"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Неизвестный художник, Мадонна с младенцем.png", "Неизвестный художник, Мадонна с младенцем"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Неизвестный художник, Мужчина с гусем и утками.png", "Неизвестный художник, Мужчина с гусем и утками"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Неизвестный художник феррарской школы, Сцена из светской жизни.png", "Неизвестный художник феррарской школы, Сцена из светской жизни"));

            } else if (call_data.equals(NEISHATEL.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Нейшатель (Люцидель) Николас, Портрет моложой женщины.png", "Нейшатель (Люцидель) Николас, Портрет моложой женщины"));

            } else if (call_data.equals(NIKKOLO.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Никколо ди Сер Соццо, Мадонна с Младенцем.png", "Никколо ди Сер Соццо, Мадонна с Младенцем"));

            } else if (call_data.equals(PALMA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Пальма Якопо Старший, портрет молодого человека.png", "Пальма Якопо Старший, портрет молодого человека"));

            } else if (call_data.equals(PARKER.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Паркер Билл, Страдания.png", "Паркер Билл, Страдания"));

            } else if (call_data.equals(PEREDA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Переда Антонио, Мертвая природа с ларцем черного дерева посредине.png", "Переда Антонио, Мертвая природа с ларцем черного дерева посредине"));

            } else if (call_data.equals(PERRONO.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Перроно Жан-Батист, Портрет мальчика.png", "Перроно Жан-Батист, Портрет мальчика"));

            } else if (call_data.equals(PETTENKOFEN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Петтенкофен Август, Цыганские дети.png", "Петтенкофен Август, Цыганские дети"));

            } else if (call_data.equals(PIZIS.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Пизис Филиппо де, Цветы.png", "Пизис Филиппо де, Цветы"));

            } else if (call_data.equals(PIKACCO.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Пикасса Пало, Харчевня.png", "Пикассо Пало, Харчевня"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Пикассо Пабло, Женщина с мандолиной.png", "Пикассо Пабло, Женщина с мандолиной"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Пикассо Пабло, Пьяница.png", "Пикассо Пабло, Пьяница"));

            } else if (call_data.equals(PISSARO.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Писсаро Камиль, Бульвар Монмартр в Париже.png", "Писсаро Камиль, Бульвар Монмартр в Париже"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Писсаро Камиль, Площадь французского театра в Париже.png", "Писсаро Камиль, Площадь французского театра в Париже"));

            } else if (call_data.equals(PLEPP.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Плепп Иозеф, Натюрморт с вишнями и сыром.png", "Плепп Иозеф, Натюрморт с вишнями и сыром"));

            } else if (call_data.equals(POTTER.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Поттер Паулюс, Наказание охотника.png", "Поттер Паулюс, Наказание охотника"));

            } else if (call_data.equals(PIETRO.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Пьетро Перуджино, Портрет молодого человека.png", "Пьетро Перуджино, Портрет молодого человека"));

            } else if (call_data.equals(RAFAEL.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Рафаэль, Битва Константина с Максенцием (копия неизвестного художника).png", "Рафаэль, Битва Константина с Максенцием (копия неизвестного художника)"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Рафаэль, Венера, подвязывающая сандалию.png", "Рафаэль, Венера, подвязывающая сандалию"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Рафаэль, Мадонна с безбородым Иосифом.png", "Рафаэль, Мадонна с безбородым Иосифом"));

            } else if (call_data.equals(REINA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Рейна Манескау Антонио Мария де, Венеция.png", "Рейна Манескау Антонио Мария де, Венеция"));

            } else if (call_data.equals(REMBRANT.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Рембрандт, Возвращение блудного сына.png", "Рембрандт, Возвращение блудного сына"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Рембрандт, Даная.png", "Рембрандт, Даная"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Рембрандт, Флора.png", "Рембрандт, Флора"));

            } else if (call_data.equals(RENUAR.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Ренуар Пьер-Огюст, Дама в черном.png", "Ренуар Пьер-Огюст, Дама в черном"));

            } else if (call_data.equals(REFREJE.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Рефрежье Антон, Разгон демонстрации.png", "Рефрежье Антон, Разгон демонстрации"));

            } else if (call_data.equals(RISSANEN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Риссанен Юхо Вильхо, Две девушки.png", "Риссанен Юхо Вильхо, Две девушки"));

            } else if (call_data.equals(RISHAR.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Ришар Эдуард, Ощипанная курица.png", "Ришар Эдуард, Ощипанная курица"));

            } else if (call_data.equals(ROIMERSVALE.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Роймерсвале Маринус ван, Менялы.png", "Роймерсвале Маринус ван, Менялы"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Роймерсвале Маринус ван, Сборщики податей.png", "Роймерсвале Маринус ван, Сборщики податей"));

            } else if (call_data.equals(RUBENS.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Рубенс, Кимон и Перо.png", "Рубенс, Кимон и Перо"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Рубенс, Уход Агари из дома Авраама.png", "Рубенс, Уход Агари из дома Авраама"));

            } else if (call_data.equals(RUSSO.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Руссо Анри, Люксембургский сад. Памятник Шопену.png", "Руссо Анри, Люксембургский сад. Памятник Шопену"));

            } else if (call_data.equals(SANCHES.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Санчес Коэльо Алонсо, Портрет инфанты.png", "Санчес Коэльо Алонсо, Портрет инфанты"));

            } else if (call_data.equals(SEZANN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Сезанн Поль, Берега Марны.png", "Сезанн Поль, Берега Марны"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Сезанн Поль, Дама в голубом.png", "Сезанн Поль, Дама в голубом"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Сезанн Поль, Девушка у пианино.png", "Сезанн Поль, Девушка у пианино"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Сезанн Поль, Курильщик.png", "Сезанн Поль, Курильщик"));

            } else if (call_data.equals(SISLEI.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Сислей Альфред, Городок Вильнев-ла-Гарен на Сене.png", "Сислей Альфред, Городок Вильнев-ла-Гарен на Сене"));

            } else if (call_data.equals(SNEIDERS.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Снейдерс Франц; Вильденс Ян, Рыбная лавка.png", "Снейдерс Франц; Вильденс Ян, Рыбная лавка"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Снейдерс Франц; Вильденс Ян, Фруктовая лавка.png", "Снейдерс Франц; Вильденс Ян, Фруктовая лавка"));

            } else if (call_data.equals(STANCIONE.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Станционе Массимо, Смерть Клеопатры.png", "Станционе Массимо, Смерть Клеопатры"));

            } else if (call_data.equals(STEVENS.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Стевенс Жозеф, Враги.png", "Стевенс Жозеф, Враги"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Стевенс Жозеф, Горе странствующего шарманщика.png", "Стевенс Жозеф, Горе странствующего шарманщика"));

            } else if (call_data.equals(STREIS.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Стрейс Александр, Хищные птицы.png", "Стрейс Александр, Хищные птицы"));

            } else if (call_data.equals(SUTIN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Сутин Хаим, Автопортрет .png", "Сутин Хаим, Автопортрет"));

            } else if (call_data.equals(TENIRS.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Тенирс Давид Младший, Двое крестьян перед стаканом лимонада.png", "Тенирс Давид Младший, Двое крестьян перед стаканом лимонада"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Тенирс Давид Младший, Пастушок.png", "Тенирс Давид Младший, Пастушок"));

            } else if (call_data.equals(TICIAN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Тициан, Бегство в Египет.png", "Тициан, Бегство в Египет"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Тициан, Даная.png", "Тициан, Даная"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Тициан, Кающаяся Мария Магдалина.png", "Тициан, Кающаяся Мария Магдалина"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Тициан, Портрет молодой женщины.png", "Тициан, Портрет молодой женщины"));

            } else if (call_data.equals(TOMA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Тома Ганс, Адам и Ева.png", "Тома Ганс, Адам и Ева"));

            } else if (call_data.equals(TRUIBER.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Труйебер Поль Дезире, Берег Луары около Шузе.png", "Труйебер Поль Дезире, Берег Луары около Шузе"));

            } else if (call_data.equals(TUSKETS.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Тускетс-и-Маньон Рамон, Птичий двор.png", "Тускетс-и-Маньон Рамон, Птичий двор"));

            } else if (call_data.equals(FAVORI.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Фавори Андре, Женская фигура.png", "Фавори Андре, Женская фигура"));

            } else if (call_data.equals(FANTEN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Фантен-Латур Анри, Наяда.png", "Фантен-Латур Анри, Наяда"));

            } else if (call_data.equals(FOKSEIL.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Фоксёйль Иоган Якоб, Борьба пролетариев.png", "Фоксёйль Иоган Якоб, Борьба пролетариев"));

            } else if (call_data.equals(FRAGONAR.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Фрагонар Жан Оноре, Дети фермера.png", "Фрагонар Жан Оноре, Дети фермера"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Фрагонар Жан Оноре, Поцелуй украдкой.png", "Фрагонар Жан Оноре, Поцелуй украдкой"));

            } else if (call_data.equals(FRANC.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Франс Поурбус старший Женский портрет XVII века.png", "Франс Поурбус старший Женский портрет XVII века"));

            }  else if (call_data.equals(FRANCHESKINI.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Франческини Марко Антонио, Портрет молодой девушки.png", "Франческини Марко Антонио, Портрет молодой девушки"));

            } else if (call_data.equals(FRIDRIH.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Фридрих Каспар Давид, Исполиновы горы.png", "Фридрих Каспар Давид, Исполиновы горы"));

            } else if (call_data.equals(FRIEZ.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Фриез Отон, Крыши и кафедральный собор в Руане.png", "Фриез Отон, Крыши и кафедральный собор в Руане"));

            } else if (call_data.equals(HAITMULLER.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Хайтмюллер Август, Цветущее дерево.png", "Хайтмюллер Август, Цветущее дерево"));

            } else if (call_data.equals(HEISUM.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Хейсум Ян ван, Цветы.png", "Хейсум Ян ван, Цветы"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Хейсум Ян ван, Цветы в вазе.png", "Хейсум Ян ван, Цветы в вазе"));

            } else if (call_data.equals(HEM.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Хем Ян Давидс де, Цветы в вазе.png", "Хем Ян Давидс де, Цветы в вазе"));

            } else if (call_data.equals(HOVE.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Хове Хубертус ван, Вдова перед синдиками.png", "Хове Хубертус ван, Вдова перед синдиками"));

            } else if (call_data.equals(SHEFFRUA.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Шеффруа Анри Жуль Жан, Этюд головы старушки.png", "Шеффруа Анри Жуль Жан, Этюд головы старушки"));

            } else if (call_data.equals(SHTUK.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Штук Франц, Борьба за женщину.png", "Штук Франц, Борьба за женщину"));

            } else if (call_data.equals(EDELFEL.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Эдельфель Альберт, Добрые друзья. Портрет сестры художника.png", "Эдельфель Альберт, Добрые друзья. Портрет сестры художника"));

            } else if (call_data.equals(EITEVAL.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Эйтевал Иоахим Антонис, Лот с дочерьми.png", "Эйтевал Иоахим Антонис, Лот с дочерьми"));

            } else if (call_data.equals(EL.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Эль Греко, Апостолы Петр и Павел.png", "Эль Греко, Апостолы Петр и Павел"));

            } else if (call_data.equals(EMSEN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Эмзен Генрих, Дети художника.png", "Эмзен Генрих, Дети художника"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Эмзен Генрих, Расстрел матроса Эгльхофера.png", "Эмзен Генрих, Расстрел матроса Эгльхофера"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Эмзен Генрих, Расстрел матроса Эгльхофера2.png", "Эмзен Генрих, Расстрел матроса Эгльхофера2"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Эмзен Генрих, Рыбачки в Альмафи.png", "Эмзен Генрих, Рыбачки в Альмафи"));
                execute(Sender.sendPhoto(chat_id, ROOT + "Эмзен Генрих, Угольщик в Позитано.png", "Эмзен Генрих, Угольщик в Позитано"));

            } else if (call_data.equals(ESPINS.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Эспина-и-Капо Хуан, Весенний пейзаж.png", "Эспина-и-Капо Хуан, Весенний пейзаж"));

            } else if (call_data.equals(YAKOBS.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Якобс Дирк, Групповой портрет корпорации амстердамский стрелков.png", "Якобс Дирк, Групповой портрет корпорации амстердамский стрелков"));

            } else if (call_data.equals(YANSEN.toString())) {
                execute(Sender.sendPhoto(chat_id, ROOT + "Янсен Иероним, Бал.png", "Янсен Иероним, Бал"));

            }

            else if (call_data.equals(WEB_HERM.toString())) {
                execute(Sender.sendMessage(chat_id, ""));

            }

        }
    }

}

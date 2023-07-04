# myArtGalleryBot (java)  
Telegram-бот для  просмотра некоторых работ известных художников.   

Бот в Telegram: [@GalleryTrip_bot](https://t.me/GalleryTrip_bot)  

## Лицензия  
Этот проект лицензирован по лицензии MIT.  
Подробности в файле LICENSE  

## Автор  
Олеся Пономарева  

## В проекте использованы:  
Java  
MySQL  
GitHub - repository  
Telegram Bot API  

Полный список используемых зависимостей и версий компонентов можно найти в pom.xml  

В проект добавлена база данных для учета пользователей, которая развернута на виртуальном хостинге https://beget.com/ru.

### Демонстрация функционала:  

1. Активация бота    
![IMG_5251](https://github.com/polesmih/myArtGalleryBot/assets/77875474/7ca9edd8-f334-467e-b380-2301d96f1aa2)  

2. Меню и вызов клавиатуры с типами музеев  
![IMG_5252](https://github.com/polesmih/myArtGalleryBot/assets/77875474/9ac04e47-5108-4f9b-8c78-95000b509b20)  
  
3. Вызов клавиатуры с алфавитным перечнем    
![IMG_5253](https://github.com/polesmih/myArtGalleryBot/assets/77875474/032a8fa5-1848-4231-8eb5-09712677a174)  
  
4. Inline-клавиатура и с перечнем художников  
![IMG_5253](https://github.com/polesmih/myArtGalleryBot/assets/77875474/e63974b8-c668-4825-86a7-133dc8d3dc92)  

5. Загрузка картины выбраного художника
![IMG_5255](https://github.com/polesmih/myArtGalleryBot/assets/77875474/289e28a2-80fe-41d8-8541-327293b387da)  

 
### Сборка и запуск бота:  
Запуск бота в среде разработки (IntelliJ IDEA) производится через запуск класса Main.java.  
Также возможно создать исполняемый jar-файл и запускать его (как в среде разработки, так и на витртуальных ресурсах). В проекте (pom.xml) реализована возможность создания такого файла через плагин Apache Assembly  

Выгружен telegram-бот на VPS: https://beget.com/ru/vps. Для выгрузки потребовалось:  
- зарегистрироваться на https://beget.com/ru и арендовать VPS (у меня - на Ubuntu 22.04 с SSL-сертификатом);  
- для общения с VPS установить клиент удалённого доступа PuTTY;  
- для передать на сервер файлов бота установить FTP-клиент - FileZilla.  


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
![IMG_5251](https://github.com/polesmih/myArtGalleryBot/assets/77875474/b0555b50-7dba-48b1-b4e4-d16e63ccc515)  
  
2. Меню и вызов клавиатуры с типами музеев  
![IMG_5252](https://github.com/polesmih/myArtGalleryBot/assets/77875474/00134595-91d5-4a98-b858-f4e489de2653)  
   
3. Вызов клавиатуры с алфавитным перечнем    
![IMG_5253](https://github.com/polesmih/myArtGalleryBot/assets/77875474/7077033a-6e16-4c7b-812a-79e9461b6bad)  
   
4. Inline-клавиатура и с перечнем художников  
![IMG_5254](https://github.com/polesmih/myArtGalleryBot/assets/77875474/670ac5c8-d32f-4a79-bb27-2a59df43e6c9)  
 
5. Загрузка картины выбраного художника  
![IMG_5255](https://github.com/polesmih/myArtGalleryBot/assets/77875474/0f1671d1-ce01-40da-8b37-22b2023be02c)  

  
### Сборка и запуск бота:  
Запуск бота в среде разработки (IntelliJ IDEA) производится через запуск класса Main.java.  
Также возможно создать исполняемый jar-файл и запускать его (как в среде разработки, так и на витртуальных ресурсах). В проекте (pom.xml) реализована возможность создания такого файла через плагин Apache Assembly  

Выгружен telegram-бот на VPS: https://beget.com/ru/vps. Для выгрузки потребовалось:  
- зарегистрироваться на https://beget.com/ru и арендовать VPS (у меня - на Ubuntu 22.04 с SSL-сертификатом);  
- для общения с VPS установить клиент удалённого доступа PuTTY;  
- для передать на сервер файлов бота установить FTP-клиент - FileZilla.  


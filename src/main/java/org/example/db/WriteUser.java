package org.example.db;

import java.time.LocalDateTime;

public class WriteUser {

    public static void writeUserIntoDb (LocalDateTime date, Long id, String firstName, String userName) {

        UserModel user = new UserModel();

        user.setDate(date);
        user.setUserTgId(id);
        user.setFirstName(firstName);
        user.setUserName(userName);

        UserModel userModel = new UserModel(date, id, firstName, userName);

        UserConnection.userAccounting(userModel);

    }
}

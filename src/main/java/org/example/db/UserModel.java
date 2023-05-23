package org.example.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserModel {

    private LocalDateTime date;
    private Long userTgId;
    private String firstName;
    private String userName;

}

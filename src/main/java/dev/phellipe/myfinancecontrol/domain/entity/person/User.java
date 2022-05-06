package dev.phellipe.myfinancecontrol.domain.entity.person;

import java.time.LocalDateTime;
import java.util.UUID;

public class User {

    private UUID id;
    private String email;
    private String password;
    private Account account;
    private AccessLevel accessLevel;
    private boolean active;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}

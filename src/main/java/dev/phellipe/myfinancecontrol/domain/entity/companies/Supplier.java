package dev.phellipe.myfinancecontrol.domain.entity.companies;

import dev.phellipe.myfinancecontrol.domain.entity.person.Account;
import dev.phellipe.myfinancecontrol.domain.entity.person.User;

import java.time.LocalDateTime;
import java.util.UUID;

public class Supplier {

    private UUID id;
    private String name;
    private boolean active;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private User userLastUpdate;
}

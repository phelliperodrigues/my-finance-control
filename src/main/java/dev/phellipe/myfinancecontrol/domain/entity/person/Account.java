package dev.phellipe.myfinancecontrol.domain.entity.person;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

public class Account {
    private UUID id;
    private Set<User> users;
    private boolean active;
    private String mainEmail;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}

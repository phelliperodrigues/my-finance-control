package dev.phellipe.myfinancecontrol.domain.entity.bank;

import dev.phellipe.myfinancecontrol.domain.entity.person.Account;
import dev.phellipe.myfinancecontrol.domain.entity.person.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Bank {
    private UUID id;
    private String name;
    private BigDecimal value;
    private boolean active;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private User userLastUpdate;
}

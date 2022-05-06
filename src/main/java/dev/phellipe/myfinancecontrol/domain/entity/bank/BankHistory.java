package dev.phellipe.myfinancecontrol.domain.entity.bank;

import dev.phellipe.myfinancecontrol.domain.entity.person.Account;
import dev.phellipe.myfinancecontrol.domain.entity.person.User;

import java.time.LocalDateTime;
import java.util.UUID;

public class BankHistory {
    private UUID id;
    private Bank bank;
    private MovementType type;
    private Boolean value;
    private String motive;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private User userLastUpdate;
}

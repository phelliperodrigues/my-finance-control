package dev.phellipe.myfinancecontrol.domain.entity.launchers;

import dev.phellipe.myfinancecontrol.domain.entity.person.Account;

import java.util.UUID;

public class Category {
    private UUID id;
    private String description;
    private boolean active;
    private Account account;
}

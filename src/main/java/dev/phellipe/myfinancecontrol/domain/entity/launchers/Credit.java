package dev.phellipe.myfinancecontrol.domain.entity.launchers;

import dev.phellipe.myfinancecontrol.domain.entity.companies.Payer;
import dev.phellipe.myfinancecontrol.domain.entity.companies.Supplier;
import dev.phellipe.myfinancecontrol.domain.entity.person.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Credit {
    private UUID id;
    private Payer supplier;
    private String description;
    private LocalDate dueDate;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private User userLastUpdate;
}

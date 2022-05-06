package dev.phellipe.myfinancecontrol.domain.entity.launchers;

import dev.phellipe.myfinancecontrol.domain.entity.companies.Supplier;
import dev.phellipe.myfinancecontrol.domain.entity.person.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Debit {
    private UUID id;
    private Supplier supplier;
    private String description;
    private Category category;
    private LocalDate dueDate;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private User userLastUpdate;
}

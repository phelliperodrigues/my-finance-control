package dev.phellipe.myfinancecontrol.domain.entity.launchers;

import dev.phellipe.myfinancecontrol.domain.entity.person.User;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class LauncherCredit {

    private UUID id;
    private Credit debit;
    private User user;
    private boolean paymentReceived;
    private boolean recurrent;
    private BigDecimal grossValue;
    private BigDecimal netValue;
    private BigDecimal valueDiscounts;
    private BigDecimal addedValue;
    private LocalDate dueDate;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private User userLastUpdate;
}

package dev.phellipe.myfinancecontrol.domain.entity.launchers;

import dev.phellipe.myfinancecontrol.domain.entity.person.User;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class LauncherDebit {

    private UUID id;
    private Debit debit;
    private User user;
    private String barCode;
    private String bankSlipUrl;
    private boolean paidSlip;
    private boolean recurrent;
    private int currentInstallments;
    private int totalInstallments;
    private BigDecimal value;
    private String paymentProof;
    private LocalDate dueDate;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private User userLastUpdate;
}

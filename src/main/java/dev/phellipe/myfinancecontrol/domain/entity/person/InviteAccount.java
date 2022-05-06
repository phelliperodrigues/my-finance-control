package dev.phellipe.myfinancecontrol.domain.entity.person;

import java.time.LocalDateTime;
import java.util.UUID;

public class InviteAccount {
    private UUID id;
    private Account account;
    private User user;
    private String emailInvited;
    private String linkInvite;
    private AccessLevel accessLevelInvite;
    private boolean accepted;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}

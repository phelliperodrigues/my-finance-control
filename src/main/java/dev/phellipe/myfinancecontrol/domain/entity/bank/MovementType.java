package dev.phellipe.myfinancecontrol.domain.entity.bank;

public enum MovementType {
    WITHDRAWAL("RETIRADA"),
    PROHIBITED("ENTRADA");

    public final String type;
    MovementType(String type){
        this.type = type;
    }
}

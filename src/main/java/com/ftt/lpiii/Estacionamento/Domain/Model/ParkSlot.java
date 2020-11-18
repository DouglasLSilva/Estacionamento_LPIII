package com.ftt.lpiii.Estacionamento.Domain.Model;

import com.ftt.lpiii.Estacionamento.Domain.Shared.Entity;

@javax.persistence.Entity
public class ParkSlot extends Entity {

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    private boolean isOccupied;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}

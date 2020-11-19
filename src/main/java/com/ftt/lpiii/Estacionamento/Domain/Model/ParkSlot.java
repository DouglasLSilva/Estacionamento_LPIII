package com.ftt.lpiii.Estacionamento.Domain.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ftt.lpiii.Estacionamento.Domain.Shared.Entity;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@javax.persistence.Entity
public class ParkSlot extends Entity {

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    private boolean isOccupied;

    public List<Occupation> getOccupation() {
        return occupation;
    }

    public void setOccupation(List<Occupation> occupation) {
        this.occupation = occupation;
    }

    @OneToMany(mappedBy = "parkSlot", fetch = FetchType.EAGER)
    @Column(insertable=false, updatable=false)
    private List<Occupation> occupation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}

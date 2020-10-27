package com.ftt.lpiii.Estacionamento.Domain.Model;

import com.ftt.lpiii.Estacionamento.Domain.Enums.OccupationType;
import com.ftt.lpiii.Estacionamento.Domain.Shared.Entity;

public class Value extends Entity {

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public OccupationType getOccupationType() {
        return occupationType;
    }

    public void setOccupationType(OccupationType occupationType) {
        this.occupationType = occupationType;
    }

    private double value;
    private OccupationType occupationType;
}

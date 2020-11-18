package com.ftt.lpiii.Estacionamento.Domain.Model;

import com.ftt.lpiii.Estacionamento.Domain.Enums.OccupationType;
import com.ftt.lpiii.Estacionamento.Domain.Shared.Entity;

import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import java.util.Date;

@javax.persistence.Entity
public class Occupation extends Entity {

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ParkSlot getParkSlot() {
        return parkSlot;
    }

    public void setParkSlot(ParkSlot parkSlot) {
        this.parkSlot = parkSlot;
    }

    public OccupationType getOccupationType() {
        return occupationType;
    }

    public void setOccupationType(OccupationType occupationType) {
        this.occupationType = occupationType;
    }

    @OneToOne(targetEntity =  Client.class, fetch = FetchType.EAGER)
    private Client client;

    @OneToOne(targetEntity = ParkSlot.class, fetch = FetchType.EAGER)
    private ParkSlot parkSlot;

    private OccupationType occupationType;

}

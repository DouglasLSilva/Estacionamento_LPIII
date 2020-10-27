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

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public OccupationType getOccupationType() {
        return occupationType;
    }

    public void setOccupationType(OccupationType occupationType) {
        this.occupationType = occupationType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    @OneToOne(targetEntity =  Client.class, fetch = FetchType.EAGER)
    private Client client;

    @OneToOne(targetEntity = ParkSlot.class, fetch = FetchType.EAGER)
    private ParkSlot parkSlot;

    private Date dataEntrada;

    private Date dataSaida;

    private OccupationType occupationType;

    private boolean isOccupied;

}

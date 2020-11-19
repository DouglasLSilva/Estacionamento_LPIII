package com.ftt.lpiii.Estacionamento.Domain.Model;

import com.ftt.lpiii.Estacionamento.Domain.Enums.OccupationType;
import com.ftt.lpiii.Estacionamento.Domain.Shared.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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

    public Date getDataEntrda() {
        return dataEntrda;
    }

    public void setDataEntrda(Date dataEntrda) {
        this.dataEntrda = dataEntrda;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @ManyToOne(targetEntity =  Client.class, fetch = FetchType.EAGER)
    @JsonIgnoreProperties("occupation")
    private Client client;

    @ManyToOne(targetEntity = ParkSlot.class, fetch = FetchType.EAGER)
    @JsonIgnoreProperties("occupation")
    private ParkSlot parkSlot;

    private OccupationType occupationType;

    private String placa;

    private Date dataEntrda;

    private Date dataSaida;

}

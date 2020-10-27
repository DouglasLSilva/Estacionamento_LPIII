package com.ftt.lpiii.Estacionamento.Application;

import com.ftt.lpiii.Estacionamento.Application.Interfaces.IParkSlotApp;
import com.ftt.lpiii.Estacionamento.Domain.Model.ParkSlot;
import com.ftt.lpiii.Estacionamento.Infra.Repositories.Interfaces.IParkSlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ParkSlotApp extends BaseApp<ParkSlot> implements IParkSlotApp {

    @Autowired
    public ParkSlotApp(IParkSlotRepository parkSlotRepository) {
        super(parkSlotRepository);
    }
}

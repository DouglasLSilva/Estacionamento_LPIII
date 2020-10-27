package com.ftt.lpiii.Estacionamento.Application;

import com.ftt.lpiii.Estacionamento.Application.Interfaces.IOccupationApp;
import com.ftt.lpiii.Estacionamento.Domain.Model.Occupation;
import com.ftt.lpiii.Estacionamento.Infra.Repositories.Interfaces.IOccupationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OccupationApp extends BaseApp<Occupation> implements IOccupationApp {

    @Autowired
    public OccupationApp(IOccupationRepository occupationRepository) {
        super(occupationRepository);
    }
}

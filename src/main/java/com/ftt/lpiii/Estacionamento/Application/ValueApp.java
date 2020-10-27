package com.ftt.lpiii.Estacionamento.Application;

import com.ftt.lpiii.Estacionamento.Application.Interfaces.IValueApp;
import com.ftt.lpiii.Estacionamento.Domain.Model.Value;
import com.ftt.lpiii.Estacionamento.Infra.Repositories.Interfaces.IValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValueApp extends BaseApp<Value> implements IValueApp {

    @Autowired
    public ValueApp(IValueRepository valueRepository) {
        super(valueRepository);
    }
}

package com.ftt.lpiii.Estacionamento.Application;

import com.ftt.lpiii.Estacionamento.Application.Interfaces.IClientApp;
import com.ftt.lpiii.Estacionamento.Domain.Model.Client;
import com.ftt.lpiii.Estacionamento.Infra.Repositories.Interfaces.IBaseRepository;
import com.ftt.lpiii.Estacionamento.Infra.Repositories.Interfaces.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClientApp extends BaseApp<Client> implements IClientApp {

    @Autowired
    public ClientApp(IClientRepository clientRepository) {
        super(clientRepository);
    }
}

package com.ftt.lpiii.Estacionamento.Controller;

import com.ftt.lpiii.Estacionamento.Application.Interfaces.IClientApp;
import com.ftt.lpiii.Estacionamento.Domain.Model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/Client")
public class ClientController extends BaseController<Client> {

    private IClientApp _clientApp;

    @Autowired
    public ClientController(IClientApp clientApp) {
        super(clientApp);
    }
}

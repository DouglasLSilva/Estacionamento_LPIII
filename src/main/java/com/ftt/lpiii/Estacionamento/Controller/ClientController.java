package com.ftt.lpiii.Estacionamento.Controller;

import com.ftt.lpiii.Estacionamento.Application.Interfaces.IClientApp;
import com.ftt.lpiii.Estacionamento.Domain.Model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/Client")
public class ClientController extends BaseController<Client> {

    private IClientApp _clientApp;

    @Autowired
    public ClientController(IClientApp clientApp) {
        super(clientApp);
        _clientApp = clientApp;
    }

    @Override
    public ResponseEntity<Client> Post(@RequestBody Client entity) throws Exception {
        Client client = _clientApp.add(entity);
        if(client == null) {
            return ResponseEntity.badRequest().body(entity);
        }
        return ResponseEntity.ok().body(client);
    }

    @RequestMapping(path = "deleteByCPF",method = RequestMethod.DELETE, produces = {"application/json"})
    public ResponseEntity<Boolean> DeleteByCPF(@RequestParam String cpf) throws Exception {
        Client client = _clientApp.getByCPF(cpf);
        if(client == null){
            return ResponseEntity.badRequest().body(false);
        }
        _clientApp.delete(client.id);
        return ResponseEntity.ok().body(true);
    }

    @RequestMapping(path = "/cpf",method = RequestMethod.GET, produces = {"application/json"})
    public ResponseEntity<Client> GetByCPF(@RequestParam String cpf){
        Client client = _clientApp.getByCPF(cpf);
        return ResponseEntity.ok().body(client);
    }
}

package com.ftt.lpiii.Estacionamento.Infra.Repositories.Interfaces;

import com.ftt.lpiii.Estacionamento.Domain.Model.Client;

public interface IClientRepository extends IBaseRepository<Client> {

    Client getByCPF(String cpf);
}

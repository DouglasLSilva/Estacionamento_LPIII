package com.ftt.lpiii.Estacionamento.Infra.Repositories;

import com.ftt.lpiii.Estacionamento.Domain.Model.Client;
import com.ftt.lpiii.Estacionamento.Infra.Repositories.Interfaces.IClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientRepository extends BaseRepository<Client> implements IClientRepository {
}

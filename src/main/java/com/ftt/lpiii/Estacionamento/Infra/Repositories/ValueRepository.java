package com.ftt.lpiii.Estacionamento.Infra.Repositories;

import com.ftt.lpiii.Estacionamento.Domain.Model.Value;
import com.ftt.lpiii.Estacionamento.Infra.Repositories.Interfaces.IValueRepository;
import org.springframework.stereotype.Service;

@Service
public class ValueRepository extends BaseRepository<Value> implements IValueRepository {
}

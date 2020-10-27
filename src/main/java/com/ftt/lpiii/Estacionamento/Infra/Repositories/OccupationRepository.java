package com.ftt.lpiii.Estacionamento.Infra.Repositories;

import com.ftt.lpiii.Estacionamento.Domain.Model.Occupation;
import com.ftt.lpiii.Estacionamento.Infra.Repositories.Interfaces.IOccupationRepository;
import org.springframework.stereotype.Service;

@Service
public class OccupationRepository extends BaseRepository<Occupation> implements IOccupationRepository {
}

package com.ftt.lpiii.Estacionamento.Infra.Repositories;

import com.ftt.lpiii.Estacionamento.Domain.Model.ParkSlot;
import com.ftt.lpiii.Estacionamento.Infra.Repositories.Interfaces.IParkSlotRepository;
import org.springframework.stereotype.Service;

@Service
public class ParkSlotRepository extends BaseRepository<ParkSlot> implements IParkSlotRepository {
}

package com.ftt.lpiii.Estacionamento.Controller;

import com.ftt.lpiii.Estacionamento.Application.Interfaces.IParkSlotApp;
import com.ftt.lpiii.Estacionamento.Domain.Model.ParkSlot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/ParkSlot")
public class ParkSlotController extends BaseController<ParkSlot> {

    private IParkSlotApp _parkSlotApp;

    @Autowired
    public ParkSlotController(IParkSlotApp parkSlotApp) {
        super(parkSlotApp);
        _parkSlotApp = parkSlotApp;
    }
}

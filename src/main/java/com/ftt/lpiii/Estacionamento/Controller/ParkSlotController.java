package com.ftt.lpiii.Estacionamento.Controller;

import com.ftt.lpiii.Estacionamento.Application.Interfaces.IParkSlotApp;
import com.ftt.lpiii.Estacionamento.Domain.Model.ParkSlot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
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

    @Override
    public ResponseEntity<Boolean> Update(@RequestBody ParkSlot entity) throws Exception {
        var oldparkSlot = _parkSlotApp.getById(entity.id);
        entity.setOccupation(oldparkSlot.getOccupation());
        return super.Update(entity);
    }
}

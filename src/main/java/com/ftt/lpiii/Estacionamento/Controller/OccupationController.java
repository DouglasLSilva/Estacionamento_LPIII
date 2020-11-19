package com.ftt.lpiii.Estacionamento.Controller;

import com.ftt.lpiii.Estacionamento.Application.Interfaces.IOccupationApp;
import com.ftt.lpiii.Estacionamento.Application.Interfaces.IParkSlotApp;
import com.ftt.lpiii.Estacionamento.Domain.Model.Occupation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
@RequestMapping("api/Occupation")
public class OccupationController extends BaseController<Occupation> {

    private IOccupationApp _occupationApp;
    private IParkSlotApp _parkSlotApp;

    @Autowired
    public OccupationController(IOccupationApp occupationApp, IParkSlotApp parkSlotApp) {
        super(occupationApp);
        _occupationApp = occupationApp;
        _parkSlotApp = parkSlotApp;
    }

    @Override
    public ResponseEntity<Occupation> Post(@RequestBody Occupation entity) throws Exception {
        entity.setDataEntrda(new Date());
        entity.getParkSlot().setOccupied(true);
        var result =  super.Post(entity);
        _parkSlotApp.update(entity.getParkSlot());

        return  result;
    }
}

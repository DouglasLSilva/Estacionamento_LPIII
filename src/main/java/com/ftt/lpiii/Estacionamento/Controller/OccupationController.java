package com.ftt.lpiii.Estacionamento.Controller;

import com.ftt.lpiii.Estacionamento.Application.Interfaces.IOccupationApp;
import com.ftt.lpiii.Estacionamento.Domain.Model.Occupation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/Occupation")
public class OccupationController extends BaseController<Occupation> {

    private IOccupationApp _occupationApp;

    @Autowired
    public OccupationController(IOccupationApp occupationApp) {
        super(occupationApp);
        _occupationApp = occupationApp;
    }
}

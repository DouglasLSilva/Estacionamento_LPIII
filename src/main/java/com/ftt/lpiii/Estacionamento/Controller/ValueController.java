package com.ftt.lpiii.Estacionamento.Controller;

import com.ftt.lpiii.Estacionamento.Application.Interfaces.IValueApp;
import com.ftt.lpiii.Estacionamento.Domain.Model.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/Value")
public class ValueController extends BaseController<Value> {

    private IValueApp _valueApp;

    @Autowired
    public ValueController(IValueApp valueApp) {
        super(valueApp);
        _valueApp = valueApp;
    }
}

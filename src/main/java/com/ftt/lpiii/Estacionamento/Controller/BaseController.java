package com.ftt.lpiii.Estacionamento.Controller;

import com.ftt.lpiii.Estacionamento.Application.Interfaces.IBaseApp;
import com.ftt.lpiii.Estacionamento.Domain.Shared.Entity;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.lang.reflect.ParameterizedType;
import java.util.List;

@RestController
public abstract class BaseController<T extends Entity> {

    private IBaseApp<T> _baseApp;

    @Autowired
    public BaseController(IBaseApp<T> baseApp){
        _baseApp = baseApp;
    }

    @RequestMapping(method = RequestMethod.GET, produces = {"application/json"})
    public ResponseEntity<List<T>> GetAll() throws Exception {
        ParameterizedType superClass = (ParameterizedType) getClass().getGenericSuperclass();
        Class type = (Class) superClass.getActualTypeArguments()[0];
        T t = (T) type.newInstance();
        List<T> list = _baseApp.getAll((Class<T>) t.getClass());

        return ResponseEntity.ok(list);
    }

    @RequestMapping(path = "/{id}",method = RequestMethod.GET, produces = {"application/json"})
    public ResponseEntity<T> GetById(@RequestParam int id) throws Exception {
        T t = _baseApp.getById(id);
        Gson gson = new Gson();
        return ResponseEntity.ok(t);
    }

    @RequestMapping(method = RequestMethod.PUT, produces = {"application/json"})
    public ResponseEntity<Boolean> Update(@RequestBody T entity) throws Exception {
        _baseApp.update(entity);
        return ResponseEntity.ok().body(null);
    }

    @RequestMapping(method = RequestMethod.DELETE, produces = {"application/json"})
    public ResponseEntity<Boolean> Delete(@RequestBody T entity) throws Exception {
        _baseApp.delete(entity);
        return ResponseEntity.ok().body(null);
    }
}

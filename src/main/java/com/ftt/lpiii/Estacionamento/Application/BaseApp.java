package com.ftt.lpiii.Estacionamento.Application;

import com.ftt.lpiii.Estacionamento.Application.Interfaces.IBaseApp;
import com.ftt.lpiii.Estacionamento.Domain.Shared.Entity;
import com.ftt.lpiii.Estacionamento.Infra.Repositories.BaseRepository;
import com.ftt.lpiii.Estacionamento.Infra.Repositories.Interfaces.IBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class BaseApp<T extends Entity> implements IBaseApp<T> {

    private IBaseRepository<T> _baseRepository;

    @Autowired
    public BaseApp(IBaseRepository<T> baseRepository) {
        _baseRepository = baseRepository;
    }

    public T add(T entity) throws Exception {
        return _baseRepository.add(entity);
    }

    public List<T> getAll(Class<T> tClass) throws Exception {
        return _baseRepository.getAll(tClass);
    }

    public T getById(int id) throws Exception {
        return _baseRepository.getById(id);
    }

    public void update(T entity) throws Exception {
        _baseRepository.update(entity);
    }

    public void delete(int id) throws Exception {
        T entity = _baseRepository.getById(id);
        _baseRepository.delete(entity);
    }

    public void delete(T entity) throws Exception {
        _baseRepository.delete(entity);
    }
}

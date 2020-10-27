package com.ftt.lpiii.Estacionamento.Application.Interfaces;

import com.ftt.lpiii.Estacionamento.Domain.Shared.Entity;

import java.util.List;

public interface IBaseApp<T extends Entity> {
    T add(T entity) throws Exception;

    List<T> getAll(Class<T> tClass) throws Exception;

    T getById(int id) throws Exception;

    void update(T entity) throws Exception;

    void delete(int id) throws Exception;

    void delete(T entity) throws Exception;
}

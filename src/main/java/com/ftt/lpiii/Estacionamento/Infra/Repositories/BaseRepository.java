package com.ftt.lpiii.Estacionamento.Infra.Repositories;

import com.ftt.lpiii.Estacionamento.Domain.Shared.Entity;
import com.ftt.lpiii.Estacionamento.Infra.Context.HibernateContext;
import com.ftt.lpiii.Estacionamento.Infra.Repositories.Interfaces.IBaseRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseRepository<T extends Entity> implements IBaseRepository<T> {

    public List<T> getAll(Class<T> entity) throws Exception {
        Session session = HibernateContext.getInstance().getSession();
        try {
            Query query = session.createQuery("FROM " + entity.getSimpleName());
            return (List<T>) query.getResultList();

        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public T getById(int id) throws Exception {
        Session session = HibernateContext.getInstance().getSession();

        try {
            session.getTransaction().begin();
            return (T) session.get(Entity.class, id);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public T add(T entity) throws Exception {
        Session session = HibernateContext.getInstance().getSession();

        try {
            session.getTransaction().begin();
            session.saveOrUpdate(entity);
            session.getTransaction().commit();
            return entity;
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public void update(T entity) throws Exception {
        Session session = HibernateContext.getInstance().getSession();
        try {
            session.getTransaction().begin();
            session.update(entity);
            session.getTransaction().commit();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public void delete(T entity) throws Exception {
        Session session = HibernateContext.getInstance().getSession();
        try {
            session.getTransaction().begin();
            session.delete(entity);
            session.getTransaction().commit();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }
}

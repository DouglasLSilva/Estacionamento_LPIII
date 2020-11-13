package com.ftt.lpiii.Estacionamento.Infra.Repositories;

import com.ftt.lpiii.Estacionamento.Domain.Model.Client;
import com.ftt.lpiii.Estacionamento.Infra.Context.HibernateContext;
import com.ftt.lpiii.Estacionamento.Infra.Repositories.Interfaces.IClientRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientRepository extends BaseRepository<Client> implements IClientRepository {


    @Override
    public Client getByCPF(String cpf) {
        Session session = HibernateContext.getInstance().getSession();
        try {
            Query query = session.createQuery("FROM Client WHERE cpf =: cpf");
            query.setParameter("cpf", cpf);
            query.setFirstResult(0);
            query.setMaxResults(1);
            return (Client) query.uniqueResult();

        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }
}

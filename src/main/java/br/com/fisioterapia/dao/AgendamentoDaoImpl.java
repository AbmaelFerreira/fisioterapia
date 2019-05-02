package br.com.fisioterapia.dao;

import br.com.fisioterapia.domain.Agendamento;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;

@Repository
public class AgendamentoDaoImpl implements AgendamentoDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void salvar(Agendamento agendamento) {
        em.persist(agendamento);
    }

    @Override
    public List<Agendamento> recuperar() {
        return em.createQuery("select p from Agendamento p", Agendamento.class).getResultList();

    }

    @Override
    public Agendamento recuperarPorID(long id) {
        return em.find(Agendamento.class, id);
    }

    @Override
    public void atualizar(Agendamento agendamento) {
        em.merge(agendamento);
    }

    @Override
    public void excluir(long id) {
        em.remove(em.getReference(Agendamento.class, id));
    }
}

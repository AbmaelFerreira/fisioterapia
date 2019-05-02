package br.com.fisioterapia.dao;

import br.com.fisioterapia.domain.Paciente;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PacienteDaoImpl implements PacienteDao {

    @PersistenceContext
    private EntityManager em;


    @Override
    public void salvar(Paciente paciente) {
        em.persist(paciente);
    }

    @Override
    public List<Paciente> recuperarPorAgendamento(long agendamentoId) {
        return em.createQuery("select m from Paciente m where m.agendamento.id = :agendamentoId", Paciente.class).setParameter("agendamentoId", agendamentoId)
                .getResultList();
    }

    @Override
    public Paciente recuperarPorAgendamentoIdEPacienteId(long agendamentoId, long pacienteId) {
        return em.createQuery("select m from Paciente m where m.agendamento.id = :agendamentoId and m.id = :pacienteId", Paciente.class)
                .setParameter("agendamentoId", agendamentoId)
                .setParameter("pacienteId", pacienteId)
                .getSingleResult();

    }

    @Override
    public void atualizar(Paciente paciente) {
        em.merge(paciente);
    }

    @Override
    public void excluir(long pacienteId) {
        em.remove(em.getReference(Paciente.class, pacienteId));
    }
}

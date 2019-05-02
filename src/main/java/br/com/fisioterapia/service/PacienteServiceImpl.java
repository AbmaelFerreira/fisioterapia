package br.com.fisioterapia.service;

import br.com.fisioterapia.dao.PacienteDao;
import br.com.fisioterapia.domain.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private PacienteDao pacienteDao;

    @Autowired
    private AgendamentoService agendamentoService;

    @Override
    public void salvar(Paciente paciente, long agendamentoId) {
        paciente.setAgendamento(agendamentoService.recuperarPorID(agendamentoId));
        pacienteDao.salvar(paciente);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Paciente> recuperarPorAgendamento(long agendamentoId) {
        return pacienteDao.recuperarPorAgendamento(agendamentoId);
    }

    @Override
    @Transactional(readOnly = true)
    public Paciente recuperarPorAgendamentoIdEPacienteId
            (long agendamentoId, long pacienteId) {
        return pacienteDao.recuperarPorAgendamentoIdEPacienteId
                (agendamentoId, pacienteId);
    }

    @Override
    public void atualizar(Paciente paciente, long playlistId) {
        paciente.setAgendamento(agendamentoService.recuperarPorID(playlistId));
        pacienteDao.atualizar(paciente);
    }

    @Override
    public void excluir(long agendamentoId, long pacienteId) {
        pacienteDao.excluir(recuperarPorAgendamentoIdEPacienteId
                (agendamentoId, pacienteId).getId());
    }
}

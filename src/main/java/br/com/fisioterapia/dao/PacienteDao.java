package br.com.fisioterapia.dao;

import br.com.fisioterapia.domain.Paciente;

import java.util.List;

public interface PacienteDao {

    void salvar(Paciente paciente);

    List<Paciente> recuperarPorAgendamento(long agendamentoId);

    Paciente recuperarPorAgendamentoIdEPacienteId (long agendamentoId, long pacienteId);
    void atualizar(Paciente paciente);
    void excluir(long pacienteId);


}

package br.com.fisioterapia.service;

import br.com.fisioterapia.domain.Paciente;

import java.util.List;

public interface PacienteService {

    //void salvar(Paciente paciente, long agendamentoId);

    //Paciente recuperarPorAgendamentoIdEPacienteId(long agendamento, long pacienteId);
    //void atualizar(Paciente paciente, long agendamento);
   // void excluir(long agendamentoId, long pacienteId);
    Paciente recuperarPorId(long id);
    List<Paciente> recuperar();

}

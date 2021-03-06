package br.com.fisioterapia.service;

import br.com.fisioterapia.domain.Agendamento;

import java.util.List;

public interface AgendamentoService {

    void salvar(Agendamento agendamento);
    List<Agendamento> recuperar();
    Agendamento recuperarPorID(long id);
    void atualizar(Agendamento agendamento);
    void excluir (long id);

}

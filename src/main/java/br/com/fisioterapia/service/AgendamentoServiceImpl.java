package br.com.fisioterapia.service;

import br.com.fisioterapia.dao.AgendamentoDao;
import br.com.fisioterapia.domain.Agendamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional
public class AgendamentoServiceImpl implements AgendamentoService {

    @Autowired
    private AgendamentoDao agendamentoDao;


    @Override
    public void salvar(Agendamento agendamento) {
        agendamentoDao.salvar(agendamento);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Agendamento> recuperar() {
        return agendamentoDao.recuperar();
    }




    @Transactional(readOnly = true)
    public Agendamento recuperarPorID(long id) {
        return agendamentoDao.recuperarPorID(id);
    }

    @Override
    public void atualizar(Agendamento agendamento) {
        agendamentoDao.atualizar(agendamento);
    }

    @Override
    public void excluir(long id) {
        agendamentoDao.excluir(id);
    }
}

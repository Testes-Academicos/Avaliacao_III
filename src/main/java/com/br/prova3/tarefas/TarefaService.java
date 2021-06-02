package com.br.prova3.tarefas;

import com.br.prova3.clientes.ClienteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private  TarefaRepository tarefaRepository;
    public List<TarefaModel> finAll() {
        return tarefaRepository.findAll();
    }

    public TarefaModel store(TarefaModel tarefaModel) {
        return tarefaRepository.save(tarefaModel);
    }
    public List<TarefaModel> findTarefasByCliente(ClienteModel clienteModel){
        return tarefaRepository.findTarefasByCliente(clienteModel);
    }
}

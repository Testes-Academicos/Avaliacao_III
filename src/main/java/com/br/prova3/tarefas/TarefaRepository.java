package com.br.prova3.tarefas;


import com.br.prova3.clientes.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TarefaRepository extends JpaRepository<TarefaModel, Long> {
    List<TarefaModel> findTarefasByCliente(ClienteModel cliente);
}

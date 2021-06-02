package com.br.prova3.clientes;

import com.br.prova3.tarefas.TarefaModel;
import com.br.prova3.tarefas.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClienteResource {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    public List<ClienteModel>show(){
        return clienteService.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteModel register(@Valid @RequestBody ClienteModel clienteModel){
        return clienteService.store(clienteModel);
    }
    @GetMapping("/{id}")
    public ClienteModel find(@PathVariable("id") long id){
        return (ClienteModel) clienteService.find(id);
    }
    @GetMapping("/{id}/tarefas")
    public List<TarefaModel> tarefaModel(@PathVariable("id") long id){
        ClienteModel clienteModel = (ClienteModel) clienteService.find(id);
      return tarefaService.findTarefasByCliente(clienteModel);
    }
}

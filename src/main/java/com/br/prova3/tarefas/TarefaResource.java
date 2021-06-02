package com.br.prova3.tarefas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaResource {
    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    public List<TarefaModel> show(){
        return tarefaService.finAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TarefaModel register(@Valid @RequestBody TarefaModel tarefaModel){
        return tarefaService.store(tarefaModel);
    }
}

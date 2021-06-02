package com.br.prova3.clientes;

import com.br.prova3.tarefas.TarefaModel;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@RequiredArgsConstructor
@Getter
@Setter
public class ClienteModel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Id
    @Column(name = "ID", nullable = false)
    private long id;
    @Column
    @NotNull
    private String name;

    @JsonManagedReference
    @OneToMany(mappedBy = "tarefaModel")
    private List<TarefaModel> tarefaModel = (List<TarefaModel>) new TarefaModel();
}

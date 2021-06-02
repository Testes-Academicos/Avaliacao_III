package com.br.prova3.tarefas;

import com.br.prova3.clientes.ClienteModel;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class TarefaModel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    @Column
    private String name;
    @Column
    private String Description;
    @Column
    private String  Type;
    @Column
    private String Assignment;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private ClienteModel clienteModel;

}

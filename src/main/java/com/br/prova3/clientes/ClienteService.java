package com.br.prova3.clientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private  ClienteRepository clienteRepository;

    public List<ClienteModel> findAll() {
        return clienteRepository.findAll();
    }

    public ClienteModel store(ClienteModel clienteModel) {
        return clienteRepository.save(clienteModel);
    }

    public Object find(long id) {
        return clienteRepository.findById(id).orElseThrow(
                () -> new  IllegalStateException("Customer does not exist. id: " + id));

    }
}

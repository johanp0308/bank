package co.edu.uts.bank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uts.bank.repositories.ClienteRepository;
import co.edu.uts.bank.repositories.entities.ClienteEntity;
import co.edu.uts.bank.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    @Override
    public List<ClienteEntity> findAll() {
        return (List<ClienteEntity>) clienteRepository.findAll();
    }

    @Override
    public ClienteEntity findById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public ClienteEntity save(ClienteEntity cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public ClienteEntity update(ClienteEntity cliente, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public ClienteEntity findByDocument(String document) {
        return clienteRepository.findByDocument(document);
    }

    
}

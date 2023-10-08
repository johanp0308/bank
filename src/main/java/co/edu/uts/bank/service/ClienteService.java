package co.edu.uts.bank.service;



import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.uts.bank.repositories.entities.ClienteEntity;

@Service

public interface ClienteService {
    
    
    List<ClienteEntity> findAll();
    ClienteEntity findById(Long id);
    ClienteEntity save(ClienteEntity cliente);
    ClienteEntity update(ClienteEntity  cliente, Long id);
    void delete(Long id);
    ClienteEntity findByDocument(String document);

}

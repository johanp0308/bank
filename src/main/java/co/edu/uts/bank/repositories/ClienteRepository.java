package co.edu.uts.bank.repositories;

import org.springframework.data.repository.CrudRepository;

import co.edu.uts.bank.repositories.entities.ClienteEntity;

public interface ClienteRepository  extends CrudRepository<ClienteEntity, Long>{
    
    ClienteEntity findByDocument(String document);
}

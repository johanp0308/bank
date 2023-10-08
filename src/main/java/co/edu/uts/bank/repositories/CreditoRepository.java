package co.edu.uts.bank.repositories;

import org.springframework.data.repository.CrudRepository;

import co.edu.uts.bank.repositories.entities.CreditoEntity;

public interface CreditoRepository extends CrudRepository<CreditoEntity,Long>{
    
}

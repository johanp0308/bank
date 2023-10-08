package co.edu.uts.bank.service;

import co.edu.uts.bank.repositories.entities.CreditoEntity;

public interface CreditoService {

    CreditoEntity save(CreditoEntity credito);

    CreditoEntity finByid(Long id);

    CreditoEntity asignarCredito(String document, CreditoEntity credito);
}

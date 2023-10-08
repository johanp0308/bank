package co.edu.uts.bank.service.impl;

import org.springframework.stereotype.Service;

import co.edu.uts.bank.repositories.ClienteRepository;
import co.edu.uts.bank.repositories.CreditoRepository;
import co.edu.uts.bank.repositories.entities.ClienteEntity;
import co.edu.uts.bank.repositories.entities.CreditoEntity;
import co.edu.uts.bank.service.CreditoService;

@Service
public class CreditoServiceImpl implements CreditoService{

    private CreditoRepository creditoRepository;
    private ClienteRepository clienteRepository;

    @Override
    public CreditoEntity save(CreditoEntity credito) {
        return creditoRepository.save(credito);
    }

    @Override
    public CreditoEntity finByid(Long id) {
        return creditoRepository.findById(id).orElse(null);
    }

    @Override
    public CreditoEntity asignarCredito(String document, CreditoEntity credito) {
        ClienteEntity cliente = clienteRepository.findByDocument(document);

        if(cliente != null){
            credito.setCliente(cliente);
            return creditoRepository.save(credito);
        }else{

        }
        return null;
    }
    
}

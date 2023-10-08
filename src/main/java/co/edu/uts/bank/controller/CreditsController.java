package co.edu.uts.bank.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uts.bank.repositories.entities.ClienteEntity;
import co.edu.uts.bank.repositories.entities.CreditoEntity;
import co.edu.uts.bank.service.ClienteService;
import co.edu.uts.bank.service.CreditoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/creditos")
public class CreditsController {
    
    @Autowired    
    private ClienteService clienteService;

    @Autowired
    private CreditoService creditoService;

    @GetMapping("/{document}")
    public ClienteEntity solicitarCredito(@PathVariable String document){
        return clienteService.findByDocument(document);
    }

    @PostMapping("/{document}")
    public CreditoEntity asignarCredito(@PathVariable String document, @RequestBody CreditoEntity credito){
        return creditoService.asignarCredito(document, credito);
    }
}

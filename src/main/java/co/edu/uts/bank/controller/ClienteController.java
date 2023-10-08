package co.edu.uts.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uts.bank.repositories.entities.ClienteEntity;
import co.edu.uts.bank.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;

    @PostMapping("/")
    public ClienteEntity save(@RequestBody ClienteEntity cliente){
        return clienteService.save(cliente);
    }

    @GetMapping("/{document}")
    public ClienteEntity findById(@PathVariable String document){
        return clienteService.findByDocument(document);
    }
}

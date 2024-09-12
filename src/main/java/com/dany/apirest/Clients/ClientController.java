package com.dany.apirest.Clients;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService; 

    @GetMapping
    @ResponseBody
    public void getClient(@RequestBody Client client){
        clientService.getAllClient(client);
    }

    @PostMapping
    @ResponseBody
    public void createClient(@RequestBody Client client){
      clientService.createClient(client);
    }

    @DeleteMapping("/client/{id}")
    @ResponseBody
    public void deleteClient(@PathVariable Integer id){
        clientService.deleteClient(id);
    }
    @GetMapping("/client/{id}")
    @ResponseBody
    public Client getClientById(@PathVariable Integer id){
        return clientService.getClientById(id);
    }

    @PutMapping
    @ResponseBody
    public void updateClient(@RequestBody Client client){
        clientService.updateClient(client);
    }
    
}

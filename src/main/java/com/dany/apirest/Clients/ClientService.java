package com.dany.apirest.Clients;

import org.hibernate.annotations.ListIndexBase;
import org.hibernate.mapping.List;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClientService {
    
    private final ClientRepository clientRepo;

    public void createClient(Client client)
    {
       clientRepo.save(client);

    }

    public Client getClientById(Integer id) {
        return clientRepo.findById(id).orElse(null);
    }
    
    public void getAllClient(Client client){
        clientRepo.findAll();
    }
   

    public void updateClient(Client client) {
        clientRepo.save(client);
    }

    public void deleteClient(Integer id) {
        clientRepo.deleteById(id);
    }





}

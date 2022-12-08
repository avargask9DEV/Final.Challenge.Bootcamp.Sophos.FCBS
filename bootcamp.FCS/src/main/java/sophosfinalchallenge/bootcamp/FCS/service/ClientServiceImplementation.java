package sophosfinalchallenge.bootcamp.FCS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sophosfinalchallenge.bootcamp.FCS.entity.Client;
import sophosfinalchallenge.bootcamp.FCS.repository.ClientRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImplementation  implements ClientService{

    @Autowired
    ClientRepository clientRepository;

    @Override
    public Client createClient(Client client){
        return clientRepository.save(client);
    }

    @Override
    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> getClientById(Long id){
        return clientRepository.findById(id);
    }

    @Override
    public boolean deleteClientById(Long id){
        return getClientById(id).map(client -> {
            clientRepository.deleteById(id);
            return true;
        }).orElse(false);

    }
}

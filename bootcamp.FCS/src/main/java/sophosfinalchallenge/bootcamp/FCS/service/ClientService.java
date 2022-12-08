package sophosfinalchallenge.bootcamp.FCS.service;

import sophosfinalchallenge.bootcamp.FCS.entity.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    public Client createClient(Client client);

    public List<Client> getAllClients();

    public Optional<Client> getClientById(Long id);

    public boolean deleteClientById(Long id);



}

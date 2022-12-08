package sophosfinalchallenge.bootcamp.FCS.service;

import sophosfinalchallenge.bootcamp.FCS.entity.Transactional;

import java.util.List;
import java.util.Optional;

public interface TransactionalService {

    public Transactional createTransaction(Transactional transactional);

    public List<Transactional> getAllTransaction();

    public Optional<Transactional> getTransactionById(long id);

    public boolean deleteTransationById(long id);


}

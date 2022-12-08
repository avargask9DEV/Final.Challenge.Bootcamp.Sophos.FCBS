package sophosfinalchallenge.bootcamp.FCS.service;

import org.springframework.stereotype.Service;
import sophosfinalchallenge.bootcamp.FCS.entity.Transactional;
import sophosfinalchallenge.bootcamp.FCS.repository.TransactionalRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionalServiceImplementation implements  TransactionalService{

    TransactionalRepository transactionalRepository;

    @Override
    public Transactional createTransaction(Transactional transactional) {

        return transactionalRepository.save(transactional);
    }

    @Override
    public List<Transactional> getAllTransaction() {
        return transactionalRepository.findAll();
    }

    @Override
    public Optional<Transactional> getTransactionById(long id) {
        return transactionalRepository.findById(id);
    }


    @Override
    public boolean deleteTransationById(long id) {
        return getTransactionById(id).map(transactional -> {
            transactionalRepository.deleteById(id);
            return true;
        }).orElse(false);
    }
}

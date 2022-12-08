package sophosfinalchallenge.bootcamp.FCS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sophosfinalchallenge.bootcamp.FCS.entity.SystemUser;
import sophosfinalchallenge.bootcamp.FCS.repository.SystemUserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SystemUserServiceImplementation implements SystemUserService{

    @Autowired
    SystemUserRepository systemUserRepository;


    @Override
    public SystemUser createUser(SystemUser systemUser) {
        return systemUserRepository.save(systemUser);
    }

    @Override
    public List<SystemUser> getAllSystemUser() {
        return systemUserRepository.findAll();
    }

    @Override
    public Optional<SystemUser> getSystemUserById(Long id) {
        return systemUserRepository.findById(id);
    }

    @Override
    public boolean deleteSystemUserById(Long id) {
        return getSystemUserById(id).map(systemUser -> {
            systemUserRepository.deleteById(id);
            return true;
        }).orElse(false);
    }

    @Override
    public SystemUser updateSystemUser(SystemUser systemUser) {
       return systemUserRepository.save(systemUser);
    }
}

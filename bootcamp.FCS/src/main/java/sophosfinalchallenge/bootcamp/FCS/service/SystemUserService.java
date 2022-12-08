package sophosfinalchallenge.bootcamp.FCS.service;

import sophosfinalchallenge.bootcamp.FCS.entity.SystemUser;

import java.util.List;
import java.util.Optional;

public interface SystemUserService {

    public SystemUser createUser(SystemUser systemUser);

    public List<SystemUser> getAllSystemUser();

    public Optional<SystemUser> getSystemUserById(Long id);

    public boolean deleteSystemUserById(Long Id);

}

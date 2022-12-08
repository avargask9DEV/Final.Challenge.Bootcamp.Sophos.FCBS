package sophosfinalchallenge.bootcamp.FCS.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sophosfinalchallenge.bootcamp.FCS.entity.SystemUser;

@Repository
public interface SystemUserRepository extends JpaRepository<SystemUser, Long> {

}

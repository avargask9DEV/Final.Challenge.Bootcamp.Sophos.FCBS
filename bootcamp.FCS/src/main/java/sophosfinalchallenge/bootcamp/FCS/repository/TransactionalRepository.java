package sophosfinalchallenge.bootcamp.FCS.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sophosfinalchallenge.bootcamp.FCS.entity.Transactional;

@Repository
public interface TransactionalRepository extends JpaRepository<Transactional, Long> {
}

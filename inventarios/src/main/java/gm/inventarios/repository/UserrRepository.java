package gm.inventarios.repository;

import gm.inventarios.entities.Userr;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserrRepository extends CrudRepository<Userr, Long> {


}

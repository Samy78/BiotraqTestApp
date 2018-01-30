package biotraq.test.Models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CapteurRepository extends CrudRepository<Capteur,Integer>{

}

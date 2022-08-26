package pe.com.nttdata.AppMovil_Producer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pe.com.nttdata.AppMovil_Producer.model.Purse;

@Repository
public interface PurseRepository extends MongoRepository<Purse, String> {
}

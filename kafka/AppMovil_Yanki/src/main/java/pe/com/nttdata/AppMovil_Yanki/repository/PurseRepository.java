package pe.com.nttdata.AppMovil_Yanki.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pe.com.nttdata.AppMovil_Yanki.model.Purse;

@Repository
public interface PurseRepository extends MongoRepository<Purse, String> {
}

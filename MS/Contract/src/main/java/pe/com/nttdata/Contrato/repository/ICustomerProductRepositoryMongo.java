package pe.com.nttdata.Contrato.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import pe.com.nttdata.Contrato.model.CustomerProduct;

import java.time.LocalDate;
import java.util.List;

public interface ICustomerProductRepositoryMongo extends MongoRepository<CustomerProduct, Integer> {
    List<CustomerProduct> findByCustomersIdAndProductId(String customersId, String productId);
    List<CustomerProduct> findByCustomerId(String customerId);
    List<CustomerProduct> findByCustomersIdentificationDocument(String identificationDocument);
    List<CustomerProduct> findByProductIdAndRegisterDateBetween(String productId, LocalDate from, LocalDate to);
}

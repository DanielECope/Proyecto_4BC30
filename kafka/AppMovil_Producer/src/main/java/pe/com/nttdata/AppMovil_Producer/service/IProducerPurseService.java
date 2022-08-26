package pe.com.nttdata.AppMovil_Producer.service;

import pe.com.nttdata.AppMovil_Producer.model.Purse;
import pe.com.nttdata.AppMovil_Producer.repository.PurseRepository;

import java.util.List;

public interface IProducerPurseService extends PurseRepository {
    public Purse insert(Purse obj);
    public List<Purse> findAll();
    public List<Purse> findAllById(String id);
}

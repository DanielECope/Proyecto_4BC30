package pe.com.nttdata.AppMovil_Yanki.service;

import pe.com.nttdata.AppMovil_Yanki.model.Purse;

import java.util.List;
import java.util.Optional;

public interface IPurseService{
    public Purse insert(Purse obj);
    public List<Purse> findAll();
}

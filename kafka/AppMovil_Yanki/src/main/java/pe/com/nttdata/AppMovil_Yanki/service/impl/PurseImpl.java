package pe.com.nttdata.AppMovil_Yanki.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.nttdata.AppMovil_Yanki.model.Purse;
import pe.com.nttdata.AppMovil_Yanki.repository.PurseRepository;
import pe.com.nttdata.AppMovil_Yanki.service.IPurseService;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class PurseImpl implements IPurseService {
    @Autowired
    private PurseRepository repo;

    @Override
    public Purse insert(Purse obj) {
        try {
            log.info("Cunsomer => Class: PurseImpl -> Method: insert ->Data: " +obj.toString());
            repo.save(obj);
        }catch (Exception e){
            log.error("Error: "+e.getMessage());
            throw new RuntimeException("Error: "+e.getMessage());
        }
        return obj;
    }

    @Override
    public List<Purse> findAll() {
        return repo.findAll();
    }


}

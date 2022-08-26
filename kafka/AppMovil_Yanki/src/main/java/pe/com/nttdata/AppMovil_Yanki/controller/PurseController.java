package pe.com.nttdata.AppMovil_Yanki.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.com.nttdata.AppMovil_Yanki.model.Purse;
import pe.com.nttdata.AppMovil_Yanki.service.IPurseService;

import java.util.List;


@RestController
@Slf4j
@RequestMapping("/purse")
public class PurseController {
    @Autowired
    private IPurseService service;

    @GetMapping("/findAll")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Purse> findAll() throws Exception {
        log.info("Inicio ::: findAll");
        return service.findAll();
    }


}

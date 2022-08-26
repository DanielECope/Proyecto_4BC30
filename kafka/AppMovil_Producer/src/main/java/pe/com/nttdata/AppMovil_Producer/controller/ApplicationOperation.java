package pe.com.nttdata.AppMovil_Producer.controller;

import org.apache.logging.log4j.message.Message;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ApplicationOperation {
    //aplicación de operaciones
    @Id
    private String id;
    @NotEmpty(message = "Se requiere este campo")
    private BigDecimal amount;
    @NotEmpty(message = "Se requiere este campo")
    private String destinationCell;
    @NotEmpty(message = "Se requiere este campo")
    private String originCell;
    private LocalDateTime registerDate;
    private String messageOptional;
}

package pe.com.nttdata.AppMovil_Producer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Purse {
    private String id;
    @Size(min = 9, max = 12, message = "El cantidad de dígitos ingresado es incorrecto")
    @NotEmpty(message = "se requiere este dato")
    private String phoneNumber;
    @NotEmpty(message = "se requiere este dato")
    private String imei;
    @Email
    @NotEmpty(message = "se requiere este dato")
    private String email;
    private LocalDateTime registerDate;
    private CustomerApp customerApp;
    @NotEmpty(message = "se requiere este dato")
    private String account;
}

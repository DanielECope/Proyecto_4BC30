package pe.com.nttdata.AppMovil_Yanki.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Purse")
public class Purse {

    @Id
    private String id;
    @NotEmpty(message = "El campo name es requerido.")
    @Size(min = 9, max = 11, message = "La cantidad de dígitos es incorrecto")
    private String phoneNumber;
    @NotEmpty(message = "El campo name es requerido.")
    @Indexed(unique=true)
    private String imei;
    @Email(message="Please provide a valid email address")
    private String email;
    private LocalDateTime registerDate;
    private CustomerApp customerApp;
    @NotEmpty(message = "se requiere este dato")
    private String account;



}

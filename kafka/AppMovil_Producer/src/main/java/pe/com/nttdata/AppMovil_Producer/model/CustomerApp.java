package pe.com.nttdata.AppMovil_Producer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "CustomerApp")
public class CustomerApp {
    @Id
    private String id;
    private String documentType;
    private String documentNumber;
}

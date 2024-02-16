package rosarioscilipoti.dipendenti.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data

public class Dipendente {
    @Id
    @GeneratedValue

    private UUID id;
    private String nome;
    private String cognome;
    private String username;
    private String email;


}

package rosarioscilipoti.dipendenti.entites;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Dispotivo {
    @Id
    @GeneratedValue
    private UUID id;
    private String tipo;
    private String stato;

    @ManyToOne
    @JoinColumn(name = "dipendente_id")
    private Dipendente dipendente;


}

package gm.inventarios.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Userr {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usrCode;


    @OneToOne(mappedBy = "userr", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    @JsonIgnore
    private Login login;

    private Integer usrIdRol;
    private String usrName;
    private String usrDni;
    private String usrPhone;

    // Getters and setters
}

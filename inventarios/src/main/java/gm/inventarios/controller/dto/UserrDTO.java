package gm.inventarios.controller.dto;

import gm.inventarios.entities.Login;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserrDTO {


    private Long usrCode;


    private Login login;

    private Integer usrIdRol;
    private String usrName;
    private String usrDni;
    private String usrPhone;

}

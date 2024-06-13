

package gm.inventarios.controller;


import gm.inventarios.controller.dto.UserrDTO;
import gm.inventarios.entities.Userr;
import gm.inventarios.service.IUserrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/userr")
public class UserrController {

    @Autowired
    private IUserrService userrService;

    @GetMapping("/find/{usrCode}")
    public ResponseEntity<?> findById(@PathVariable Long usrCode) {
        Optional<Userr> userrOptional = userrService.findById(usrCode);

        if (userrOptional.isPresent()) {
            Userr userr = userrOptional.get() ;

            UserrDTO userrDTO = UserrDTO.builder()
                    .usrCode(userr.getUsrCode())
                    .usrName(userr.getUsrName())
                    .usrPhone(userr.getUsrPhone())
                    .usrDni(userr.getUsrDni())
                    .usrIdRol(userr.getUsrIdRol())
                    .build();
            return ResponseEntity.ok(userrDTO);
        }
        return ResponseEntity.notFound().build();
    }

}

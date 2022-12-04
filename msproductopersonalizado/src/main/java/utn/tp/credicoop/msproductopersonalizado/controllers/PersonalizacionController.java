package utn.tp.credicoop.msproductopersonalizado.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import utn.tp.credicoop.msproductopersonalizado.controllers.dtos.PersonalizacionDTO;
import utn.tp.credicoop.msproductopersonalizado.entities.Personalizacion;
import utn.tp.credicoop.msproductopersonalizado.repositories.PersonalizacionJPA;

@RestController
public class PersonalizacionController {

    @Autowired
    PersonalizacionJPA personalizacionJPA;

    @Autowired
    PosiblePersonalizacionProxy posiblePersonalizacionProxy;

    @Transactional
    @PostMapping("/personalizacion/crearpersonalizacion")
    public @ResponseBody ResponseEntity<String> agregarPersonalizacion(@RequestBody PersonalizacionDTO personalizacionDTO){
        Personalizacion personalizacion = new Personalizacion(personalizacionDTO);
        personalizacionJPA.save(personalizacion);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}

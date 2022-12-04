package utn.tp.credicoop.msproductobase.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import utn.tp.credicoop.msproductobase.controllers.dtos.AreaDePersonalizacionDTO;
import utn.tp.credicoop.msproductobase.entities.AreaDePersonalizacion;
import utn.tp.credicoop.msproductobase.repositories.AreaDePersonalizacionJPA;


@RestController
public class AreaDePersonalizacionController {
    @Autowired
    AreaDePersonalizacionJPA areaDePersonalizacionJPA;

    @Transactional
    @PostMapping("/area/creararea")
    public @ResponseBody ResponseEntity<String> agregarAreaDePersonalizacion(@RequestBody AreaDePersonalizacionDTO areaDTO){
        AreaDePersonalizacion areaDePersonalizacion = new AreaDePersonalizacion(areaDTO);
        areaDePersonalizacionJPA.save(areaDePersonalizacion);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}

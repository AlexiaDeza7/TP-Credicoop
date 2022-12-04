package utn.tp.credicoop.msventas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import utn.tp.credicoop.msventas.controllers.dtos.CarritoDTO;
import utn.tp.credicoop.msventas.controllers.dtos.PublicacionDTO;
import utn.tp.credicoop.msventas.entities.Carrito;
import utn.tp.credicoop.msventas.entities.Publicacion;
import utn.tp.credicoop.msventas.repositories.CarritoJPA;
import utn.tp.credicoop.msventas.repositories.PublicacionJPA;

@RestController
public class PublicacionController {
    @Autowired
    PublicacionJPA publicacionJPA;

    @Autowired
    ProductoProxy productoProxy;

    @Transactional
    @PostMapping("/publicacion/crearpublicacion")
    public @ResponseBody ResponseEntity<String> agregarPublicacion(@RequestBody PublicacionDTO publicacionDTO){
        Publicacion publicacion = new Publicacion(publicacionDTO);
        publicacionJPA.save(publicacion);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}

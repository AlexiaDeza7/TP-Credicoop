package utn.tp.credicoop.msproductobase.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import utn.tp.credicoop.msproductobase.controllers.dtos.GestorDTO;
import utn.tp.credicoop.msproductobase.entities.Gestor;
import utn.tp.credicoop.msproductobase.repositories.GestorJPA;


@RestController
public class GestorController {

    @Autowired
    GestorJPA gestorJPA;

    @Transactional
    @PostMapping("/gestor/creargestor")
    public @ResponseBody ResponseEntity<String> agregarGestor(@RequestBody GestorDTO gestorDTO){
        Gestor gestor = new Gestor(gestorDTO);
        gestorJPA.save(gestor);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}

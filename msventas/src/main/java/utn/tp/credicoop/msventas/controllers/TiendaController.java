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
import utn.tp.credicoop.msventas.controllers.dtos.TiendaDTO;
import utn.tp.credicoop.msventas.entities.Carrito;
import utn.tp.credicoop.msventas.entities.Tienda;
import utn.tp.credicoop.msventas.repositories.CarritoJPA;
import utn.tp.credicoop.msventas.repositories.TiendaJPA;

@RestController
public class TiendaController {
    @Autowired
    TiendaJPA tiendaJPA;

    @Transactional
    @PostMapping("/tienda/creartienda")
    public @ResponseBody ResponseEntity<String> agregarTienda(@RequestBody TiendaDTO tiendaDTO){
        Tienda tienda = new Tienda(tiendaDTO);
        tiendaJPA.save(tienda);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}

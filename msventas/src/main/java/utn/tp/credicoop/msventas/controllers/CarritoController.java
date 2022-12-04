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
import utn.tp.credicoop.msventas.entities.Carrito;
import utn.tp.credicoop.msventas.repositories.CarritoJPA;

@RestController
public class CarritoController {
    @Autowired
    CarritoJPA carritoJPA;

    @Transactional
    @PostMapping("/carrito/crearcarrito")
    public @ResponseBody ResponseEntity<String> agregarCarrito(@RequestBody CarritoDTO carritoDTO){
        Carrito carrito = new Carrito(carritoDTO);
        carritoJPA.save(carrito);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}

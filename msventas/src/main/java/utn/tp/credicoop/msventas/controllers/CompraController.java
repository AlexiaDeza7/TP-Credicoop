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
import utn.tp.credicoop.msventas.controllers.dtos.CompraDTO;
import utn.tp.credicoop.msventas.entities.Carrito;
import utn.tp.credicoop.msventas.entities.Compra;
import utn.tp.credicoop.msventas.repositories.CarritoJPA;
import utn.tp.credicoop.msventas.repositories.CompraJPA;

@RestController
public class CompraController {
    @Autowired
    CompraJPA compraJPA;

    @Transactional
    @PostMapping("/compra/crearcompra")
    public @ResponseBody ResponseEntity<String> agregarCompra(@RequestBody CompraDTO compraDTO){
        Compra compra = new Compra(compraDTO);
        compraJPA.save(compra);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}

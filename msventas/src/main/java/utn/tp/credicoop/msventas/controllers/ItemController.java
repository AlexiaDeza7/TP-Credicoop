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
import utn.tp.credicoop.msventas.controllers.dtos.ItemDTO;
import utn.tp.credicoop.msventas.entities.Carrito;
import utn.tp.credicoop.msventas.entities.Item;
import utn.tp.credicoop.msventas.repositories.CarritoJPA;
import utn.tp.credicoop.msventas.repositories.ItemJPA;

@RestController
public class ItemController {
    @Autowired
    ItemJPA itemJPA;

    @Transactional
    @PostMapping("/item/crearitem")
    public @ResponseBody ResponseEntity<String> agregarItem(@RequestBody ItemDTO itemDTO){
        Item item = new Item(itemDTO);
        itemJPA.save(item);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}

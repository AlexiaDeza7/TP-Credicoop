package utn.tp.credicoop.msproductobase.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import utn.tp.credicoop.msproductobase.controllers.dtos.ProductoBaseDTO;
import utn.tp.credicoop.msproductobase.entities.ProductoBase;
import utn.tp.credicoop.msproductobase.repositories.ProductoBaseJPA;

import java.util.Optional;

@RestController
public class ProductoBaseController {

    @Autowired
    ProductoBaseJPA productoBaseJPA;

    @Transactional
    @PostMapping("/productobase/crearproducto")
    public @ResponseBody ResponseEntity<String> agregarProductoBase(@RequestBody ProductoBaseDTO productoBaseDTO){
        ProductoBase producto = new ProductoBase(productoBaseDTO);
        productoBaseJPA.save(producto);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @GetMapping("/productobase/proxy/{idProdBase}")
    public ProductoBaseDTO buscarPorId(@PathVariable("idProdBase") Long id){
        Optional<ProductoBase> productoBase = productoBaseJPA.findById(id);
        ProductoBaseDTO productoBaseDTO = new ProductoBaseDTO(productoBase);
        return productoBaseDTO;
    }
}
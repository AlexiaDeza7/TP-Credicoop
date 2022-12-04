package utn.tp.credicoop.msproductopersonalizado.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import utn.tp.credicoop.msproductopersonalizado.controllers.dtos.ProductoBaseDTO;
import utn.tp.credicoop.msproductopersonalizado.controllers.dtos.ProductoDTO;
import utn.tp.credicoop.msproductopersonalizado.entities.Producto;
import utn.tp.credicoop.msproductopersonalizado.repositories.ProductoJPA;

import java.util.Optional;

@RestController
public class ProductoController {

    @Autowired
    ProductoJPA productoJPA;

    @Autowired
    ProductoBaseProxy productoBaseProxy;

    @Transactional
    @PostMapping("/producto/crearproducto")
    public @ResponseBody ResponseEntity<String> agregarProducto(@RequestBody ProductoDTO productoDTO){
        ProductoBaseDTO productoBase = productoBaseProxy.buscarPorId(productoDTO.getIdProductoBase());
        Producto producto = new Producto(productoDTO);
        producto.calcularPrecioFinal(productoBase.getPrecioBase());
        productoJPA.save(producto);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @GetMapping("/producto/proxy/{idProd}")
    public ProductoDTO buscarPorId(@PathVariable("idProd") Long id){
        Optional<Producto> producto = productoJPA.findById(id);
        ProductoDTO productoDTO = new ProductoDTO(producto);
        return productoDTO;
    }
}

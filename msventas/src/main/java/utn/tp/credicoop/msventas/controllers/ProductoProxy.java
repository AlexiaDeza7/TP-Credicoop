package utn.tp.credicoop.msventas.controllers;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import utn.tp.credicoop.msventas.controllers.dtos.ProductoDTO;

@FeignClient(name= "producto")
public interface ProductoProxy {

    @GetMapping("/producto/proxy/{idProd}")
    ProductoDTO buscarPorId(@PathVariable("idProd") Long id);
}

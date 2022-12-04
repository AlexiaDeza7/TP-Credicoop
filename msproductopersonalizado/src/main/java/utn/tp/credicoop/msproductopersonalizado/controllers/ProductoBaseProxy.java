package utn.tp.credicoop.msproductopersonalizado.controllers;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import utn.tp.credicoop.msproductopersonalizado.controllers.dtos.ProductoBaseDTO;

@FeignClient(name="productobase")
public interface ProductoBaseProxy {

    @GetMapping("/productobase/proxy/{idProdBase}")
    ProductoBaseDTO buscarPorId(@PathVariable("idProdBase") Long id);
}

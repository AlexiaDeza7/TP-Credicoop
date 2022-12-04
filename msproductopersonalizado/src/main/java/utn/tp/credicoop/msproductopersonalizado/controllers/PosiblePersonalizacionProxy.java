package utn.tp.credicoop.msproductopersonalizado.controllers;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import utn.tp.credicoop.msproductopersonalizado.controllers.dtos.PosiblePersonalizacionDTO;

@FeignClient(name="posiblepersonalizacion")
public interface PosiblePersonalizacionProxy {

    @GetMapping("/posiblepersonalizacion/proxy/{idPosPer}")
    PosiblePersonalizacionDTO buscarPorId(@PathVariable("idPosPer") Long id);
}

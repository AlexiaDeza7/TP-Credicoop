package utn.tp.credicoop.msproductobase.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import utn.tp.credicoop.msproductobase.controllers.dtos.PosiblePersonalizacionDTO;
import utn.tp.credicoop.msproductobase.controllers.dtos.ProductoBaseDTO;
import utn.tp.credicoop.msproductobase.entities.PosiblePersonalizacion;
import utn.tp.credicoop.msproductobase.entities.ProductoBase;
import utn.tp.credicoop.msproductobase.repositories.PosiblePersonalizacionJPA;

import java.util.Optional;


@RestController
public class PosiblePersonalizacionController {
    @Autowired
    PosiblePersonalizacionJPA posiblePersonalizacionJPA;

    @Transactional
    @PostMapping("/posiblepersonalizacion/crearposiblepersonalizacion")
    public @ResponseBody ResponseEntity<String> agregarPosiblePersonalizacion(@RequestBody PosiblePersonalizacionDTO posiblePersonalizacionDTO){
        PosiblePersonalizacion posibleper = new PosiblePersonalizacion(posiblePersonalizacionDTO);
        posiblePersonalizacionJPA.save(posibleper);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @GetMapping("/posiblepersonalizacion/proxy/{idPosPer}")
    public PosiblePersonalizacionDTO buscarPorId(@PathVariable("idPosPer") Long id){
        Optional<PosiblePersonalizacion> posiblePersonalizacion = posiblePersonalizacionJPA.findById(id);
        PosiblePersonalizacionDTO posiblePersonalizacionDTO = new PosiblePersonalizacionDTO(posiblePersonalizacion);
        return posiblePersonalizacionDTO;
    }
}

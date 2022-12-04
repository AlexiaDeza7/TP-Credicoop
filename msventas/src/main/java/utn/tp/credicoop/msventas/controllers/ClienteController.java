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
import utn.tp.credicoop.msventas.controllers.dtos.ClienteDTO;
import utn.tp.credicoop.msventas.entities.Carrito;
import utn.tp.credicoop.msventas.entities.Cliente;
import utn.tp.credicoop.msventas.repositories.CarritoJPA;
import utn.tp.credicoop.msventas.repositories.ClienteJPA;

@RestController
public class ClienteController {
    @Autowired
    ClienteJPA clienteJPA;

    @Transactional
    @PostMapping("/cliente/crearcliente")
    public @ResponseBody ResponseEntity<String> agregarCliente(@RequestBody ClienteDTO clienteDTO){
        Cliente cliente = new Cliente(clienteDTO);
        clienteJPA.save(cliente);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}

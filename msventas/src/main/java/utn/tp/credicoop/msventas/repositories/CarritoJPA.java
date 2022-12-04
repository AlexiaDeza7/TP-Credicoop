package utn.tp.credicoop.msventas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import utn.tp.credicoop.msventas.entities.Carrito;

@RepositoryRestResource(path="carrito")
public interface CarritoJPA extends JpaRepository<Carrito, Long> {
}

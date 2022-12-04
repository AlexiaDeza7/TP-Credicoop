package utn.tp.credicoop.msventas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import utn.tp.credicoop.msventas.entities.Tienda;

@RepositoryRestResource(path = "tienda")
public interface TiendaJPA extends JpaRepository<Tienda,Long> {
}

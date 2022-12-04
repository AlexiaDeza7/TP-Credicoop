package utn.tp.credicoop.msproductobase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import utn.tp.credicoop.msproductobase.entities.Gestor;

@RepositoryRestResource(path = "gestor")
public interface GestorJPA extends JpaRepository<Gestor, Long> {
}

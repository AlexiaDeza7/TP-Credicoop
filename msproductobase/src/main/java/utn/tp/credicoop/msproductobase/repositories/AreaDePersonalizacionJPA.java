package utn.tp.credicoop.msproductobase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import utn.tp.credicoop.msproductobase.entities.AreaDePersonalizacion;

@RepositoryRestResource(path ="area")
public interface AreaDePersonalizacionJPA extends JpaRepository<AreaDePersonalizacion,Long> {
}

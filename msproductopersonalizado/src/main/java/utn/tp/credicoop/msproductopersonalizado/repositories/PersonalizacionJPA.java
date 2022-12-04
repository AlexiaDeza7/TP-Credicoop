package utn.tp.credicoop.msproductopersonalizado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import utn.tp.credicoop.msproductopersonalizado.entities.Personalizacion;

@RepositoryRestResource(path= "personalizacion")
public interface PersonalizacionJPA extends JpaRepository<Personalizacion, Long> {
}

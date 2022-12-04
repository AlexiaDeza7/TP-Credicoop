package utn.tp.credicoop.msproductobase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import utn.tp.credicoop.msproductobase.entities.ProductoBase;

@RepositoryRestResource(path = "productobase")
public interface ProductoBaseJPA extends JpaRepository<ProductoBase, Long> {

}

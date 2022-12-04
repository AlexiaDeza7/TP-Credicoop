package utn.tp.credicoop.msventas.controllers.dtos;

import utn.tp.credicoop.msventas.controllers.dtos.PersonalizacionDTO;
import utn.tp.credicoop.msventas.controllers.dtos.ProductoDTO;

import java.util.Optional;

public class ProductoDTO {

    private Long id;

    private Long idProdBase;

    private PersonalizacionDTO personalizacion;

    private Double precioFinal; // = productoBase.getPrecioBase() + personalizacion.getPrecioPersonalizacion();

    public ProductoDTO(){}

    public ProductoDTO(Long id, Long idProdBase, PersonalizacionDTO personalizacion, Double precioFinal) {
        this.id = id;
        this.idProdBase = idProdBase;
        this.personalizacion = personalizacion;
        this.precioFinal = precioFinal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdProductoBase() {
        return idProdBase;
    }

    public void setIdProductoBase(Long idProductoBase) {
        this.idProdBase = idProductoBase;
    }

    public PersonalizacionDTO getPersonalizacion() {
        return personalizacion;
    }

    public void setPersonalizacion(PersonalizacionDTO personalizacion) {
        this.personalizacion = personalizacion;
    }

    public Double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(Double precioFinal) {
        this.precioFinal = precioFinal;
    }
}

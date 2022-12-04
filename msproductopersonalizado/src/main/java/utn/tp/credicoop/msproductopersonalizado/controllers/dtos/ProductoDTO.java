package utn.tp.credicoop.msproductopersonalizado.controllers.dtos;

import utn.tp.credicoop.msproductopersonalizado.entities.Personalizacion;
import utn.tp.credicoop.msproductopersonalizado.entities.Producto;

import javax.persistence.*;
import java.util.Optional;

public class ProductoDTO {

    private Long id;

    private Long idProdBase;

    private Personalizacion personalizacion;

    private Double precioFinal;

    public ProductoDTO(){}

    public ProductoDTO(Long id, Long idProdBase, Personalizacion personalizacion, Double precioFinal) {
        this.id = id;
        this.idProdBase = idProdBase;
        this.personalizacion = personalizacion;
        this.precioFinal = precioFinal;
    }
    public ProductoDTO(Optional<Producto> productoOptional){
        this.id = productoOptional.get().getId();
        this.idProdBase = productoOptional.get().getIdProdBase();
        this.personalizacion=productoOptional.get().getPersonalizacion();
        this.precioFinal = productoOptional.get().getPrecioFinal();
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

    public Personalizacion getPersonalizacion() {
        return personalizacion;
    }

    public void setPersonalizacion(Personalizacion personalizacion) {
        this.personalizacion = personalizacion;
    }

    public Double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(Double precioFinal) {
        this.precioFinal = precioFinal;
    }
}

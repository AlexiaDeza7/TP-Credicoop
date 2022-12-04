package utn.tp.credicoop.msproductopersonalizado.controllers.dtos;

import utn.tp.credicoop.msproductopersonalizado.entities.Producto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class PersonalizacionDTO {

    private Long id;

    private Long idPosPer;

    private Producto producto;


    private String contenido;

    private String nombre;


    private Double precioPersonalizacion;

    public PersonalizacionDTO(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Long getIdPosPer() {
        return idPosPer;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecioPersonalizacion() {
        return precioPersonalizacion;
    }

    public void setPrecioPersonalizacion(Double precioPersonalizacion) {
        this.precioPersonalizacion = precioPersonalizacion;
    }
}

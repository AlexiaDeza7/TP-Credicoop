package utn.tp.credicoop.msventas.controllers.dtos;

import utn.tp.credicoop.msventas.controllers.dtos.ProductoDTO;

public class PersonalizacionDTO {

    private Long id;

    private ProductoDTO producto;


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

    public ProductoDTO getProducto() {
        return producto;
    }

    public void setProducto(ProductoDTO producto) {
        this.producto = producto;
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

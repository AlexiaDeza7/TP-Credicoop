package utn.tp.credicoop.msventas.controllers.dtos;

import utn.tp.credicoop.msventas.entities.Carrito;
import utn.tp.credicoop.msventas.entities.Publicacion;

import javax.persistence.*;

public class ItemDTO {

    private Long id;

    private Carrito carrito;

    private Publicacion publicacion;

    private Integer cantidad;

    public ItemDTO(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}

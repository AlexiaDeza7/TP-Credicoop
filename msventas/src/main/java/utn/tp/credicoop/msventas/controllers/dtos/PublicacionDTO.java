package utn.tp.credicoop.msventas.controllers.dtos;

import utn.tp.credicoop.msventas.entities.EstadoPubli;
import utn.tp.credicoop.msventas.entities.Item;
import utn.tp.credicoop.msventas.entities.Tienda;

import javax.persistence.*;
import java.time.LocalDate;

public class PublicacionDTO {

    private Long id;

    private Long idProd;

    private Item item;

    private Tienda tienda;

    private LocalDate fecha;

    private EstadoPubli estado;

    private String nombre;

    public PublicacionDTO(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdProd() {
        return idProd;
    }

    public void setIdProd(Long idProd) {
        this.idProd = idProd;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public EstadoPubli getEstado() {
        return estado;
    }

    public void setEstado(EstadoPubli estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

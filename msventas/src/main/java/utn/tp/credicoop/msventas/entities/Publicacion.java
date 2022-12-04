package utn.tp.credicoop.msventas.entities;


import utn.tp.credicoop.msventas.controllers.dtos.PublicacionDTO;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="publicacion")
public class Publicacion  {

    @Id
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name ="idproducto", nullable = false)
    private Long idProd;

    @OneToOne(mappedBy = "publicacion", cascade = CascadeType.ALL)
    private Item item;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tienda_id", referencedColumnName = "id")
    private Tienda tienda;


    @Column(name="fecha",columnDefinition = "DATE")
    private LocalDate fecha;


    @Enumerated(EnumType.STRING)
    private EstadoPubli estado;


    @Column(name="nombre")
    private String nombre;

    public Publicacion(){}

    public Publicacion(PublicacionDTO publicacionDTO){
        this.id = publicacionDTO.getId();
        this.item= publicacionDTO.getItem();
        this.estado = publicacionDTO.getEstado();
        this.nombre = publicacionDTO.getNombre();
        this.fecha = publicacionDTO.getFecha();
        this.tienda = publicacionDTO.getTienda();
        this.idProd= publicacionDTO.getIdProd();

    }

    public Publicacion(Long id,Long idProd, Item item, Tienda tienda, LocalDate fecha, EstadoPubli estado, String nombre) {
        this.id = id;
        this.idProd= idProd;
        this.item = item;
        this.tienda = tienda;
        this.fecha = fecha;
        this.estado = estado;
        this.nombre = nombre;
        this.idProd = idProd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

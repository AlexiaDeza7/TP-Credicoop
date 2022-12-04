package utn.tp.credicoop.msventas.entities;


import utn.tp.credicoop.msventas.controllers.dtos.ItemDTO;
import utn.tp.credicoop.msventas.entities.Publicacion;


import javax.persistence.*;

@Entity
@Table(name="item")

public class Item {

    @Id
    @Column(name="id", nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="carrito_id", referencedColumnName = "id")
    private Carrito carrito;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="publicacion_id", referencedColumnName = "id")
    private Publicacion publicacion;

    @Column(name= "cantidad")
    private Integer cantidad;

    public Item(){}

    public Item(ItemDTO itemDTO){
        this.id = itemDTO.getId();
        this.carrito = itemDTO.getCarrito();
        this.publicacion = itemDTO.getPublicacion();
        this.cantidad = itemDTO.getCantidad();
    }

    public Item(Long id, Carrito carrito, Publicacion publicacion, Integer cantidad) {
        this.id = id;
        this.carrito = carrito;
        this.publicacion = publicacion;
        this.cantidad = cantidad;
    }

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

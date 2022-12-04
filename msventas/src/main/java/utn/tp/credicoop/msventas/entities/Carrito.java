package utn.tp.credicoop.msventas.entities;

import utn.tp.credicoop.msventas.controllers.dtos.CarritoDTO;
import utn.tp.credicoop.msventas.entities.Cliente;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table( name="carrito")
public class Carrito{

    @Id
    @Column(name="id", nullable = false)
    private Long id;

    @OneToMany(mappedBy = "carrito", cascade = CascadeType.ALL)
    private List<Item> item;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="cliente_id", referencedColumnName = "id")
    private Cliente cliente;

    @OneToOne(mappedBy = "carrito", cascade = CascadeType.ALL)
    private Compra compra;

    public Carrito(){
        this.item= new ArrayList<>();
    }

    public Carrito(CarritoDTO carritoDTO){
        this.id = carritoDTO.getId();
        this.item = carritoDTO.getItem();
        this.cliente = carritoDTO.getCliente();
        this.compra = carritoDTO.getCompra();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Carrito(Long id, List<Item> item, Cliente cliente, Compra compra) {
        this.id = id;
        this.item = item;
        this.cliente = cliente;
        this.compra = compra;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }


    public void agregarItem(Item item1){
        this.item.add(item1);
    }
    public void eliminarItem(Item item1){
        this.item.remove(item1);
    }
}

package utn.tp.credicoop.msventas.entities;


import utn.tp.credicoop.msventas.controllers.dtos.CompraDTO;
import utn.tp.credicoop.msventas.entities.Vendedor;
import utn.tp.credicoop.msventas.entities.Cliente;
import utn.tp.credicoop.msventas.entities.Carrito;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="compra")

public class Compra {

    @Id
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name= "fecha",columnDefinition = "DATE")
    private LocalDate fecha;

    @JoinColumn(name="carrito_id", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL)
    private Carrito carrito;

    @ManyToOne( cascade = CascadeType.ALL)
    @JoinColumn(name="cliente_id", referencedColumnName = "id")
    private Cliente cliente;

    @ManyToOne(cascade =CascadeType.ALL)
    @JoinColumn(name= "vendedor_id", referencedColumnName = "id")
    private Vendedor vendedor;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    public Compra(){}

    public Compra(CompraDTO compraDTO){
        this.id = compraDTO.getId();
        this.carrito = compraDTO.getCarrito();
        this.cliente = compraDTO.getCliente();
        this.estado = compraDTO.getEstado();
        this.fecha = compraDTO.getFecha();
        this.vendedor = compraDTO.getVendedor();
    }

    public Compra(Long id, LocalDate fecha, Carrito carrito, Cliente cliente, Vendedor vendedor, Estado estado) {
        this.id = id;
        this.fecha = fecha;
        this.carrito = carrito;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}

package utn.tp.credicoop.msventas.entities;

import utn.tp.credicoop.msventas.controllers.dtos.VendedorDTO;
import utn.tp.credicoop.msventas.entities.Tienda;
import javax.persistence.*;

@Entity
@Table(name="vendedor")
public class Vendedor  {

    @Id
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name= "nombre")
    private String nombre;

    @Column(name= "apellido")
    private String apellido;

    @Column(name= "dni")
    private Integer dni;

    @Column(name= "medioDePago")
    private String medioDePago;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="tienda_id", referencedColumnName = "id")
    private Tienda tienda;

    public Vendedor(){}

    public Vendedor(VendedorDTO vendedorDTO){
        this.id = vendedorDTO.getId();
        this.dni = vendedorDTO.getDni();
        this.nombre = vendedorDTO.getNombre();
        this.apellido = vendedorDTO.getApellido();
        this.tienda = vendedorDTO.getTienda();
        this.medioDePago = vendedorDTO.getMedioDePago();
    }

    public Vendedor(Long id, String nombre, String apellido, Integer dni, String medioDePago, Tienda tienda) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.medioDePago = medioDePago;
        this.tienda = tienda;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getMedioDePago() {
        return medioDePago;
    }

    public void setMedioDePago(String medioDePago) {
        this.medioDePago = medioDePago;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }
}

package utn.tp.credicoop.msventas.entities;


import utn.tp.credicoop.msventas.controllers.dtos.ClienteDTO;
import utn.tp.credicoop.msventas.entities.Carrito;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="cliente")

public class Cliente  {

    @Id
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name= "direccion")
    private String direccion;

    @Column(name= "telefono")
    private Integer telefono;

    @Column(name= "dni")
    private Integer dni;

    @Column(name= "nombre")
    private String nombre;

    @Column(name= "apellido")
    private String apellido;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Carrito> carrito;

    public Cliente(){
        this.carrito= new ArrayList<>();
    }

    public Cliente(ClienteDTO clienteDTO){
        this.id = clienteDTO.getId();
        this.nombre = clienteDTO.getNombre();
        this.apellido = clienteDTO.getApellido();
        this.dni = clienteDTO.getDni();
        this.direccion = clienteDTO.getDireccion();
        this.telefono = clienteDTO.getTelefono();
        this.carrito = clienteDTO.getCarrito();
    }

    public Cliente(Long id, String direccion, Integer telefono, Integer dni, String nombre, String apellido, List<Carrito> carrito) {
        this.id = id;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrito = carrito;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
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

    public List<Carrito> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<Carrito> carrito) {
        this.carrito = carrito;
    }
}

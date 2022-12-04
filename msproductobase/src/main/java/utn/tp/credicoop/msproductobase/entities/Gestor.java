package utn.tp.credicoop.msproductobase.entities;


import utn.tp.credicoop.msproductobase.controllers.dtos.GestorDTO;
import utn.tp.credicoop.msproductobase.entities.ProductoBase;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="gestor")

public class Gestor  {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name= "nombre")
    private String nombre;

    @Column(name= "apellido")
    private String apellido;

    @Column(name= "dni")
    private Integer dni;

    @OneToMany(mappedBy = "gestor", cascade = CascadeType.ALL)
    private List<ProductoBase> productoBase;

    public Gestor(GestorDTO gestorDTO){
        this.id=gestorDTO.getId();
        this.nombre = gestorDTO.getNombre();
        this.apellido = gestorDTO.getApellido();
        this.dni = gestorDTO.getDni();
        this.productoBase = getProductoBase();
    }
    public Gestor(){
        this.productoBase = new ArrayList<>();
    }

    public Gestor(Long id, String nombre, String apellido, Integer dni, List<ProductoBase> productoBase) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.productoBase = productoBase;
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

    public List<ProductoBase> getProductoBase() {
        return productoBase;
    }

    public void setProductoBase(List<ProductoBase> productoBase) {
        this.productoBase = productoBase;
    }




    public void agregarProductoBase(ProductoBase produc){
        this.productoBase.add(produc);
    }
    public void eliminarProductoBase(ProductoBase produc){
        this.productoBase.remove(produc);
    }





}

package utn.tp.credicoop.msproductobase.controllers.dtos;

import utn.tp.credicoop.msproductobase.entities.ProductoBase;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

public class GestorDTO {


    private Long id;


    private String nombre;

    private String apellido;

    private Integer dni;

    private List<ProductoBase> productoBase;

    public GestorDTO(){
        this.productoBase = new ArrayList<>();
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

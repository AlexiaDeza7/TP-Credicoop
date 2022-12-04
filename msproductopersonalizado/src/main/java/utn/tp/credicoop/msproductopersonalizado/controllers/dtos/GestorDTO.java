package utn.tp.credicoop.msproductopersonalizado.controllers.dtos;


import java.util.ArrayList;
import java.util.List;

public class GestorDTO {

    private Long id;

    private String nombre;

    private String apellido;

    private Integer dni;

    private List<ProductoBaseDTO> productoBase;

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

    public List<ProductoBaseDTO> getProductoBase() {
        return productoBase;
    }

    public void setProductoBase(List<ProductoBaseDTO> productoBase) {
        this.productoBase = productoBase;
    }


    public void agregarProductoBase(ProductoBaseDTO produc){
        this.productoBase.add(produc);
    }
    public void eliminarProductoBase(ProductoBaseDTO produc){
        this.productoBase.remove(produc);
    }

}

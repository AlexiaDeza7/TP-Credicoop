package utn.tp.credicoop.msproductopersonalizado.controllers.dtos;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductoBaseDTO {

    private Long id;

    private String nombre;

    private String descripcion;

    private Double precioBase;


    private Double tiempoFabricacionHoras;


    private GestorDTO gestor;

    private List<PosiblePersonalizacionDTO> posiblePersonalizacion;


    public ProductoBaseDTO(){
        this.posiblePersonalizacion= new ArrayList<>();
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Double getTiempoFabricacionHoras() {
        return tiempoFabricacionHoras;
    }

    public void setTiempoFabricacionHoras(Double tiempoFabricacionHoras) {
        this.tiempoFabricacionHoras = tiempoFabricacionHoras;
    }

    public GestorDTO getGestor() {
        return gestor;
    }

    public void setGestor(GestorDTO gestor) {
        this.gestor = gestor;
    }

    public List<PosiblePersonalizacionDTO> getPosiblePersonalizacion() {
        return posiblePersonalizacion;
    }

    public void setPosiblePersonalizacion(List<PosiblePersonalizacionDTO> posiblePersonalizacion) {
        this.posiblePersonalizacion = posiblePersonalizacion;
    }

}

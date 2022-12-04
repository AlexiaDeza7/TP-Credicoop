package utn.tp.credicoop.msproductobase.controllers.dtos;

import utn.tp.credicoop.msproductobase.entities.Gestor;
import utn.tp.credicoop.msproductobase.entities.PosiblePersonalizacion;
import utn.tp.credicoop.msproductobase.entities.ProductoBase;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductoBaseDTO {

    private Long id;

    private String nombre;

    private String descripcion;

    private Double precioBase;


    private Double tiempoFabricacionHoras;


    private Gestor gestor;

    private List<PosiblePersonalizacion> posiblePersonalizacion;


    public ProductoBaseDTO(){
        this.posiblePersonalizacion= new ArrayList<>();
    }

    public ProductoBaseDTO(Long id, String nombre, String descripcion, Double precioBase, Double tiempoFabricacionHoras, Gestor gestor, List<PosiblePersonalizacion> posiblePersonalizacion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.tiempoFabricacionHoras = tiempoFabricacionHoras;
        this.gestor = gestor;
        this.posiblePersonalizacion = posiblePersonalizacion;
    }

    public ProductoBaseDTO(Optional<ProductoBase> productoBaseOptional){
        this.id = productoBaseOptional.get().getId();
        this.nombre = productoBaseOptional.get().getNombre();
        this.precioBase = productoBaseOptional.get().getPrecioBase();
        this.descripcion = productoBaseOptional.get().getDescripcion();
        this.tiempoFabricacionHoras = productoBaseOptional.get().getTiempoFabricacionHoras();
        this.posiblePersonalizacion = productoBaseOptional.get().getPosiblePersonalizacion();
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

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    public List<PosiblePersonalizacion> getPosiblePersonalizacion() {
        return posiblePersonalizacion;
    }

    public void setPosiblePersonalizacion(List<PosiblePersonalizacion> posiblePersonalizacion) {
        this.posiblePersonalizacion = posiblePersonalizacion;
    }

}

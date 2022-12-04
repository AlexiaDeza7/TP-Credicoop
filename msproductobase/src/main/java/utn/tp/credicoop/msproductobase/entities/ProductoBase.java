package utn.tp.credicoop.msproductobase.entities;


//import domain.models.exceptions.PosiblePersonalizacionException;
import utn.tp.credicoop.msproductobase.controllers.dtos.ProductoBaseDTO;
import utn.tp.credicoop.msproductobase.entities.Gestor;
import utn.tp.credicoop.msproductobase.entities.PosiblePersonalizacion;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="producto_base")

public class ProductoBase  {

    @Id
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name= "nombre")
    private String nombre;

    @Column(name= "descripcion")
    private String descripcion;

    @Column(name= "precioBase")
    private double precioBase;


    @Column(name= "tiempoFabricacionHoras")
    private double tiempoFabricacionHoras;

    @ManyToOne( cascade = CascadeType.ALL)
    @JoinColumn(name= "gestor_id", referencedColumnName = "id")
    private Gestor gestor;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="idproductobase", referencedColumnName = "id")
    private List<PosiblePersonalizacion> posiblePersonalizacion;


    public ProductoBase(){
        this.posiblePersonalizacion= new ArrayList<>();
    }
    public ProductoBase(ProductoBaseDTO productoBaseDTO){
        this.id =productoBaseDTO.getId();
        this.nombre = productoBaseDTO.getNombre();
        this.precioBase = productoBaseDTO.getPrecioBase();
        this.descripcion = productoBaseDTO.getDescripcion();
        this.gestor = productoBaseDTO.getGestor();
        this.tiempoFabricacionHoras = productoBaseDTO.getTiempoFabricacionHoras();
        this.posiblePersonalizacion = productoBaseDTO.getPosiblePersonalizacion();
    }

    public ProductoBase(Long id, String nombre, String descripcion, double precioBase, double tiempoFabricacionHoras, Gestor gestor, List<PosiblePersonalizacion> posiblePersonalizacion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.tiempoFabricacionHoras = tiempoFabricacionHoras;
        this.gestor = gestor;
        this.posiblePersonalizacion = posiblePersonalizacion;
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

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public double getTiempoFabricacionHoras() {
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
    /* public void agregarPosiblePersonalizacion(PosiblePersonalizacion posiblePer) throws PosiblePersonalizacionException{
        if(this.getPosiblePersonalizacion().contains(posiblePer)){
            throw  new PosiblePersonalizacionException("Ya es una posible personalizacion de este producto",posiblePer,this);
        }

        this.posiblePersonalizacion.add(posiblePer);
    }

    public void eliminarPosiblePersonalizacion(PosiblePersonalizacion posiblePer ){
        this.posiblePersonalizacion.remove(posiblePer);
    }*/

}

package utn.tp.credicoop.msproductopersonalizado.entities;

import utn.tp.credicoop.msproductopersonalizado.controllers.dtos.PersonalizacionDTO;

import javax.persistence.*;

@Entity
@Table(name="personalizacion")
public class Personalizacion {

    @Id
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name ="idposiblepersonalizacion", nullable = false)
    private Long idPosPer;

    @OneToOne(mappedBy = "personalizacion", cascade = CascadeType.ALL)
    private Producto producto;


    @Column(name= "contenido")
    private String contenido;

    @Column(name= "nombre")
    private String nombre;

    @Column(name= "precioPersonalizacion")
    private Double precioPersonalizacion;

    public Personalizacion(){}

    public Long getIdPosPer() {
        return idPosPer;
    }

    public Personalizacion(PersonalizacionDTO personalizacionDTO){
        this.id = personalizacionDTO.getId();
        this.nombre = personalizacionDTO.getNombre();
        this.contenido = personalizacionDTO.getContenido();
        this.precioPersonalizacion = personalizacionDTO.getPrecioPersonalizacion();
        this.producto = personalizacionDTO.getProducto();
        this.idPosPer= personalizacionDTO.getIdPosPer();
    }

    public Personalizacion(Long id,Long idPosPer, Producto producto, String contenido, String nombre, Double precioPersonalizacion) {
        this.id = id;
        this.producto = producto;
        this.contenido = contenido;
        this.nombre = nombre;
        this.precioPersonalizacion = precioPersonalizacion;
        this.idPosPer = idPosPer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }


    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecioPersonalizacion() {
        return precioPersonalizacion;
    }

    public void setPrecioPersonalizacion(Double precioPersonalizacion) {
        this.precioPersonalizacion = precioPersonalizacion;
    }
}

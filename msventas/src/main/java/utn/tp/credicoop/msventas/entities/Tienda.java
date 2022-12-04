package utn.tp.credicoop.msventas.entities;


import utn.tp.credicoop.msventas.controllers.dtos.TiendaDTO;
import utn.tp.credicoop.msventas.entities.Vendedor;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="tienda")
public class Tienda  {

    @Id
    @Column(name="id", nullable = false)
    private Long id;
    @OneToMany(mappedBy = "tienda", cascade = CascadeType.ALL)
    private List<Publicacion> publicacion;

    @OneToOne(mappedBy = "tienda", cascade = CascadeType.ALL)
    private Vendedor vendedor;

    public Tienda(){
        this.publicacion= new ArrayList<>();
    }

    public Tienda(TiendaDTO tiendaDTO){
        this.id = tiendaDTO.getId();
        this.publicacion = tiendaDTO.getPublicacion();
        this.vendedor = tiendaDTO.getVendedor();
    }

    public Tienda(Long id, List<Publicacion> publicacion, Vendedor vendedor) {
        this.id = id;
        this.publicacion = publicacion;
        this.vendedor = vendedor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Publicacion> getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(List<Publicacion> publicacion) {
        this.publicacion = publicacion;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void agregarPublicacion(Publicacion publi){
        this.publicacion.add(publi);
    }
    public void eliminarPublicacion(Publicacion publi){
        this.publicacion.remove(publi);
    }

}

package utn.tp.credicoop.msventas.controllers.dtos;

import utn.tp.credicoop.msventas.entities.Publicacion;
import utn.tp.credicoop.msventas.entities.Vendedor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

public class TiendaDTO {


    private Long id;

    private List<Publicacion> publicacion;


    private Vendedor vendedor;

    public TiendaDTO(){
        this.publicacion= new ArrayList<>();
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

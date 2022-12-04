package utn.tp.credicoop.msproductobase.controllers.dtos;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class AreaDePersonalizacionDTO {

    private Long id;

    private String nombreDeArea;

    public Long getId() {
        return id;
    }

    public AreaDePersonalizacionDTO(){}
    public String getNombreDeArea() {
        return nombreDeArea;
    }

    public void setNombreDeArea(String nombreDeArea) {
        this.nombreDeArea = nombreDeArea;
    }
}

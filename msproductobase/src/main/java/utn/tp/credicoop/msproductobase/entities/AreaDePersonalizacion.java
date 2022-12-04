package utn.tp.credicoop.msproductobase.entities;


import utn.tp.credicoop.msproductobase.controllers.dtos.AreaDePersonalizacionDTO;

import javax.persistence.*;

@Entity
@Table(name="area_personalizacion")

public class AreaDePersonalizacion  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name= "nombreDeArea")
    private String nombreDeArea;

    public AreaDePersonalizacion(){}

    public AreaDePersonalizacion(AreaDePersonalizacionDTO areaDePersonalizacionDTO){
        this.id= areaDePersonalizacionDTO.getId();
        this.nombreDeArea= areaDePersonalizacionDTO.getNombreDeArea();
    }

    public AreaDePersonalizacion(Long id, String nombreDeArea) {
        this.id = id;
        this.nombreDeArea = nombreDeArea;
    }

    public Long getId() {
        return id;
    }

    public String getNombreDeArea() {
        return nombreDeArea;
    }

    public void setNombreDeArea(String nombreDeArea) {
        this.nombreDeArea = nombreDeArea;
    }
}

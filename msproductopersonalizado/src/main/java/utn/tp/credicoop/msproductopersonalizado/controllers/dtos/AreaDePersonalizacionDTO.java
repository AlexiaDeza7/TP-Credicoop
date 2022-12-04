package utn.tp.credicoop.msproductopersonalizado.controllers.dtos;

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

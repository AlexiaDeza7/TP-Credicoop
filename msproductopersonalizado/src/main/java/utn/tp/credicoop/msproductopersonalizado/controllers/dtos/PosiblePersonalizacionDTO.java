package utn.tp.credicoop.msproductopersonalizado.controllers.dtos;


import com.google.common.base.Optional;

public class PosiblePersonalizacionDTO {

    private Long id;


    private AreaDePersonalizacionDTO areaDePersonalizacion;


    private TipoDePersonalizacion tipoDePersonalizacion;



    public PosiblePersonalizacionDTO(){}

    public PosiblePersonalizacionDTO(Long id, AreaDePersonalizacionDTO areaDePersonalizacion, TipoDePersonalizacion tipoDePersonalizacion) {
        this.id = id;
        this.areaDePersonalizacion = areaDePersonalizacion;
        this.tipoDePersonalizacion = tipoDePersonalizacion;
    }

    public PosiblePersonalizacionDTO(Optional<PosiblePersonalizacionDTO> posiblePersonalizacionOptional){
        this.id =posiblePersonalizacionOptional.get().getId();
        this.areaDePersonalizacion = posiblePersonalizacionOptional.get().getAreaDePersonalizacion();
        this.tipoDePersonalizacion = posiblePersonalizacionOptional.get().getTipoDePersonalizacion();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public AreaDePersonalizacionDTO getAreaDePersonalizacion() {
        return areaDePersonalizacion;
    }

    public void setAreaDePersonalizacion(AreaDePersonalizacionDTO areaDePersonalizacions) {
        this.areaDePersonalizacion = areaDePersonalizacions;
    }

    public TipoDePersonalizacion getTipoDePersonalizacion() {
        return tipoDePersonalizacion;
    }

    public void setTipoDePersonalizacion(TipoDePersonalizacion tipoDePersonalizacions) {
        this.tipoDePersonalizacion = tipoDePersonalizacions;
    }

}

package utn.tp.credicoop.msproductobase.controllers.dtos;

import utn.tp.credicoop.msproductobase.entities.AreaDePersonalizacion;
import utn.tp.credicoop.msproductobase.entities.PosiblePersonalizacion;
import utn.tp.credicoop.msproductobase.entities.TipoDePersonalizacion;

import java.util.Optional;

public class PosiblePersonalizacionDTO {


    private Long id;


    private AreaDePersonalizacion areaDePersonalizacion;


    private TipoDePersonalizacion tipoDePersonalizacion;




    public PosiblePersonalizacionDTO(Optional<PosiblePersonalizacion> posiblePersonalizacionOptional){
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


    public AreaDePersonalizacion getAreaDePersonalizacion() {
        return areaDePersonalizacion;
    }

    public void setAreaDePersonalizacion(AreaDePersonalizacion areaDePersonalizacions) {
        this.areaDePersonalizacion = areaDePersonalizacions;
    }

    public TipoDePersonalizacion getTipoDePersonalizacion() {
        return tipoDePersonalizacion;
    }

    public void setTipoDePersonalizacion(TipoDePersonalizacion tipoDePersonalizacions) {
        this.tipoDePersonalizacion = tipoDePersonalizacions;
    }

}

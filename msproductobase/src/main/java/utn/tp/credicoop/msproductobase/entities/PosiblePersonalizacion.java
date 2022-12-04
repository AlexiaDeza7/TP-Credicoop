package utn.tp.credicoop.msproductobase.entities;



import utn.tp.credicoop.msproductobase.controllers.dtos.PosiblePersonalizacionDTO;

import javax.persistence.*;

@Entity
@Table(name="posible_personalizacion")

public class PosiblePersonalizacion  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long id;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="area_personalizacion_id", referencedColumnName = "id")
    private AreaDePersonalizacion areaDePersonalizacion;

    @Enumerated(EnumType.STRING)
    private TipoDePersonalizacion tipoDePersonalizacion;



    public PosiblePersonalizacion(){}

    public PosiblePersonalizacion(PosiblePersonalizacionDTO posiblePersonalizacionDTO){
        this.id = posiblePersonalizacionDTO.getId();
        this.areaDePersonalizacion = posiblePersonalizacionDTO.getAreaDePersonalizacion();
        this.tipoDePersonalizacion = posiblePersonalizacionDTO.getTipoDePersonalizacion();
    }

    public PosiblePersonalizacion(Long id, AreaDePersonalizacion areaDePersonalizacion, TipoDePersonalizacion tipoDePersonalizacion, ProductoBase productoBase) {
        this.id = id;
        this.areaDePersonalizacion = areaDePersonalizacion;
        this.tipoDePersonalizacion = tipoDePersonalizacion;
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

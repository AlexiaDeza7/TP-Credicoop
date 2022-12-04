package utn.tp.credicoop.msproductopersonalizado.entities;

import utn.tp.credicoop.msproductopersonalizado.controllers.dtos.ProductoDTO;

import javax.persistence.*;

@Entity
@Table(name="producto")

public class Producto {

   @Id
   @Column(name = "id", nullable = false)
   private Long id;

   @Column(name ="idproductobase", nullable = false)
   private Long idProdBase;

   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name="personalizacion_id", referencedColumnName = "id")
   private Personalizacion personalizacion;

   @Column(name= "precioFinal")
   private Double precioFinal; // = productoBase.getPrecioBase() + personalizacion.getPrecioPersonalizacion();


   public Producto(){}

   public Producto(ProductoDTO productoDTO){
      this.id = productoDTO.getId();
      this.personalizacion = productoDTO.getPersonalizacion();
      this.precioFinal = productoDTO.getPrecioFinal();
      this.idProdBase= productoDTO.getIdProductoBase();
   }

   public Producto(Long id, Long idProdBase, Personalizacion personalizacion, Double precioFinal) {
      this.id = id;
      this.idProdBase = idProdBase;
      this.personalizacion = personalizacion;
      this.precioFinal = precioFinal;
      this.idProdBase =idProdBase;
   }

   public void calcularPrecioFinal(double precioProductoBase){
      double precioPersonalizacion = personalizacion.getPrecioPersonalizacion();
      double precioFinal = precioPersonalizacion + precioProductoBase;
      setPrecioFinal(precioFinal);
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public Long getIdProdBase() {
      return idProdBase;
   }

   public void setIdProdBase(Long idProdBase) {
      this.idProdBase = idProdBase;
   }

   public Personalizacion getPersonalizacion() {
      return personalizacion;
   }

   public void setPersonalizacion(Personalizacion personalizacion) {
      this.personalizacion = personalizacion;
   }

   public Double getPrecioFinal() {
      return precioFinal;
   }

   public void setPrecioFinal(Double precioFinal) {
      this.precioFinal = precioFinal;
   }
}

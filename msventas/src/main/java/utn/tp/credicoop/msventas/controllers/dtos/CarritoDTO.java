package utn.tp.credicoop.msventas.controllers.dtos;

import utn.tp.credicoop.msventas.entities.Cliente;
import utn.tp.credicoop.msventas.entities.Compra;
import utn.tp.credicoop.msventas.entities.Item;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class CarritoDTO {

    private Long id;

    private List<Item> item;

    private Cliente cliente;


    private Compra compra;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public CarritoDTO(){
        this.item= new ArrayList<>();
    }

    public void agregarItem(Item item1){
        this.item.add(item1);
    }
    public void eliminarItem(Item item1){
        this.item.remove(item1);
    }
}

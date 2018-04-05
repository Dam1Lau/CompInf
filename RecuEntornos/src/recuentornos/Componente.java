/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuentornos;

/**
 *
 * @author Laura
 */
public abstract class Componente implements Comparable<Componente> {

    protected String idProducto, nombreModelo;
    protected int stock;
    protected Fabricante fabricante;

    public Componente() {
    }

    public Componente(String idProducto) {
        this();
        this.idProducto = idProducto;

    }

    public Componente(String idProducto, String nombreModelo, int stock, Fabricante fabricante) {
        this.idProducto = idProducto;
        this.nombreModelo = nombreModelo;
        this.stock = stock;
        this.fabricante = fabricante;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public abstract double calcularCoste(int cantidad);

    @Override
    public String toString() {
        return "Identificador del Producto: " + idProducto + "\nModelo: " + nombreModelo + "\nCantidad en stock: " + stock + "\nFabricante: " + fabricante;
    }
     @Override
    public int compareTo(Componente o) {
       return this.stock-o.stock;
    }
}

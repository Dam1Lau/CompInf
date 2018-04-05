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
public class Cpu extends Componente {

    private int numNucleos, velocidad;
    private double precio;

    public Cpu() {
    }
    
    public Cpu(String id){
        super.idProducto = id;
    }

    public Cpu(int numNucleos, int velocidad, String idProducto, String nombreModelo, int stock, Fabricante fabricante, double precio) {
        super(idProducto, nombreModelo, stock, fabricante);
        this.numNucleos = numNucleos;
        this.velocidad = velocidad;
        this.precio = precio;
    }

    public int getNumNucleos() {
        return numNucleos;
    }

    public void setNumNucleos(int numNucleos) {
        this.numNucleos = numNucleos;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double calcularCoste(int cantidad){
        double precioFinal;
        return precioFinal = this.precio * cantidad;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nNúmero de Nucleos: " + numNucleos + "\nVelocidad (Ghz): " + velocidad;
    }

   
    
    
}

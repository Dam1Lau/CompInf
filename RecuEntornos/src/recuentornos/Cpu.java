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

    public Cpu() {
    }

    public Cpu(int numNucleos, int velocidad, String idProducto, String nombreModelo, int stock, Fabricante fabricante) {
        super(idProducto, nombreModelo, stock, fabricante);
        this.numNucleos = numNucleos;
        this.velocidad = velocidad;
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

    @Override
    public String toString() {
        return super.toString() + "\nNúmero de Nucleos: " + numNucleos + "\nVelocidad (Ghz): " + velocidad;
    }
    
    
}

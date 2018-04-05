/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuentornos;

import java.util.Arrays;

/**
 *
 * @author Laura
 */
public class Ram extends Componente {

    private String tipo;
    private int[] capacidades;
    private double precio;

    public Ram() {
    }
    
    public Ram(String id){
        super.idProducto = id;
    }
    
    public Ram(String tipo, int[] capacidades, String idProducto, String nombreModelo, int stock, Fabricante fabricante, double precio) {
        super(idProducto, nombreModelo, stock, fabricante);
        this.tipo = tipo;
        this.capacidades = capacidades;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int[] getCapacidades() {
        return capacidades;
    }

    public void setCapacidades(int[] capacidades) {
        this.capacidades = capacidades;

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double calcularCoste(int cantidad) {
        double precioFinal;
            if(this.getTipo().equalsIgnoreCase("sram"))
                precioFinal = this.precio * cantidad;
            else
                precioFinal = this.precio * 1.2 * cantidad;
            
        return precioFinal ;
    }

    @Override
    public String toString() {
//        StringBuilder capa = new StringBuilder();
//        for (int i = 0; i < capacidades.length; i++) {
//            capa.append(capacidades[i]).append(" GB //    ");
//        }
        return super.toString() + "\nRAM de tipo " + tipo + "Capacidad (GB): " + Arrays.toString(capacidades);
    }

}

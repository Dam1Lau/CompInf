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
public class Ram extends Componente {
    private String tipo;
    private int[] capacidades;

    public Ram() {
    }

    public Ram(String tipo, int[] capacidades, String idProducto, String nombreModelo, int stock, Fabricante fabricante) {
        super(idProducto, nombreModelo, stock, fabricante);
        this.tipo = tipo;
        this.capacidades = capacidades;
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

    @Override
    public String toString() {
        StringBuilder capa = new StringBuilder();
        for (int i = 0; i < capacidades.length; i++) {
            capa.append(capacidades[i]).append(" GB //    ");
        }
        return super.toString() + "\nRAM de tipo " + tipo + "Capacidad (GB): " + capa.toString();
    }
    
    
}

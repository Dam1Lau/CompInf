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
public class Fabricante {
    private String CIF, nombreComercial;
    private int telefono;

    public Fabricante() {
        CIF = "Test CIF";
        nombreComercial = "T" + Math.random()*10;
        telefono = 666555444;
    }

    public Fabricante(String CIF, String nombreComercial, int telefono) {
        this.CIF = CIF;
        this.nombreComercial = nombreComercial;
        this.telefono = telefono;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Fabricante  " + nombreComercial + " - CIF :" + CIF + " - Teléfono: " + telefono;
    }
    
    
}

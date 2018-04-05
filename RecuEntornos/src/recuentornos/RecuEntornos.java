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
public class RecuEntornos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Inventario inv = new Inventario();
//        inv.listarAtributosComunes();
//        inv.ordenarStock();
        inv.listarComponentes();
        inv.ordenarStock();
    }

}

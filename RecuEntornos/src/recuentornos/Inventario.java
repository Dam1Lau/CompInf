/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuentornos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Inventario {

    private Componente[] componentes;

    public Inventario() {
        componentes = new Componente[3];
        componentes[0] = new Cpu(4, 12, "Id001", "Modelo 1", 25, new Fabricante(), 15);
        componentes[1] = new Cpu(8, 24, "Id0000", "Modelo 2", 3, new Fabricante(), 10);
        componentes[2] = new Ram("AMD", new int[]{40, 20, 10}, "IDP 001", "Modelo GG", 80, new Fabricante(), 20);
    }

    public Componente[] getComponentes() {
        return componentes;
    }

    public void setComponentes(Componente[] componentes) {
        this.componentes = componentes;
    }

    public void listarComponentes() {
        System.out.println("======== Listado de todos los componentes en inventario: =========");
        for (int i = 0; i < componentes.length; i++) {
            if (componentes[i] != null) {
                System.out.println(componentes[i].toString() + "\n ");
            }
        }
        System.out.println("========                 Fin inventario                  =========");
    }

    public void listarAtributosComunes() {
        System.out.println("======== Listado de: =========");
        for (int i = 0; i < componentes.length; i++) {
            if (componentes[i] != null) {
                System.out.println("\nID producto: " + componentes[i].getIdProducto());
                System.out.println("Modelo: " + componentes[i].getNombreModelo());
                System.out.println("Fabricante: " + componentes[i].getFabricante());
                System.out.println("Stock: " + componentes[i].getStock());
            }
        }
        System.out.println("========  FIN LISTA  =========");

    }

    public boolean darAlta(String id) {
        boolean altaCorrecta = false;
        int opcion;
        Scanner lector = new Scanner(System.in);
        System.out.println("Añadir nuevo componente al inventario: 1- RAM   2- CPU");
        opcion = lector.nextInt();
        for (int i = 0; i < componentes.length && altaCorrecta == false; i++) {
            if (componentes[i] == null && opcion == 1) {
                componentes[i] = new Ram(id);
                altaCorrecta = true;
            } else if (opcion == 2) {
                componentes[i] = new Cpu(id);
                altaCorrecta = true;
            }
        }
        return altaCorrecta;
    }

    public int darBaja(Fabricante fabricante) {
        int numeroBajas = 0;
        for (int i = 0; i < componentes.length; i++) {
            if (componentes[i] != null && componentes[i].fabricante.equals(fabricante)) {
                componentes[i] = null;
                numeroBajas++;
            }
        }

        return numeroBajas;
    }

    public void modificarComponente(String id) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Va a modificar el/los componentes con id " + id + " en su totalidad.");
        for (int i = 0; i < componentes.length; i++) {
            if (componentes[i] != null && componentes[i].getIdProducto().equalsIgnoreCase(id)) {
                if (componentes[i].getClass().getSimpleName().equalsIgnoreCase("ram")) {
                    do {

                    } while (true);
                } else {
                    System.out.println("Nuevo nombre del modelo (anterior: '" + componentes[i].getNombreModelo() + "' )");
                    componentes[i].setNombreModelo(lector.nextLine());
                    System.out.println("Nuevo fabricante (fabricante anterior: '" + componentes[i].getFabricante() + "' )");
                }
            }
        }

    }

    public void ordenarStock() {
      Arrays.sort(componentes);
      Arrays.toString(componentes);
    }
   
}

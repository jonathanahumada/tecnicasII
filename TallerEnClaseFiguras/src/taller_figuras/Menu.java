/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_figuras;

import java.util.Scanner;
import taller_figuras.figuras.Cilindro;
import taller_figuras.figuras.Circulo;
import taller_figuras.figuras.Esfera;

/**
 *
 * @author felip
 */
public class Menu {

     public static void main(String[] args) {
        Menu menu = new Menu();
        menu.desplegarMenu();
    }
     
    private Scanner scanner = new Scanner(System.in);    
    private ContenedorFiguras contenedor =  new ContenedorFiguras();
        
    public void desplegarMenu() {
        mostrarOpciones();
        int opcionSeleccionada = Integer.parseInt(scanner.nextLine());
        ejecutarOpcion(opcionSeleccionada);
        desplegarMenu();
    }    

    private void mostrarOpciones() {
        String strMenu = "\nTaller en clase 3: Figuras.";
        strMenu += "\n1. Agregar/Reemplazar figura.";
        strMenu += "\n2. Precargar lo que es el sistema.";
        strMenu += "\n3. Mostrar figuras.";
        strMenu += "\n4. Dar sumatoria de areas.";
        strMenu += "\n5. Dar sumatoria de volumenes.";
        strMenu += "\n6. Eliminar figura por tipo.";
        strMenu += "\n0. Salir.";
        
        System.out.println(strMenu);
    }

    private void ejecutarOpcion(int opcionSeleccionada) {
        switch (opcionSeleccionada) {
            case 0:
                System.exit(0);
                break;
            case 1:
                agregarFigura();
                break;            
            case 2:
                precargarSistema();
                break;
            case 3:
                mostrarFiguras();
                break;
            case 4:
                darSumatoriaDeAreas();
                break;
            case 5:
                darSumatoriaDeVolumenes();
                break;
            case 6:
                darEliminarFigurasPorTipo();
                break;                
        }
    }

    private void precargarSistema() {
        contenedor.agregarFigura(new Circulo(1));
        contenedor.agregarFigura(new Circulo(3));
        contenedor.agregarFigura(new Circulo(2));
        contenedor.agregarFigura(new Esfera(1));
        contenedor.agregarFigura(new Esfera(3));
        contenedor.agregarFigura(new Esfera(2));
        contenedor.agregarFigura(new Cilindro(1, 1));
        contenedor.agregarFigura(new Cilindro(3, 3));
        contenedor.agregarFigura(new Cilindro(2, 2));
    }
    
    private void agregarFigura() {
        imprimirMensajeAgregarFigura();
        String linea = scanner.nextLine();
        String datos[] = linea.split("&");
        
        agregarFigura(datos);
        
        System.out.println("Salida:");
        System.out.println("La figura ha sido agregada.");
    }
    
    private void imprimirMensajeAgregarFigura() {
        System.out.println("Opcion 1: agregar figura.");
        System.out.println("Ingrese los datos."); ;
        System.out.println("Para circulos o esferas: <circulo|esfera>&<radio>");
        System.out.println("Para cilindros: <cilindro>&<radio>&<altura>");        
    }

    private void agregarFigura(String[] datos) {
        Circulo figura = null;
        
        if (datos.length == 3)
            figura = new Cilindro(Double.parseDouble(datos[1]), Double.parseDouble(datos[2]));
        else if (datos.length == 2 && datos[0].equals(ContenedorFiguras.CIRCULO))
            figura = new Circulo(Double.parseDouble(datos[1]));
        else if (datos.length == 2 && datos[0].equals(ContenedorFiguras.ESFERA))
            figura = new Esfera(Double.parseDouble(datos[1]));
        
        contenedor.agregarFigura(figura);
    }
    
    private void mostrarFiguras() {
        System.out.println("Opcion 2: mostrar figuras.");
        System.out.println("Salida:");
        System.out.println(contenedor);
    }

    private void darSumatoriaDeAreas() {
        System.out.println("Opcion 3: dar sumatoria areas.");
        System.out.println("Salida: " + contenedor.darSumatoriaDeAreas());
    }

    private void darSumatoriaDeVolumenes() {
        System.out.println("Opcion 4: dar sumatoria volumenes.");
        System.out.println("Salida: " + contenedor.darSumatoriaDeVolumenes());
    }

    private void darEliminarFigurasPorTipo() {
        System.out.println("Opcion 5: eliminar figuras por tipo.");
        System.out.println("Ingrese el tipo de figura: <circulo|esfera|cilindro>");
        String tipo = scanner.nextLine();
        contenedor.eliminarFigurasPorTipo(tipo);
        System.out.println("Salida: las figuras han sido eliminadas.");
    }
}
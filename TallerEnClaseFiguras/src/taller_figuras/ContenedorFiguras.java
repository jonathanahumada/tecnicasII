/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_figuras;

import java.util.ArrayList;
import taller_figuras.figuras.Circulo;
import taller_figuras.figuras.Esfera;
import taller_figuras.figuras.Cilindro;
        

/**
 *
 * @author felip
 */
public class ContenedorFiguras {
    
    public static final String CIRCULO  = "circulo";
    public static final String ESFERA   = "esfera";
    public static final String CILINDRO = "cilindro";

    private ArrayList<Circulo> figuras = new ArrayList<>();
    
    public void agregarFigura(Circulo circulo) {
        figuras.add(circulo);
    }

    public double darSumatoriaDeAreas() {
       double sumatoria = 0;
        for (int i = 0; i < figuras.size(); i++) {
           sumatoria += figuras.get(i).darArea();
            
        }
        return sumatoria;
    }

    public double darSumatoriaDeVolumenes() {
          double sumatoria = 0;
        for (int i = 0; i < figuras.size(); i++) {
          if(!(figuras.get(i).darTipo().equals( "circulo"))) sumatoria += figuras.get(i).darVolumen();
            
        }
        return sumatoria;
       
    }

    public void eliminarFigurasPorTipo(String tipo) {
        System.out.println("tttt"+(figuras.get(0) instanceof Circulo));
        System.out.println(figuras.get(0).darTipo());
      switch(tipo){
          case CIRCULO:
              for (int i = 0; i < figuras.size(); i++) {
                  if(figuras.get(i).darTipo().equals(CIRCULO)){figuras.remove(i);
                  i--;
                  }
              }
              break;
          case ESFERA:
               for (int i = 0; i < figuras.size(); i++) {
                  if(figuras.get(i).darTipo().equals(ESFERA)){figuras.remove(i);
                  i--;}
              }
              break;
          case CILINDRO:
               for (int i = 0; i < figuras.size(); i++) {
                   System.out.println("valor de size pre" + figuras.size());
                  if(figuras.get(i).darTipo().equals(CILINDRO)){figuras.remove(i);
                      System.out.println("valor de i: " + i);
                      i--;
                      System.out.println("valor de size()" + figuras.size());
                  }
            
              
      
      }
     break;          
    }
    }
    
    @Override
    public String toString(){
        String msj= "";
        for (int i = 0; i < figuras.size(); i++) {
            msj += figuras.get(i).toString() + "\n";
            
        }
        return msj;
    }
}
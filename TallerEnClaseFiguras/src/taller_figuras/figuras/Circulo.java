/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_figuras.figuras;

import taller_figuras.ContenedorFiguras;

/**
 *
 * @author felip
 */
public class Circulo {
    
    protected double radio;
      private String  tipo;
    
    public Circulo(double radio){
        this.radio = radio;
         this.tipo = ContenedorFiguras.CIRCULO;
        
    }
    
    public double getRadio(){
    return radio;
    }
    
    public double darArea() {
        return 2*Math.PI *radio;
    }
    
    public double darPerimetro() {
        return 2 * Math.PI * radio;
    }
    
    public double darVolumen(){
    return 0;
    }
    public String darTipo(){
    
    return tipo;
    }
    
     @Override
    public String toString(){
    return "{\"tipo\": \""+ tipo +"\", "+" \"r\": "+ radio+ " \"area\": " + darArea() +" }";
    }
}

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
public class Esfera extends Circulo{
    String tipo;

    public Esfera(double radio) {
        super(radio);   
        this.tipo = ContenedorFiguras.ESFERA;
        
    }
    @Override
       public String darTipo(){
    
    return this.tipo;
    }
    
    @Override
    public double darArea() {
        return 2 * super.darPerimetro() * radio;
    }
    
    public double darVolumen() {
        return (4/(double)3) * super.darArea() * radio;
    }
     @Override
    public String toString(){
    return "{\"tipo\": \""+ tipo +"\", "+" \"r\": "+ radio+  " \"area\": " + darArea() + " \"volumen\": " + darVolumen()+" }";
    }
}

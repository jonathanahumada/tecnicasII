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
public class Cilindro extends Circulo {
    
    private double altura; 
    
    private String  tipo;
    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
        this.tipo = ContenedorFiguras.CILINDRO;
    }
    
    @Override
    public double darArea() {
        double areaLateral = super.darPerimetro() * altura;
        double areaBases = 2 * (super.darArea() * super.darArea());
        return areaLateral + areaBases;
    }
      @Override
       public String darTipo(){
    
    return this.tipo;
    }
    
    public double darVolumen() {
        return super.darArea() * altura;
    }
    
     @Override
    public String toString(){
    return "{\"tipo\": \""+ tipo +"\", "+" \"r\": "+ radio+ " \"h\": " +altura+ " \"area\": " + darArea() + " \"volumen\": " + darVolumen()+" }";
    }
}

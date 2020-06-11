/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion_figuras;

/**
 *
 * @author juan_
 */
public class Circulo extends Figura{
private float r;
    @Override
    public float calcularArea() {
       float resul=3.1416f*r*r;
       return resul;
    }
    
    public void  setRadio(float r){
        this.r= r;
        
    }
    public float getR(float r){
        return r;
    }
    
}

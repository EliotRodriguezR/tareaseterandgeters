/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion_figuras;

public class Triangulo extends Figura {

   private float base;
    private float altura;

    @Override
    public float calcularArea() {
        float resul = base * altura / 2;
        return resul;
    }


public void setAltura(float altura){
    
    this.altura= altura;
}

public void setBase(float base){
    this.base=base;
}

 public float getBase() {
        return base;
    }
public float getAltura(){
    
    return altura;
} 
}

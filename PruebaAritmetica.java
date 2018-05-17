/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

/**
 *
 * @author XMZ6446
 */
public class PruebaAritmetica {
    public static void main (String args[]){
        Aritmetica objt1= new Aritmetica ();
        
        int resultado =objt1.sumar(5, 4);
        System.out.println("Resultado suma directa objt1: "+ resultado);
        
        System.out.println("Resultado: " + objt1.sumar());
        
        Aritmetica objt2 = new Aritmetica (2,1);
        System.out.println("Resultado: " + objt2.sumar());
    
        
        
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Yesica
 */
public class Dispositivo implements Serializable{
   
    
    public ArrayList tablaMultiplicar (int numeroA){
        ArrayList <Integer> resultado = new ArrayList();
        int i;
        for (i=1; i<=100;i++){
            resultado.add(numeroA*i);
            System.out.println(resultado.get(i-1));
        }
        return resultado;
    }
    
    public ArrayList divisor(int numeroA){
       ArrayList <Integer> divisores = new ArrayList();
       int i;
       for (i=1; i<=numeroA+1; i++){    
            if(numeroA % i == 0) {
                divisores.add(i);
            }
        }
       return divisores;
    }
    
    
    public ArrayList calcularNumerosPares (int numeroA, int numeroB){
        ArrayList <Integer> numeros = new ArrayList ();
        int i;
        for (i=numeroA;i<numeroB+1;i++){
            if (i%2==0) {
                numeros.add(i);
            }
            
          
        }
      return numeros ;   
    }
   
    
    public double calcularCoseno(double numero){
        double c = numero * Math.PI/180.0;
        double coseno = Math.cos(c);
        
        return coseno;
    }
    
}

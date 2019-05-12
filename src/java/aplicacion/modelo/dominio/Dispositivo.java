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
   
    /**
     * calcula la tabla de multiplicar de los primero s 100 numeros y devuelve una lista
     * @param numeroA
     * @return 
     */
    public ArrayList tablaMultiplicar (int numeroA){
        ArrayList <Integer> resultado = new ArrayList();
        int i;
        for (i=1; i<=100;i++){
            resultado.add(numeroA*i);
            System.out.println(resultado.get(i-1));
        }
        return resultado;
    }
    
    /**
     * calcula los divisores de un numero y devuelve una lista 
     * @param numeroA
     * @return 
     */
    
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
    
    /**
     * calcula los numeros pares entre dos numeros ingresados y devuelve una lista
     * @param numeroA
     * @param numeroB
     * @return 
     */
    
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
   
    /**
     * calcula el coseno a traves de la serie de Mauclaurin
     * @param numero
     * @return 
     */
    public double calcularCoseno(double numero){
        double c = numero * Math.PI/180.0;
        double coseno = Math.cos(c);
        
        return coseno;
    }
    
}

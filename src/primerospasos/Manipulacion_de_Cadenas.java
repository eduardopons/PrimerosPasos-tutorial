/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;

/**
 *
 * @author Eduardo
 */
public class Manipulacion_de_Cadenas {
    public static void main (String args[]){
        
        String nombre= "Eduardo";
        System.out.print("Mi tiene " + nombre.length() +"letras"  + "la primera letra es" +nombre.charAt(0)) ;
        
        String frase=(" ya tu sabes");
        String frase_resumen=frase.substring(0);
        
        //string. equals  es para comparar cadenas
        //string.equalsIgnoreCase es para dejar de tener en cuenta las mayusculas
        
    }
}

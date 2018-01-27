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
public class manipula_cadenas {
    
    String nombre= "Cadena";
    int x=nombre.length(); //nos devuelve la cantidad de caracteres que posee la cadena, su longitud.
    char z= nombre.charAt(0); //nos retorna la letra de la cadena, de la cual hemos pasado su posicion.
    char y= nombre.charAt(nombre.length()-1); //ultima letra de la cadena. es -1 porque el length nos da 6 y la ultima posicion es 5.   

    String variable= "Hoy es un buen dia para no comer huevos";
    String frase_resumen= variable.substring(0, 3); // esto retorna solo una parte de la cadena seleccionada, en este caso retona Hoy, el segundo numbero es el primer elemento que no queremos extraer
    boolean d= variable.equals(nombre); // retorna verdadero o falso si las cadenas son iguales o no.
    boolean f=variable.equalsIgnoreCase(nombre); //  retorna verdadero o falso si las cadenas son iguales o no, pero ignora los casos en las mayusculas y minusculas.
     
}

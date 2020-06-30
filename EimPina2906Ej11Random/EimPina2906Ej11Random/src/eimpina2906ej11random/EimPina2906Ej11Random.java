/*
 * This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.
You should have received a copy of the GNU General Public License
along with this program. If not, see <https://www.gnu.org/licenses/>.
 */


package eimpina2906ej11random;

import java.util.*;
import java.util.concurrent.TimeUnit;


public class EimPina2906Ej11Random {

    
   /*
    *Tomar el sistema de Piedra, Papel y Tijera, 
    *realizado en clase viernes 19/06 y agregar la siguiente lógica:
    *    - Permir 3 jugadas 
    *    - Que tenga un tablero con los puntos de los jugadores, 
    *    que se muestre al final del juego indicando el ganador.
    */
    
   
    public static void main(String[] args) throws InterruptedException {


    String separador="------------------------------------------------------";   
    boolean noescorrecto;
    int contadordejugadas=0;
    final int jugadas = 3;     //constante de jugadas permitidas

    
    Random objrandom = new Random();   //creo objeto de la clase tipo random 
    Scanner lector = new Scanner(System.in);

    int numerorandom;
    String jugador1,respuesta1;
    String jugador2="Bot",respuesta2="";
    
    int puntosjugador1=0;
    int puntosjugador2=0;

 
    System.out.println(separador);   
    System.out.println(separador);   
    System.out.println("Bienvenido para jugar piedra papel o tijera:"); 
    
    // Pide nombre a los jugadores
    
    do{
        System.out.println("Ingrese el nombre del primer jugador:"); 
        jugador1=lector.nextLine();
    }while((!jugador1.matches("[a-zA-Z]+")));  //valida que la cadena ingresada sea alfabetico

    System.out.println("Ud jugara contra "+jugador2+".");   
    //System.out.println("Ingrese el nombre del segundo jugador:");  
    //jugador2=lector.nextLine();
    
    
do{       
    System.out.println("\tReglas de juego:");
    System.out.println("Ingrese PI para PIedra:");   
    System.out.println("Ingrese PA para PApel:");   
    System.out.println("Ingrese T para Tijera:");   
    
    //Pide opciones a los jugadores
    do{
        System.out.println("Ingrese opcion de "+jugador1+":");   
        respuesta1=lector.nextLine();
        //System.out.println("Ingrese opcion de "+jugador1+":");   
        //respuesta2=lector.next();
        noescorrecto = (respuesta1.equals("PI") ) ||   
                (respuesta1.equals("PA")  ||
                ((respuesta1.equals("T"))) );
    }while (noescorrecto == false) ;
    
    //genera numero aleatorio y segun el numero q salga asigna un valor
    
    numerorandom = objrandom.nextInt(3)+1;
    
    switch (numerorandom){
            case 1: respuesta2 = "PI";
            break;
            case 2: respuesta2 = "PA";
            break;
            case 3: respuesta2 = "T";
            break;
    }
    System.out.println("El jugador "+jugador2+" selecciono "+respuesta2+".");   
            
    
    
    //camino de empate
    
    if (respuesta1.equals("PI") && respuesta2.equals("PI")){
            System.out.println("EMPATE");   
    }
    if (respuesta1.equals("PA") && respuesta2.equals("PA")){
            System.out.println("EMPATE");   
    }
    if (respuesta1.equals("T") && respuesta2.equals("T")){
            System.out.println("EMPATE");   
    }
    
        //camino piedra
    if (respuesta1.equals("PI") && respuesta2.equals("PA")){
        System.out.println("Ha ganado "+jugador2+".");
        puntosjugador2++;
        } 
    if (respuesta2.equals("PI") && respuesta1.equals("PA")){
        System.out.println("Ha ganado "+jugador1+".");
        puntosjugador1++;
    }
    if(respuesta1.equals("PI") && respuesta2.equals("T")){
        System.out.println("Ha ganado "+jugador1+".");
        puntosjugador1++;
    }
    if(respuesta1.equals("T") && respuesta2.equals("PI")){
        System.out.println("Ha ganado "+jugador2+"."); 
        puntosjugador2++;
    }        
       
    //camino tijera
    if (respuesta1.equals("PA") && respuesta2.equals("T")){
        System.out.println("Ha ganado "+jugador2+".");
        puntosjugador2++;

    }
    if (respuesta1.equals("T") && respuesta2.equals("PA")){
        System.out.println("Ha ganado "+jugador1+".");
        puntosjugador1++;
    }

    contadordejugadas++;

      //delay
    TimeUnit.SECONDS.sleep(3); 
    
    System.out.println(separador);   
    System.out.println(separador);  

    
}while(contadordejugadas<jugadas);

System.out.println("El jugador "+jugador1+" ha obtenido "+puntosjugador1+" puntos.");   
System.out.println("El jugador "+jugador2+" ha obtenido "+puntosjugador2+ " puntos.");   

if (puntosjugador1 > puntosjugador2){
    System.out.println("Ha ganado "+jugador1+". Felicidades!!!");
    }
if (puntosjugador1 < puntosjugador2){
        System.out.println("Ha ganado "+jugador2+". Felicidades!!!");
    }
if (puntosjugador1 == puntosjugador2) {
    System.out.println("El resultado final ha sido un empate.");    
    }
    
System.out.println(separador);   
System.out.println(separador);



String tablero [] = {""+jugador1,"\t\t",""+jugador2}; 
String resultado [] = {""+puntosjugador1,"\t\t",""+puntosjugador2}; 

System.out.println("TABLERO DE PUNTAJE FINAL:");
System.out.println(separador);
for (int indice=0; indice<tablero.length; indice++){
        System.out.println(tablero [indice]+"\t\t"+resultado [indice]);
            }
System.out.println(separador);
    
    }
        
}
   
    








   
    

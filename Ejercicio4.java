//Leer una frase y elegir entre la opción de convertir la frase a mayúsculas 
//o la opción de convertir la frase a minúsculas.

//Autor: Inés Cristóbal Ascaso
//Fecha: 15/11/2021


import java.util.Scanner;
public class Ejercicio4_4 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        int opcion;
        
        System.out.print ("Introduce una frase: ");
        String frase = teclado.nextLine();
        
        System.out.print ("Elige entre la opción 1 y la opción 2: ");
        opcion = teclado.nextInt();
            
            switch (opcion) {
                case 1:
                   //Conversión frase a mayúsculas
                   System.out.println (frase.toUpperCase() );
                   break;
                    
                case 2:
                    //Conversión frase a minúsculas
                    System.out.println (frase.toLowerCase() );
                    break;

                default:
                    System.out.print ("Error");
    }       }
}

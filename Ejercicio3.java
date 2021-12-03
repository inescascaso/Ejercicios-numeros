//Leer una frase y una palabra, y que nos diga la posición 
//de dicha palabra en la frase, y si NO la encuentra devolver un 0.

//Autor: Inés Cristóbal Ascaso
//Fecha: 15/11/2021


import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        int i;
        
        System.out.print ("Introduce una frase: ");
        String frase = teclado.nextLine();
        
        System.out.print ("Introduce una palabra: ");
        String palabra = teclado.nextLine();
        
    
            
        System.out.println ("La posición de la palabra es: " + (frase.indexOf(palabra)+1));
        
        
       
    }
}
//Leer una palabra y se efectúe todas las rotaciones posibles de dicha palabra.


//Autor: Inés Cristóbal Ascaso
//Fecha: 12/11/2021


import java.util.Scanner;
public class Ejercicio12_4 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        int i;

        System.out.print ("Introduce una palabra: ");
        String palabra = teclado.nextLine();

        for (i = 0; i <= palabra.length(); i++) {
            palabra = palabra.charAt(palabra.length()-1) + palabra.substring (0, palabra.length()-1);
            System.out.println (palabra.toUpperCase());

        }
    }
}

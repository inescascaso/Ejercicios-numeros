//Leer una frase y escribirla progresivamente.

//Autor: Inés Cristóbal Ascaso
//Fecha: 11/11/2021



import java.util.Scanner;
public class Ejercicio1_4 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        int i;

        System.out.print ("Introduce una palabra: ");
        String palabra = teclado.nextLine();

        for (i = 0; i <= palabra.length(); i++) {
        System.out.println (palabra.substring (0,i));

        }
    }
}
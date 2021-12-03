// Leer un número por teclado y sacar por pantalla si el número es perfecto o no.


//Autor: Inés Cristóbal
//Fecha: 08/11/21


import java.util.Scanner;
public class Ejercicio9_3 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numero, divisor, suma = 0;


        System.out.print ("Introduce un número para saber si es perfecto: ");
        numero = teclado.nextInt();

        for (divisor = 1; divisor < numero; divisor ++) {
            int resto = numero % divisor;
            if (resto == 0) {
                suma = suma + divisor;
            }
        }

        if (suma == numero) {
            System.out.println ("El número es perfecto");
        } else {
            System.out.println ("El número NO es perfecto");
        }
    }
}

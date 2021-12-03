//Leer un número por teclado, y sacar por pantalla la lista de todos los números primos hasta dicho número.


//Autor: Inés Cristóbal
//Fecha: 08/11/21

import java.util.Scanner;
public class Ejercicio11_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int i, num, divisor;

        System.out.print ("Introduce un número: ");
        num = teclado.nextInt();

        for (i = 1; i <= num; i ++) {
           int contador = 0;
           for (divisor = 1; divisor <= i; divisor ++) {
               int resto = i % divisor;
               if (resto == 0) {
                   contador ++;
               }
            }

            if (contador == 2) {
                System.out.println (i);
            }

        }
        
    }
}

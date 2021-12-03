//Escribir un número por teclado, calcular y escribir el factorial de dicho número.

//Autor: Inés Cristóbal
//Fecha: 05/11/21

import java.util.Scanner;
public class Ejercicio8_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        long factorial = 1; //long (entero)= 64 bites --> double (real)= 64 bites
        int num, contador;

        System.out.print ("Introduce número para calcular su factorial: ");
        num = teclado.nextInt();

        for (contador = num; contador >= 1; contador --) {
            factorial = factorial * contador;
        }

        System.out.println ("El factorial de" + num + "es: " +factorial);
    }
}

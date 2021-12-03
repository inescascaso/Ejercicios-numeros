//Leer números por teclado hasta que se lea el 0 (fin del programa). 
//Calcular y escribir la suma de los números introducidos en lugar par e impar.

//Autor: Inés Cristóbal
//Fecha: 04/11/21

import java.util.Scanner;
public class Ejercicio6_3 { 
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numero = 0, sumapar = 0, sumaimpar = 0, contador = 0;

        do {
            System.out.print ("Introduce un número: ");
            numero = teclado.nextInt();

            if (contador % 2 == 0) { //verificar si la posición es par.
                sumapar = sumapar + numero;
                contador ++;
            } else {
                sumaimpar = sumaimpar + numero;
                contador ++;
            }

        } while (numero != 0); //Condición se ejecutará al final
                               //Si se introduce un número diferente a 0, se ejecutará el bucle do.
        
        System.out.println ("La suma de los números en posición par: " +sumapar);
        System.out.println ("La suma de los números en posición impar: " +sumaimpar);

    }
}

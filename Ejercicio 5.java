// Leer números por teclado hasta que se introduzca el 0 (dejar de pedir números).
// Calcular la suma, mostrarla y decir cuántos números se han introducido en total.

//Autor: Inés Cristóbal
//Fecha: 03/11/21

import java.util.Scanner;
public class Ejercicio5_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numero = 0, suma = 0, contador = 0;
            
        do {
            System.out.println ("Introduce un número: ");
            numero = teclado.nextInt();
            suma = suma + numero;
            contador ++;

        } while (numero != 0); //Condición se ejecutará al final
                              //Si se introduce un número diferente a 0, se ejecutará el bucle do.
    System.out.print ("La suma de todos los números es: " +suma);
    System.out.print ("El número total de números es: " +contador);
                              
    }
}

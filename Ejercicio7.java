// Leer una secuencia de números de longitud indefinida, cuando se introduzca 0 (terminará el problema).
//Imprimir: el número mayor, el número menor y la media de los números.

//Autor: Inés Cristóbal
//Fecha: 05/11/21


import java.util.Scanner;
public class Ejercicio7_3 {
    public static void main (String[] args) {
    Scanner teclado = new Scanner (System.in);
    int numero, mayor = 0, suma = 0, contador = 0, menor = 100000000;

        do {

             System.out.print ("Introduce un número: ");
             numero = teclado.nextInt();

            if (numero > mayor) {
                mayor = numero;
            } else {
                if (numero < menor && numero != 0)
                    menor = numero;
            }

            suma = suma + numero;
            contador ++;
        } while (numero != 0);

        int media = suma /= contador;

        System.out.println ("El número mayor es: " +mayor);
        System.out.println ("El número menor es: " +menor);
        System.out.println ("La media de los números es: " +media);

    }
}

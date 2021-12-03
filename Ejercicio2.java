// Leer un número N que debe filtrarse entre 1 y 10, calcular y escribir la tabla multiplicar de ese número.

//Autor: Inés Cristóbal
//Fecha: 03/11/21

import java.util.Scanner;
public class Ejercicio2_3{
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    int n, i;

    System.out.print("Introduce un número entero: ");                                                         
    n = teclado.nextInt();

        System.out.println("Tabla del " + n);

        for(i = 1; i <= 10; i++){
             System.out.println(n + " * " + i + " = " + n*i);                                                     
        }
    }
}

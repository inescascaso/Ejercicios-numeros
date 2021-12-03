// Escribir un programa que calcule e imprama la suma de los números enteros comprendidos
//entre A y B que deben leerse por teclado y A <= B. Los valores de A y B NO deben incluirse en la suma.

//Autor: Inés Cristóbal
//Fecha: 02/11/21

import java.util.Scanner;
public class Ejercicio1_3 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        int a, b, suma = 0, contador;

        
        System.out.print ("Introducir el número menor: ");
        a = teclado.nextInt();
        System.out.print ("Introducir el número mayor: ");
        b = teclado.nextInt();

        for (contador = a+1; contador < b; contador ++) {
            suma = suma + contador; 
            System.out.print ("La suma es: " +suma);
        }
    }
}
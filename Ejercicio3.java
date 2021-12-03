// Leer un número N por teclado, calcular y escribir los divisores propios del número
//N por pantalla (sin incluirlo).

//Autor: Inés Cristóbal
//Fecha: 04/11/21


import java.util.Scanner;
public class Ejercicio3_3 {
    public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
    	int num = 0;

	System.out.print ("Introduce un número: ");
	num = teclado.nextInt();

	    for (int divisor = 1; divisor < num; divisor ++){
		int resto = num % divisor;
		    if (resto == 0)
			    System.out.println (divisor);
        
        }
    }
}

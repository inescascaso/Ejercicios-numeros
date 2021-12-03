// Leer por teclado un número N y escribir por pantalla mediante un mensaje
//si el número N es primo o no es primo (sin incluirlo)

//Autor: Inés Cristóbal
//Fecha: 04/11/21

import java.util.Scanner;
public class Ejercicio4_3{
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int contador = 0;
	    int divisor, num;

	System.out.print ("Ingresar un número: ");
	num = teclado.nextInt();

	for (divisor = 1; divisor < num; divisor ++) { 
		 int resto = num % divisor; 
		 if (resto == 0)
			contador ++; //guarda el número de diviones exactas
			
	}
	   if (contador < 2){  
	        System.out.print ("El número es primo");
	   } else {
	        System.out.print ("El número NO es primo");
	   }
    }
    
}



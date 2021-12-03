//Dada una frase de NO más de 80 caracteres, 
//hacer un programa que cuente cuántas mayúsculas y minúsculas tiene y lo saque por pantalla.

//Autor: Inés Cristóbal Ascaso
//Fecha: 11/11/2021


import java.util.Scanner;
public class Ejercicio2_4 {
    public static void main (String [] args) {
        Scanner teclado = new Scanner (System.in);
        int numeromayus = 0, numerominus = 0;

        System.out.print ("Introduce un texto: ");
        String texto = teclado.nextLine();

        for (int i = 0; i < texto.length(); i++) {
            //CÓDIGO ASCII NÚMERO 65 = A HASTA NUMERO 90 = Z (MAYÚSCULAS)

            if (texto.charAt(i) >= 65 && texto.charAt(i) <= 90) {
                numeromayus ++;
            } else {
                //CÓDIGO ASCII NÚMERO 97 = a HASTA NUMERO 122 = z (MINÚSCULAS)

                if (texto.charAt(i) >= 97 && texto.charAt(i) <= 122) 
                   numerominus ++;
            }
        }

        System.out.println("Cantidad de mayúsculas del texto es: " +numeromayus);
        System.out.println ("Cantidad de minúsculas del texto es: " +numerominus);


    }
}


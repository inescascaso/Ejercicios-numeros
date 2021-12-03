//Leer una frase, calcular cuántas letras tiene. 
//Para homogeneizar, se convertira la frase a mayúsculas.

//Autor: Inés Cristóbal Ascaso
//Fecha: 12/11/2021



import java.util.Scanner;
public class Ejercicio11_4 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num_letras = 0, i;

        System.out.print ("Introduce una frase: ");
        String frase = teclado.nextList();
        System.out.println (frase.toUpperCase());

        for (i = 0;  i < frase.length(); i++) {
            if (Character.isLetter(frase.charAt(i))) {
                num_letras ++;
            }
        }

        System.out.println ("El número de letras que tiene la frase es: " +num_letras);
    }
}

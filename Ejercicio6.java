//Leer una frase, y a continuación, escribir cuantas vocales, consonantes y caracteres númericos tiene.

//Autor: Inés Cristóbal Ascaso
//Fecha: 15/11/2021



import java.util.Scanner;
public class Ejercicio6_4{
        public static void main (String[] args) {
                Scanner teclado = new Scanner (System.in);
                int contador = 0, i, vocales = 0, consonantes = 0, digitos = 0;
        
                System.out.print ("Introduce una frase: ");
                String frase = teclado.nextLine();

                for ( i = 0; i < frase.length(); i++) {
            
                        if ((frase.charAt(i) == 'a') || (frase.charAt(i) == 'e') ||
                            (frase.charAt(i) == 'i') || (frase.charAt(i) == 'o') ||
                            (frase.charAt(i) == 'u')) {
                                vocales ++;
                        } else if ((frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z' ) || 
                                   (frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z' )) {
                                consonantes++;
                        }
                        
                        else  if ((frase.charAt(i) >= '0' && frase.charAt(i) <= '9')) {
                                digitos++;
                }       }

        }
    
}



        
        
        
            
            
        
        
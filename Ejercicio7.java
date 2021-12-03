//Leer una frase y escribir a continuación cuántas mayúsculas, minúsculas y números continene.

//Autor: Inés Cristóbal Ascaso
//Fecha: 16/11/2021



import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int numeromayus = 0, numerominus = 0, digitos = 0;
		
		System.out.print ("Introduce una frase: ");
		String frase = teclado.nextLine();
		
		for (int i = 0; i < frase.length(); i++) {
    
            if (frase.charAt(i) >= 65 && frase.charAt(i) <= 90) {
                numeromayus ++;
                
            } else if ((frase.charAt(i) >= 97 && frase.charAt(i) <= 122)) {
                   numerominus ++;
                   
            } else if ((frase.charAt(i) >= '0' && frase.charAt(i) <= '9')) {
                    digitos++;
            }
        }

        System.out.println ("Cantidad de mayúsculas en la frase es: " +numeromayus);
        System.out.println ("Cantidad de minúsculas en la frase es: " +numerominus);
        System.out.println ("Cantidad de digítos en la frase es: " +digitos);
        
	}
}

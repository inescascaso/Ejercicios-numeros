//Leer una frase filtrándola a toda mayúsculas, hacer un cifrado por sustitución (cifrado CESAR)
//de modo que cada carácter se transforme en 3 códigos ASCII.

//Autor: Inés Cristóbal Ascaso
//Fecha: 16/11/2021


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner teclado = new Scanner (System.in);
	   // int codigo = codigo % 26; //Entre 26 porque es el total de letras en el alfabeto.
	    int i;
	    
	    System.out.print ("Introduce una frase: ");
	    String frase = teclado.nextLine();
	   // System.out.println (frase.toUpperCase());
	    
	    for (i = 0; i < frase.length (); i++) {
	        
	        String codigo = "";
	        
	        codigo = codigo + ((char)(frase.charAt(i) + 3));
	        
	        System.out.print (codigo.toUpperCase ());
	        
	        //if (frase.charAt(i) >= 'a' && frase.charAt(i) <=  )
	    }
	    
	  
	    
	    
	}
}

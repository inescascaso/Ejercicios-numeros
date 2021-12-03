// Realizar un programa que elija mediante un menú un tipo de figura (triángulo, cuadrado o rectangulo)
//Una vez elegida la opción, en cada caso calcular su área y sacarla por pantalla.

//Autor: Inés Cristóbal
//Fecha: 08/11/21


import java.util.Scanner;
public class Ejercicio12_3 {
    public static void main (String[] args) {

        int opcion;
        int base = 0, altura = 0, lado = 0;
          
            System.out.println ("Opción (1): Cuadrado");
            System.out.println ("Opción (2): Triángulo");
            System.out.println ("Opción (3): Rectángulo");
    
            opcion = teclado.nextInt();
            
            switch (opcion) {
                case 1:
                   //área de un cuadrado
                   System.out.print ("Introduce longitud del lado: ");
                   lado = teclado.nextInt();
                   System.out.println ("El área del cuadrado es: " + (lado*lado));
                   break;
                    
                case 2:
                   //área de un triángulo
                    System.out.print ("Introduce la base: ");
                    base = teclado.nextInt();
                    System.out.print ("Introduce la altura: ");
                    altura = teclado.nextInt();
                    System.out.println ("El área del triángulo es: " + ((double)(base*altura)/2));
                    break;
    
                case 3:
                    //área de un rectángulo
                    System.out.print ("Introduce la base: ");
                    base = teclado.nextInt();
                    System.out.print ("Introduce la altura: ");
                    altura = teclado.nextInt();
                    System.out.print ("El área del rectángulo es: " + (base*altura));
                    break;
                default:
                    System.out.print ("Error, no se ha introducido un valor entre 1 y 3");
            }
    }
        
}

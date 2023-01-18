/*
 * Ejercicio propuesto 4.3.1: Crea un programa que calcule y muestre el producto de dos números enteros que introduzca el usuario.
 */

package ejercicio431;

import java.util.Scanner;

public class Ejercicio431 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
        System.out.print( "Introduzca el primer número: " );
        int primerNumero = entrada.nextInt();
        System.out.print( "Introduzca el segundo número: " );
        int segundoNumero = entrada.nextInt(); 
        
        int resultado = primerNumero * segundoNumero;
        System.out.println("El resultado de multiplicar " + primerNumero + " X " + segundoNumero + " es: " + resultado);
        
        
        
		
		
				

	}

}

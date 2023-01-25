/**
 * Ejercicio propuesto 6.1.4: Crea un programa que pida al usuario un número entero y muestre su cuadrado.
 * Se repetirá mientras el usuario introduzca un número distinto de cero.
 */

package ejercicio614;

import java.util.Scanner;

public class Ejercicio614 {
	
	public static void muestraCuadrado() {
		  Scanner sc = new Scanner(System.in);
	        int numero;

	        do {
	            System.out.print("Ingresa un número entero (0 para salir): ");
	            numero = sc.nextInt();

	            if (numero != 0) {
	                int cuadrado = (int) Math.pow(numero,2);
	                System.out.println("El cuadrado de " + numero + " es " + cuadrado);
	            }
	        } while (numero != 0);
	    
		sc.close();
			
	}

	public static void main(String[] args) {
		muestraCuadrado();

	}

}

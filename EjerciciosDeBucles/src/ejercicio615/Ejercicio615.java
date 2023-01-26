/**
 * Ejercicio propuesto 6.1.5: Crea un programa que pida al usuario su contraseña (un número entero). 
 * Se repetirá mientras introduzca una contraseña distinta de "1234".
 */

package ejercicio615;

import java.util.Scanner;

public class Ejercicio615 {
	
	public static void damePassword() {
		Scanner sc = new Scanner(System.in);
		int password = 1234;
		int numUsuario = 0;
		
		while(numUsuario != password) {
			System.out.println("Introduzca contraseña: ");
			numUsuario = sc.nextInt();
		}
		System.out.println("Contraseña correcta!");
		
		sc.close();
		
	}

	public static void main(String[] args) {
		damePassword();
	}

}

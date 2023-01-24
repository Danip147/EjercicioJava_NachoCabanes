/**
 * Ejercicio propuesto 5.3.1: Crea un programa que pida al usuario que introduzca el número 12. 
 * Después debe decirle si lo ha hecho correctamente o no.
 */

package ejercicio531;

import java.util.Scanner;

public class Ejercicio531 {

	public static void numeroCorrecto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca el número 12: ");
		int numUsuario = sc.nextInt();
		sc.nextLine();

		if (numUsuario == 12) {
			System.out.println("Número introducido correctamente");
		} else {
			System.out.println("Número introducido incorrecto");
		}

		sc.close();
	}

	public static void main(String[] args) {
		numeroCorrecto();

	}

}

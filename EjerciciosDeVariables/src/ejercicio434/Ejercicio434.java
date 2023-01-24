/**
 * Ejercicio propuesto 4.3.4: Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3) 
 * y calcule su equivalencia en metros (1 milla = 1609 m).
 */

package ejercicio434;

import java.util.Scanner;

public class Ejercicio434 {

	public static void calculaMetros() {
		Scanner sc = new Scanner(System.in);

		final int MILLA = 1609;
		System.out.println("Por favor, introduzca una cantidad en millas:");
		int numeroUsuario = sc.nextInt();
		sc.nextLine();

		System.out.println(
				"La cantidad de " + numeroUsuario + " millas equivale a : " + (numeroUsuario * MILLA) + " metros");

		sc.close();

	}

	public static void main(String[] args) {
		calculaMetros();

	}

}

/**
 * Ejercicio propuesto 6.1.7: Crea un programa que escriba en pantalla tantos asteriscos como el usuario indique,
 * todos ellos en la misma línea.
 */

package ejercicio617;

import java.util.Scanner;

public class Ejercicio617 {

	public static void pintaAsteriscos() {
		// con bucle for
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce número de asteriscos:");
		int numAsteriscos = sc.nextInt();

		for (int i = 0; i < numAsteriscos; i++) {
			System.out.print("*");

		}

		sc.close();

	}

	public static void pintaAsteriscosB() {
		// con bucle while
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce número de asteriscos:");
		int numAsteriscos = sc.nextInt();

		int i = 0;

		while (i < numAsteriscos) {
			System.out.print("*");
			i++;
		}

		sc.close();

	}

	public static void main(String[] args) {
		// pintaAsteriscos();
		pintaAsteriscosB();

	}

}

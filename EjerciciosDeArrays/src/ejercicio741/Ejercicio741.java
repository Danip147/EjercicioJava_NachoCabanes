/**
 * Ejercicio propuesto 7.4.1: Crea un programa que pida al usuario 5 números reales, que guardará en un array. 
 * Luego calculará y mostrará su media (la suma de todos los datos, 
 * dividida entre la cantidad de datos) y los valores que están por encima de la media.
 */

package ejercicio741;

import java.util.Scanner;

public class Ejercicio741 {

	public static void dimeMedia() {
		int[] numeros = new int[5]; // creamos el array que vamos a rellenar

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un número: ");
			numeros[i] = sc.nextInt();

		}

		int suma = 0;

		for (int numero : numeros) {
			suma += numero;
		}
		System.out.println("La suma es: " + suma);

		int media = suma / numeros.length;

		System.out.println("Los números que están por encima de la media son: ");
		for (int numero : numeros) {
			if (numero > media) {
				System.out.println(numero);
			}
		}

		sc.close();
	}

	public static void main(String[] args) {
		dimeMedia();

	}

}

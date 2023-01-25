/**
 * Ejercicio propuesto 7.4.2: Crea un programa que pida al usuario 8 números enteros, los guarde en un array, 
 * halle y muestre el valor más alto que contiene (su máximo) y el valor más bajo que contiene (su mínimo). 
 * Pista: puedes empezar suponiendo que el primer valor es el máximo provisional; a partir de ahí, recorre todos 
 * los demás con un "for"; si alguno de los datos es mayor que el máximo provisional, pasará a ser el nuevo máximo; 
 * el mínimo se calculará de forma similar.
 */

package ejercicio742;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio742 {

	public static void muestraMasAlto() {
		int[] numeros = new int[5]; // creamos el array que vamos a rellenar

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un número: ");
			numeros[i] = sc.nextInt();

		}

		Arrays.sort(numeros); // Esto ordena los números

		System.out.println("El número mayor es: " + numeros[numeros.length - 1]);
		System.out.println("El número menor es: " + numeros[0]);

		sc.close();
	}

	public static void main(String[] args) {
		muestraMasAlto();

	}

}

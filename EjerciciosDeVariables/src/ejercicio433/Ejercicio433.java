/*
 * Ejercicio propuesto 4.3.3: Crea un programa que calcule y muestre el resto de la división de dos números enteros que introduzca el usuario.
 */

package ejercicio433;

import java.util.Scanner;

public class Ejercicio433 {

	public static void resto() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce primer número: ");
		int primerNumero = entrada.nextInt();

		System.out.println("Introduce segundo número: ");
		int segundoNumero = entrada.nextInt();

		int resultado = primerNumero % segundoNumero;

		System.out.println("El resto de dividir " + primerNumero + " / " + segundoNumero + " es: " + resultado);
	}

	public static void main(String[] args) {
		resto();

	}

}

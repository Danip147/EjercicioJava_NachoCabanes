/*
 * Ejercicio propuesto 4.3.2: Crea un programa que calcule y muestre la división de dos números enteros introducidos por el usuario.
 */

package ejercicio432;

import java.util.Scanner;

public class Ejercicio432 {

	public static void division() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce primer número");
		int primerNumero = entrada.nextInt();
		System.out.println("Introduce segundo número");
		int segundoNumero = entrada.nextInt();

		int resultado = primerNumero / segundoNumero;

		System.out.println("El resultado de dividir " + primerNumero + " / " + segundoNumero + " es: " + resultado);

	}

	public static void main(String[] args) {
		division();

	}

}

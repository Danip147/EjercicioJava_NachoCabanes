/**
 * Ejercicio propuesto 6.3.6: Crea un programa que pida dos números de tipo byte al usuario y escriba en pantalla un 
 * rectángulo formado por asteriscos, que tendrá como alto el primer número y como ancho el segundo número. 
 */

package ejercicio636;

import java.util.Scanner;

public class Ejercicio636 {

	public static void pintaRectangulo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un alto: ");
		int alto = sc.nextInt();
		sc.nextLine();

		System.out.println("Introduzca un ancho: ");
		int ancho = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.print("*");

			}
			System.out.println();

			sc.close();
		}
	}

	public static void main(String[] args) {
		pintaRectangulo();
	}

}

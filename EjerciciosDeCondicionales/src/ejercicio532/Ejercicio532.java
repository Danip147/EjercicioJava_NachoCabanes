/**
 * Ejercicio propuesto 5.3.2: Crea un programa que pida un número entero al usuario y diga si es positivo (mayor que cero), 
 * si es negativo (menor que cero) o si, por el contrario, es exactamente 0 (necesitarás enlazar 2 "if" uno tras otro).
 */

package ejercicio532;

import java.util.Scanner;

public class Ejercicio532 {

	public static void dimePositivo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca un número: ");
		int numUsuario = sc.nextInt();
		sc.nextLine();

		if (numUsuario > 0) {
			System.out.println("El número " + numUsuario + " es positivo");
		} else if (numUsuario < 0) {
			System.out.println("El número " + numUsuario + " es negativo");
		} else {
			System.out.println("El número introducido es " + numUsuario);

			sc.close();
		}
	}

	public static void main(String[] args) {
		dimePositivo();

	}

}

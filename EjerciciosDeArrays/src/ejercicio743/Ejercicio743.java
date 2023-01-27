/**
 * Ejercicio propuesto 7.4.3: Crea un programa que prepare un array que contenga la cantidad de días que hay en cada mes del año. 
 * A partir de entonces el usuario introducirá un número de mes (por ejemplo, 4 para abril) y el programa le responderá cuántos días tiene ese mes. 
 * Se repetirá hasta que el usuario introduzca un mes menor que 1 o mayor que 12.
 */

package ejercicio743;

import java.util.Scanner;

public class Ejercicio743 {

	public static void diasMes() {
		Scanner sc = new Scanner(System.in);

		int[] diasMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int mesUsuario;

		do {
			System.out.print("Ingrese un número de mes (1-12) o 0 para salir: ");
			mesUsuario = sc.nextInt();

			if (mesUsuario > 0 && mesUsuario <= 12) {

				System.out.println("El mes numero " + mesUsuario + " tiene " + diasMes[mesUsuario - 1] + " días");
			}
		} while (mesUsuario > 0 && mesUsuario <= 12);

		sc.close();
	}

	public static void main(String[] args) {
		diasMes();

	}

}

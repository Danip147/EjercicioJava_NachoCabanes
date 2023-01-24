/**
 * Ejercicio propuesto 5.2.1: Crea un programa que pida un número entero al usuario y diga si es positivo 
 * (mayor que cero) o si, por el contrario, no lo es (usando "else").
 */

package ejercicio521;

import java.util.Scanner;

public class Ejercicio521 {
	
	public static void numeroEntero() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca un número: ");
		int numUsuario = sc.nextInt();
		sc.nextLine();
		
		if (numUsuario > 0) {
			System.out.println("El número " +numUsuario+ " es positivo");
		}else {
			System.out.println("El número " +numUsuario+ " es negativo");
		}
		
		sc.close();
	}

	public static void main(String[] args) {
		numeroEntero();

	}

}

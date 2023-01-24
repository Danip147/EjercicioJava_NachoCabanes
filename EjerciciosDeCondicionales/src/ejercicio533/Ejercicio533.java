/**
 * Ejercicio propuesto 5.3.3: Crea un programa que pida dos números reales al usuario y diga cuál es el mayor de ellos.
 */

package ejercicio533;

import java.util.Scanner;

public class Ejercicio533 {
	
	public static void cualEsMayor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca un primer número: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Por favor, introduzca un segundo número: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		if(num1 > num2) {
			System.out.println("El número " +num1+ " es mayor que el número " +num2);
		}else {
			System.out.println("El número " +num2+ " es mayor que el número " +num1);
		}
		
		sc.close();
			
	}

	public static void main(String[] args) {
		cualEsMayor();

	}

}

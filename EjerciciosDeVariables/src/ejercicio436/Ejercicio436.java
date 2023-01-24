/**
 * Ejercicio propuesto 4.3.6: Crea un programa que pregunte al usuario la base y
 * la altura de un triángulo y muestre su superficie (S = B*A/2).
 */

package ejercicio436;

import java.util.Scanner;

public class Ejercicio436 {
	
	public static void superficieTriangulo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduce dimensión de la base: ");
		double base = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Por favor, introduce la altura: ");
		double altura= sc.nextDouble();
		sc.nextLine();
		
		System.out.println("La superficie del triángulo es: " + ((base*altura) / 2));
			
		
		sc.close();
	}

	public static void main(String[] args) {
		superficieTriangulo();
	}

}

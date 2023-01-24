/**
 * Ejercicio propuesto 4.5.2: Crea un programa que pida al usuario su año de nacimiento y el año actual
 * (suando datos de tipo short) y halle la diferencia de ambos para obtener su edad.
 */

package ejercicio452;

import java.util.Scanner;

public class Ejercicio452 {
	
	public static void calculaEdad() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca año de nacimiento: ");
		short añoNacimiento = sc.nextShort();
		sc.nextLine();
		
		System.out.println("Por favor, introduzca año actual: ");
		short añoActual = sc.nextShort();
		sc.nextLine();
		
		System.out.println("Su edad es de : " + (añoActual-añoNacimiento) + " años");
		
		sc.close();
	}

	public static void main(String[] args) {
		calculaEdad();// TODO Auto-generated method stub

	}

}

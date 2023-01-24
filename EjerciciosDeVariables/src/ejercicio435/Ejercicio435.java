/**
 * Ejercicio propuesto 4.3.5: Crea un programa que pida al usuario una temperatura en grados centígrados y
 * calcule (y muestre) a cuántos grados Fahrenheit equivalen (F = 9*C/5 + 32).
 */

package ejercicio435;

import java.util.Scanner;

public class Ejercicio435 {
	
	public static void dimeFahrenheit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca temperatura en grados celsius: ");
		double temperaturaCelsius = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("La temperatura de " + temperaturaCelsius+ "°C equivale a : " + (9 * temperaturaCelsius/5+32)+" °F" );
		
		sc.close();
	}

	public static void main(String[] args) {
		dimeFahrenheit();

	}

}

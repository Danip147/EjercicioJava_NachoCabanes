/**
 * Ejercicio propuesto 6.3.3: Crea un programa que muestre la "tabla de multiplicar del 5", usando "for"
 */

package ejercicio633;

public class Ejercicio633 {
	
	public static void tablaMult5() {
		
		int tabla = 5;
		
		for (int i = 1; i <= 10 ; i++) {
			System.out.println(i + " X " + tabla+ " = " + (i*tabla));
			
		}
	}

	public static void main(String[] args) {
		tablaMult5(); 

	}

}

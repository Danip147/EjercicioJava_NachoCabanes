/**
 * Ejercicio propuesto 6.3.4: Crea un programa que muestre los números enteros del 0 al 100 que son múltiplos de 6 (el resto al dividir por 6 sea 0).
 */

package ejercicio634;

public class Ejercicio634 {
	
	public static void multiplo6() {
		
		for (int i = 0; i <= 100; i++) {
			if(i % 6 == 0) {
				System.out.println(i);
			}
			
		}
	}

	public static void main(String[] args) {
		multiplo6();

	}

}

/**
 * Ejercicio propuesto 6.1.1: Crea un programa que muestre los números del 1 al 10, usando "while"
 */

package ejercicio611;

public class Ejercicio611 {
	
	public static void muestraNumeros() {
		int num = 1;
		
		while (num <= 10) {
			System.out.println(num);
			num++;
		}
		
		
	}

	public static void main(String[] args) {
		muestraNumeros();
	}

}

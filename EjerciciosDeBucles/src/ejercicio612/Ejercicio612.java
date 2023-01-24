/**
 * Ejercicio propuesto 6.1.2: Crea un programa que muestre los números pares del 20 al 2, decreciendo, usando "while"
 */

package ejercicio612;

public class Ejercicio612 {

	public static void muestraNumeros() {
		int num = 20;

		while (num >= 2) {
			System.out.println(num);
			num -= 2;
		}

	}

	public static void main(String[] args) {
		muestraNumeros();
	}

}

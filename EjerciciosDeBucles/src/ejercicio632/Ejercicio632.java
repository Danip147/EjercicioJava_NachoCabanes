/**
 * Ejercicio propuesto 6.3.2: Crea un programa que muestre los números pares del 20 al 2, decreciendo, usando "for"
 */

package ejercicio632;

public class Ejercicio632 {
	
	public static void muestraNumeros() {
		for (int i = 20; i >= 2; i-=2) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		muestraNumeros();

	}

}

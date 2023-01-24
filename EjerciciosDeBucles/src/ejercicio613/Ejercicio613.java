/**
 * Ejercicio propuesto 6.1.3: Crea un programa que muestre la "tabla de multiplicar del 5", usando "while"
 */

package ejercicio613;

public class Ejercicio613 {

	public static void tablaMultiplicar5() {
		int num = 5, i = 1;

		while (i <= 10) {
			System.out.println(num + " x " + i + " = " + num * i);
			i++;
		}
	}

	public static void main(String[] args) {
		tablaMultiplicar5();

	}

}

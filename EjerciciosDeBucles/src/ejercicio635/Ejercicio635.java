/**
 * Ejercicio propuesto 6.3.5: Crea un programa que muestre los números enteros entre 0 y el que introduzca el usuario que sean múltiplos de 3 
 * (el resto al dividir por 3 es 0) y a la vez múltiplos de 7 (ídem).
 */

package ejercicio635;

import java.util.Scanner;

public class Ejercicio635 {
	
	public static void multiplos3and7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor introduzca un número entero: ");
		int numUsuario = sc.nextInt();
		
		for (int i = 0; i <= numUsuario ; i++) {
			if((i % 3 == 0) && (i % 7== 0)) {
				System.out.println(i);
			}
			
		}
		
		sc.close();
		
}

	public static void main(String[] args) {
		multiplos3and7();

	}

}

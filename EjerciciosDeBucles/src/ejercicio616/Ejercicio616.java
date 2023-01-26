/**
 * Ejercicio propuesto 6.1.6: Crea un programa que pida al usuario su login (un número entero) y su contraseña 
 * (otro número entero). Se repetirá mientras el usuario introduzca un login distinto de "1809" 
 * o una contraseña distinta de "1234".
 */

package ejercicio616;

import java.util.Scanner;

public class Ejercicio616 {
	
	public static void login() {
		 Scanner sc = new Scanner(System.in);
	        int login;
	        int password;
	        boolean esValido = false;

	        while (!esValido) {
	            System.out.println("Ingrese su login (número entero): ");
	            login = sc.nextInt();
	            System.out.println("Ingrese su contraseña (número entero): ");
	            password = sc.nextInt();

	            if (login == 1809 && password == 1234) {
	                esValido = true;
	                System.out.println("Acceso permitido.");
	            } else {
	                System.out.println("Login o contraseña incorrectos. Intente de nuevo.");
	            }
	       
	        sc.close();
	        }
	    }
	
 

	public static void main(String[] args) {
		login();
	}

}

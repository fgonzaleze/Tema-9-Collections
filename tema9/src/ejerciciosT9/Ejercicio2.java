package ejerciciosT9;


import java.util.LinkedHashSet;
import java.util.Scanner;

/*
 * Introduce por teclado, hasta que se introduzca “fin”, una serie de nombres, 
 * que se insertarán en una colección, de forma que se conserve el orden de inserción
 *  y que no puedan repetirse. Al final, la colección se mostrará por pantalla.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Usamos linked Hash Set porque no queremos que se guarden repetidos
		LinkedHashSet <String> nombres = new LinkedHashSet<String>();
		
		Scanner sc = new Scanner(System.in);
		// Variable vacía para el nombre
		String nombre = "";

		System.out.println("Escriba una serie de nombres para ir añadiendolos. Introduzca 'fin' para acabar ");
		nombre = sc.next();
		
		// Mientras no se introduzca 'fin', seguimos pidiendo nombres
		while (!nombre.equalsIgnoreCase("fin")) {
			
			// Añadimos nombres a la lista
			nombres.add(nombre);
			
			// Volvemos a pedir
			System.out.println("Escriba una serie de nombres para ir añadiendolos. Introduzca 'fin' para acabar ");
			nombre = sc.next();
		}
		System.out.println(nombres);

		sc.close();
	}

}

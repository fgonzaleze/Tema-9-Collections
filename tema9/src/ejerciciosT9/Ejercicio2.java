package ejerciciosT9;

import java.util.ArrayList;

/*
 * Introduce por teclado, hasta que se introduzca “fin”, una serie de nombres, 
 * que se insertarán en una colección, de forma que se conserve el orden de inserción
 *  y que no puedan repetirse. Al final, la colección se mostrará por pantalla.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		ArrayList<String> nombres = new ArrayList<>();
		Scanner sc = new Scanner 
		
		String palabra = "";
		System.out.println("Introduce la palabra");
		// palabra = sc.next();
		while (!palabra.equalsIgnoreCase("fin")) {
			nombres.add(palabra);
		}
		
		System.out.println(nombres);
		
		
		
	}

}

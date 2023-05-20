package ejerciciosT9;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio3 {
	
	/*
	 * Repite la actividad 2 de forma que se inserten los nombres manteniendo el orden alfabético.
	 */

	public static void main(String[] args) {
		
		// Colección con TreeSet porque si nos importa el orden, en este caso alfabético
		TreeSet <String> nombres = new TreeSet<String>();

		// Variable para el nombre que introduzca
		String nombre;
		Scanner sc = new Scanner(System.in);

		// Vamos añadiendo nombres hasta que introduzcamos fin
		System.out.println("Escriba un nombre: ");
		nombre = sc.nextLine();

		// Vamos añadiendo nombres hasta que introduzcamos fin
		while (!nombre.equals("fin")) {

			nombres.add(nombre);

			System.out.println("Escriba un nombre: ");
			nombre = sc.nextLine();

		}
		// Imprimimos la coleccion
		System.out.println("Colección: " + nombres);
		sc.close();

	}

}

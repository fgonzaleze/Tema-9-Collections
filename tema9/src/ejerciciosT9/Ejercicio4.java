package ejerciciosT9;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio4 {

	public static void main(String[] args) {

		TreeMap<Integer, Integer> numeros = new TreeMap<>();
		TreeMap<Integer, Integer> estrellas = new TreeMap<>();

		// Variables numero y estrella
		int numero;
		int estrella;
		String seguir = "";
		Scanner sc = new Scanner(System.in);

		// Pedimos si quiere seguir introduciendo numeros
		System.out.println("¿Quiere seguir introduciendo numeros? (S/N)");
		seguir = sc.next();
		// Salto de linea por errores
		sc.nextLine();

		// Mientras sea S introducimos números
		while (seguir.equalsIgnoreCase("s")) {
			System.out.println("Introduce 5 numeros: ");
			for (int i = 0; i < 5; i++) {
				numero = sc.nextInt();
				sc.nextLine();

				if (numeros.containsKey(numero)) {
					numeros.replace(numero, numeros.get(numero) + 1);
				} else {
					numeros.put(numero, 1);
				}
			}
			System.out.println("Introduce 2 estrellas: ");
			for (int i = 0; i < 2; i++) {
				estrella = sc.nextInt();
				sc.nextLine();
				if (estrellas.containsKey(estrella)) {
					estrellas.replace(estrella, estrellas.get(estrella) + 1);
				} else {
					estrellas.put(estrella, 1);
				}
			}
			// Continuamos preguntando en nuestro bucle
			System.out.println("¿Quiere seguir introduciendo numeros? (S/N)");
			seguir = sc.next();
			sc.nextLine();
		}
		// Imprimimos los numeros y las estrellas
		System.out.println("Numeros: " + numeros);
		System.out.println("Estrellas: " + estrellas);

		sc.close();

	}

}

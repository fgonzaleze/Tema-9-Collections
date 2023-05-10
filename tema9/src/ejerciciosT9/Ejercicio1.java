package ejerciciosT9;

import java.util.TreeSet;

/*
 * Implementa una aplicación donde se insertan 20 números enteros aleatorios distintos, 
 * menores que 100, en una colección. Hay que asegurarse de que se guardan 20. 
 * Deben guardarse ordenados a medida que se vayan generando, y se mostrará la 
 * colección resultante por pantalla.
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		TreeSet<Integer> coleccion = new TreeSet<>();
		int numAleatorio;
		
		// Bucle while para recorrer la coleccion
		while (coleccion.size() < 20) {
			numAleatorio = (int) (Math.random() * 100 + 1);
			coleccion.add(numAleatorio);
		}

		System.out.println(coleccion);
		
	}

}

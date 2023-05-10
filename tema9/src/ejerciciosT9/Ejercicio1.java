package ejerciciosT9;

import java.util.TreeSet;

public class Ejercicio1 {

	public static void main(String[] args) {
		TreeSet<Integer> coleccion = new TreeSet<>();
		int numAleatorio;
		
		while (coleccion.size()<20) {
			numAleatorio = (int) (Math.random()*100+1);
			coleccion.add(numAleatorio);
		}
		
		System.out.println(coleccion);
		
		
	}

}

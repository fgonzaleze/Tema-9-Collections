package ejerciciosT9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio5 {
	
	/*
	 * Realiza una aplicación donde se registren nombres de productos y su precio.
	 * Lleva a cabo el siguiente menú: PRODUCTOS
	 * 1. Alta de producto 
	 * 2. Baja de producto 
	 * 4. Listar existencias 
	 * 0. Salir 
	 * El orden en el que se almacenan los productos no importa.
	 */

	// Creamos un mapa ya que serán pares de nombres y precios; es decir, claves y valores
	static Map<String, Double> productos = new HashMap<String, Double>();

	// Opción del menú.
	static int opcion;

	// Nombre del producto.
	static String nombre;

	// Precio del producto.
	static double precio;

	// Creamos un escáner.
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// El bucle llama al menu y pregunta
		do {

			// Llamamos al menu
			menu();

			System.out.println();
			System.out.println("Elija una opción: ");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1 -> {
				// Sino pones esto para pasar la linea da error!!
				sc.nextLine();
				System.out.println("Nombre del producto: ");
				nombre = sc.nextLine();

				System.out.println("Precio del producto: ");
				precio = sc.nextDouble();

				altaProducto(nombre, precio);
				
				System.out.println("Se ha añadido el producto correctamente");
			}
			case 2 -> {
				
				// Pedimos el pinso
				sc.nextLine();
				System.out.println("Introduzca el nombre del producto que quiere eliminar: ");
				nombre = sc.nextLine();

				// Para dar de baja un producto pedimos su nombre
				bajaProducto(nombre);
				
				System.out.println("Se ha eliminado un producto con éxito.");

			}
			case 3 -> {

				// Para listar
				listado();

			}
			case 0 -> {
				// Cero para cerrar
				System.out.println("Ha cerrado el programa.");

			}
			default -> {
				// Default para cuando se introduzca una opcion valida
				System.out.println("No ha introducido una opción válida");
			}
			}
			// Mientras la opcion no sea 0 continuamos
		} while (opcion != 0);

	}
	/**
	 * Metodo para imprimir por consola el menu
	 */
	public static void menu() {

		System.out.println("PRODUCTOS \n");
		System.out.println("1.Alta del producto.");
		System.out.println("2.Baja del producto.");
		System.out.println("3.Lista de existencias.");
		System.out.println("0.Salir.");

	}
	/**
	 * Metodo para dar de alta un producto
	 * @param nombre Nombre en string del producto a introducir
	 * @param precio Precio en double del producto a introducir
	 */
	
	public static void altaProducto(String nombre, double precio) {
		
		// Con put añadimos los parámetros en este caso el nombre y el precio
		productos.put(nombre, precio);

	}
	
	/**
	 * Metodo para borrar los productos
	 * @param nombre el nombre del producto que se quiera borrar
	 */
	public static void bajaProducto(String nombre) {
		
		// Remove para borrar que maravilla los mapas
		productos.remove(nombre);

	}
	/**
	 * Metodo para listar los productos introducidos
	 */
	public static void listado() {

		System.out.println("Productos disponibles: " + productos);
	}

}

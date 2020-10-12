package ejercicios;

import java.util.Scanner;

public class Ejercicio998Ruta {
////En un trayecto entre dos ciudades se deben realizar paradas intermedias.
	// Se desea conocer cuantas paradas
	// se van a realizar en el viaje y la longitud de los trayectos en kil�metros.
	// Se desea conocer la longitud
	// promedio entre ciudades y
	// cuales son las paradas mas cercanas
	// inicio
	// * ------- * ---------------- * ----- * - ---------- *
	// 40 100 15 60
	public static void main(String[] args) {

		System.out.println("Sistema de estaciones en ruta");
		System.out.println("......................");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese cantidad de estaciones intermedias:");
		int totalEstaciones = sc.nextInt();

		System.out.println();

		int ciudades[] = new int[totalEstaciones];
		int acumulador = 0;

		for (int i = 0; i < ciudades.length; i++) {

			System.out.println("Ingrese km estaci�n  " + (i + 1) + ":");
			ciudades[i] = sc.nextInt();
//			acumulador = acumulador + ciudades[i];
			acumulador += ciudades[i];
		}
		sc.close();
		System.out.println("La distancia promedio entre ciudades es: " + acumulador / totalEstaciones);

		System.out.println(" * ");
		// para j desde 0 hasta totalEstaciones con paso 1
		for (int j = 0; j < totalEstaciones; j++) {
			// por cada estaci�n (bucle), imprimo la cantidad de l�neas
			// imprimo un asterisco (*)
			dibujarTrayecto(ciudades[j]);

		}
	}

	/**
	 * Dibuja el trayecto de una ciudad a otra
	 */
	private static void dibujarTrayecto(int distancia) {
		// por cada estaci�n (bucle), imprimo la cantidad de lineas segunkm
		for (int i = 0; i < distancia; i++) {
			System.out.println("-");
		}
		// imprimo un asterisco (*)
		System.out.print(" * ");
	}
}

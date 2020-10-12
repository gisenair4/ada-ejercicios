package ejercicios;

import java.util.Scanner;

public class Ejercicio203Lapices {

	private static final int CANTIDAD_MINIMA = 100;
	private static final int PRECIO_NORMAL = 90;
	private static final int PRECIO_MAYORISTA = 85;

	public static void main(String[] args) {
		// de 100 en adelante precio 85
		// sino precio es de 90
		// solicitar cantidad de lapices
		// informar el total

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese cantidad de lapices que desea comprar");

		int lapices = sc.nextInt();
		sc.close();

		int precioFinal = 0;

		if (lapices < CANTIDAD_MINIMA && lapices > 0) {
			precioFinal = lapices * PRECIO_NORMAL;
		} else {
			precioFinal = lapices * PRECIO_MAYORISTA;
		}
		System.out.println("El costo final a pagar es:" + precioFinal);
	}

}

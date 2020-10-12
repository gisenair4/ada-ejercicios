package ejercicios;

import java.util.Scanner;

/*
 * un vector contiene 6 numeros y se desea que se modifiquen las posiciones de los numeros
 * de tal manera que el primer numero pase a ser el último  y el último el primero, el 
 * segundo el penúltimo  y así sucesivamente.
 */
public class CambioDePosicionesVector {

	private static final int MAXIMO_N = 6;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vectorA[] = new int[MAXIMO_N];
		int i = 0;
		int aux;
		int acumulador = 0;

		// int acumulador = 0;
		for (i = 0; i < vectorA.length / 2; i++) {
			System.out.println("Ingresa los numeros correspondientes a las posisiones : " + (i + 1));
			vectorA[i] = sc.nextInt();
			acumulador += vectorA[i];
			vectorA[i] = vectorA[MAXIMO_N - 1 - i];
			int[] invertido = null;
			invertido[i] = vectorA[MAXIMO_N - 1 - i];
			// acumulador += vectorA[i];
			// for (i = 0; i < vectorA.length; i++) {
			// System.out.println("Los valores del vector son: " + acumulador);

			// int j = 1;
			// for (i = 0; i < (vectorB.length / 2); i++) {
			// vectorB[i] = vectorA[i];
			// vectorA[i] = vectorA[MAXIMOS_N - j];
			// vectorA[MAXIMOS_N - j] = vectorB[i];
			// j = j + 1;
			// for (i = 0; i < vectorA.length; i++) {
			// System.out.println("El vector resultantes es :" + (i + 1) + vectorA[i]);
		}
		visualizar(vectorA);
		// int j = 1;
		// for (i = 0; i < (vectorB.length / 2); i++) {
		// vectorB[i] = vectorA[i];
		// vectorA[i] = vectorA[MAXIMOS_N - j];
		// vectorA[MAXIMOS_N - j] = vectorB[i];
		// j = j + 1;
		// for (i = 0; i < vectorA.length; i++) {
		// System.out.println("El vector resultantes es :" + (i + 1) + vectorA[i]);
	}

	private static void visualizar(int[] vectorA) {
		// TODO Auto-generated method stub
		String cadena = "Array: ";
		for (int i = 0; i < vectorA.length; i++) {
			cadena += vectorA[i] + ",";

		}
		cadena = cadena.substring(0, cadena.length() - 2);
		System.out.println(cadena);
	}

}

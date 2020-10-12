package ejercicios;

import java.util.Scanner;

/*
 * Se desea obtener un vector C de N elementos que contenga la suma
 * de los elementos de otros dos vectores A y B. De 3 valores cada uno  
 */
public class SumadeVectoresAyB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vectorA[] = new int[3];
		int vectorB[] = new int[3];
		int vectorC[] = new int[3];
		int i = 0;
		for (i = 0; i < vectorA.length; i++) {
			System.out.println("Ingrese los valores del vector A en las posición indicada " + (i + 1) + " : ");
			vectorA[i] = sc.nextInt();
			int acumulador = vectorA[i];
		}
		for (i = 0; i < vectorB.length; i++) {
			System.out.println("Ingrese los valores del vector B en las posición indicada " + (i + 1) + " : ");
			vectorB[i] = sc.nextInt();
			int acumulador1 = vectorB[i];
			vectorC[i] = vectorA[i] + vectorB[i];
		}
		// int suma = 0;
		// int total = 0;
		for (i = 0; i < vectorC.length; i++) {
			// vectorC[i] = vectorA[i] + vectorB[i];
			System.out.println("La suma de los vectores A y B dan los siguientes valores para el vector C: " + (i + 1)
					+ "  " + vectorC[i]);
		}
		sc.close();
		// System.out.println("La suma de los vectores A y B dan los siguientes valores
		// para el vector C: " + (i + 1) + vectorC[i]);
	}

}

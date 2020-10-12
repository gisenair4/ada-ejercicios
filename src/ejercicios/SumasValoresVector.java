package ejercicios;

import java.util.Scanner;

//Se requiere obtener la suma de las cantidade en un arreglo de 5 elementos.

public class SumasValoresVector {
	public static void main(String[] args) {
		System.out.println("Bienvenidos al sistema de suma de valores de un vector");
		Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		int vector[] = new int[5];
		int i = 0;
		for (; i < vector.length; i++) {
			System.out.print("Ingrese los valores en las posisiciones " + (i + 1) + ": ");
			vector[i] = sc.nextInt();
//		acumulador = acumulador + ciudades[i];
			int acumulador = vector[i];
		}
		int total = 0;
		for (i = 0; i < vector.length; i++) {
			total = total + vector[i];
		}
		sc.close();
		System.out.println("La suma de los valores ingresados al vector es: " + total);
	}
}
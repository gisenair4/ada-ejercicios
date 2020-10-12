package calculadora;

import java.util.Scanner;

//Una empresa constructora vende terrenos con las foormas de un triang�lo acostado sobre un rect�ngulo;
//Se desea obtener la superficie del terreno 

public class Terrenos {
	public static void main(String[] args) {
		System.out.println("Bienvenido al sistema de c�lculo de superficies");
		System.out.println("===========================================");
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Ingrese por favor las medidas de la base: lado A; la altura del rect�ngulo: lado B, y la altura del tri�ngulo: lado C");
		System.out.println("Ingrese el valor del lado A");
		int ladoA = sc.nextInt();
		System.out.println("Ingrese el valor del lado B");
		int ladoB = sc.nextInt();
		System.out.println("Ingrese el valor del lado C");
		int ladoC = sc.nextInt();

		int superficieTriangulo = ladoA * ladoB / 2;
		int superficieRectangulo = ladoB * ladoC;
		int superficieTotal = superficieTriangulo + superficieRectangulo;
		System.out.println("La superficie total del terreno es:  " + superficieTotal);
	}
}

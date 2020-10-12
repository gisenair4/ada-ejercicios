package calculadora;

import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		System.out.println("Ingrese tres valores enteros para determinar el tipo de triángulo que se presenta");
		System.out.println("=================================================");
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el primer valor");
		int n1 = sc.nextInt();
		System.out.println("Ingrese el segundo valor");
		int n2 = sc.nextInt();
		System.out.println("Ingrese el tercer valor");
		int n3 = sc.nextInt();
		if (n1 == n2 && n2 == n3) {
			System.out.println("El triangulo es equilatero");
		} else {
			if (n1 == n2 || n2 == n3 || n1 == n3) {
				System.out.println("El triangulo es isóceles");
			} else {
				System.out.println("El triangulo es escaleno");
			}
		}
	}
}

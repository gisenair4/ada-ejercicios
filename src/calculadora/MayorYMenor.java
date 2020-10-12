package calculadora;

import java.util.Scanner;

public class MayorYMenor {
	public static void main(String[] args) {
		System.out.println("Ingrese dos valores enteros para comparar");
		System.out.println("=======================================");
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el primer valor");
		int n1 = sc.nextInt();
		System.out.println("Ingrese el segundo valor");
		int n2 = sc.nextInt();
		if (n1 > n2) {
			System.out.println("El primer valor es mayor que el segundo ");
		} else {
			if (n2 > n1) {

				System.out.println("El segundo valor es mayor que el primero");
			} else {
				System.out.println("Los número son iguales");
			}
		}
	}
}

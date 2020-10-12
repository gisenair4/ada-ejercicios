package calculadora;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		System.out.println("Ingrese un número entero cualquiera");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float quinta;
		float septima;
		int resto;

		quinta = n / 5;
		System.out.println("La quinta parte de dicho número es: " + quinta);
		septima = n / 7;
		System.out.println("La séptima parte de dicho número es: " + septima);
		resto = n % 5;
		System.out.println("El resto de la quinta parte de dicho núemro es:  " + resto);

	}
}

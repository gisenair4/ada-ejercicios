package calculadora;

import java.util.Scanner;

public class SumaYResta {
	public static void main(String[] args) {
		int n1;
		int n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el valor del primer n�mero");
		n1 = sc.nextInt();
		System.out.println("Ingrese el valor del segundo n�mero");
		n2 = sc.nextInt();
		int suma = n1 + n2;
		System.out.println("La suma de ambos valores es: " + suma);
		int producto = n1 * n2;
		System.out.println("El producto de ambos valores es: " + producto);

	}

}

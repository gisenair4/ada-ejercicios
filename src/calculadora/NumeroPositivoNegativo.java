package calculadora;

import java.util.Scanner;

/* 
 * Se desea saber si un numero es negativo o positivo
 */
public class NumeroPositivoNegativo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el valor del n�mero a analizar para saber si es positivo o negativo");
		int n1 = sc.nextInt();
		if (n1 < 0) {
			System.out.println("El n�mero ingresado es negativo");
		} else {
			if (n1 > 0) {
				System.out.println("El n�mero ingresado es positivo");
			} else {
				System.out.println("El n�mero ingresado es cero 0");
			}
		}
	}
}

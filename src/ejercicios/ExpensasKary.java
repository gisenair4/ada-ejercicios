package ejercicios;

import java.util.Scanner;

public class ExpensasKary {
	private static final int CANT_DPTOS = 4;

	public static void main(String[] args) {
		float totalExpensas = 0;
		darBienvenida("BIENVENIDO AL SISTEMA DE CARGA DE EXPENSAS");
		System.out.println(" ¿Desea cargar las expensas de cada departamento? (S/N):");
		Scanner sc = new Scanner(System.in);
		String validacion = sc.next();
		if (validacion.equalsIgnoreCase("s")) {
			for (int i = 0; i < CANT_DPTOS; i++) {
				System.out.println("Ingrese el valor a abonar del departamento" + (i + 1) + " : ");
				float dptoExpensas = sc.nextFloat();
				totalExpensas = totalExpensas + dptoExpensas;
			}
			System.out.println("El monto total a abonar de espensas es de: " + totalExpensas + " $ ");
			System.out.println("El monto promedio de expensas es: " + (totalExpensas / CANT_DPTOS) + " $ ");

		} else {
			System.out.println("Que tengas un buen día");
		}

	}

	private static void darBienvenida(String mensajeBienvenida) {
		dibujarDivisor(mensajeBienvenida.length(), "=");
		System.out.print(mensajeBienvenida.toUpperCase());
		dibujarDivisor(mensajeBienvenida.length(), "=");
		System.out.println();
	}

	private static void dibujarDivisor(int longitud, String simbolo) {
		for (int i = 0; i < longitud; i++) {
			System.out.print(simbolo);

		}
		System.out.println();
	}

}

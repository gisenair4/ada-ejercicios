package ejercicios;

import java.util.Scanner;

/*
 * Se desea calcular el total de expensas a pagar de un edificio 
 * de 4 pisos que tiene un departamento por piso desde
 * planta baja hasta el último piso.
 * Se deben ingresar los valoresa de cada departamento y luego informar el importe de expensas promedio
 */
public class Ejercicio900Expensas {
	private static final int TOTAL_PISOS = 4;

	public static void main(String[] args) {

		int pisos[] = new int[TOTAL_PISOS];
		float expensasTotal = 0f;

		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenidos al sistema de recaudación de expensas del edificio Lord ");
		System.out.println("====================================================================");
		System.out.println();

		for (int i = 0; i < pisos.length; i++) {
			System.out.println("Ingrese las expensas para los pisos correspondientes: " + (i + 1));
			pisos[i] = sc.nextInt();
			expensasTotal += pisos[i];

		}
		sc.close();
		float promedio;
		promedio = expensasTotal / TOTAL_PISOS;
		System.out.println("El valor promedio de expensas es: " + promedio);
	}
}

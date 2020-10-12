package ejercicios;
/*
 * /Ejercicio :// Desarrollar un sistema que permita el ingreso de totales recaudados de lunes a viernes,
 * // donde ademas se pueda modificar uno de los valores ingresados seleccionando el numero de dia.
 * Se ingresa toda la semana completa y se modifica de a uno.
 * // Tambien se deberan poder listar los valores ingresados.(opcional ordenado de mayor a menor)
 * // Todas las funciones se codificaran en un menu con valores enteros hasta que el usuario ingrese
 * // cero para salir. (1. agregar 2. listar 3. modificar 0. salir)
 */

import java.util.Scanner;

public class EjercicioRecaudaciones {

	private static final int MAX_OPCION = 3;
	private static final int DIAS = 5;
	private static float[] recaudacion = new float[DIAS];
	private static String[] nombreDia = new String[DIAS];

	public static void main(String[] args) {
		// cargar dias
		cargarDias();

		// mostrar menu opciones
		int opcion = menuOpciones();

		// mientras opcion sea diferente de cero
		while (opcion != 0) {
			// segun la opcion seleccionada hacer la operacion
			switch (opcion) {
			case 1:
				agregarRecaudaci�n();
				break;
			case 2:
				listarRecaudacion();
				break;
			case 3:
				modificarRecaudacion();
				break;
			}

			opcion = menuOpciones();// pedimos nuevamente ingresar al men� opciones.
		}
	}

	private static void cargarDias() {
		nombreDia[0] = "Lunes";
		nombreDia[1] = "Martes";
		nombreDia[2] = "Mi�rcoles";
		nombreDia[3] = "Jueves";
		nombreDia[4] = "Viernes";

	}

	private static void modificarRecaudacion() {
		System.out.println("Ingrese numero de dia a modificar: (o.lun, 1.mar, 2.mie, 3.jue, 4.vie");
		Scanner sc = new Scanner(System.in);
		int dia = sc.nextInt();

		System.out.println("Valor actual: 2" + recaudacion[dia]);
		System.out.println();
		System.out.println("Ingrese nuevo valor: ");
		float nuevaRecaudacion = sc.nextFloat();

		recaudacion[dia] = nuevaRecaudacion;
		System.out.println();
		System.out.println("Recaudacion modificada!");
		System.out.println();

	}

	private static void listarRecaudacion() {

		System.out.println();
		for (int i = 0; i < DIAS; i++) {
			System.out.println("Dia " + nombreDia[i] + " : " + recaudacion[i]);
			System.out.println();

		}

	}

	private static void agregarRecaudaci�n() {
		Scanner sc = new Scanner(System.in);
		// System.out.println("Ingrese d�a: 0: lunes, 1: martes, 2: miercoles, 3:
		// jueves, 4: viernes ");
		for (int dia = 0; dia < DIAS; dia++) {
			System.out.println("Ingrese monto del d�a " + nombreDia[dia] + " : ");
			recaudacion[dia] = sc.nextFloat();
			System.out.println();
		}

		System.out.println("Semana cargada exitosamente!");
		System.out.println();
	}

	private static int menuOpciones() {
		System.out.println("Men� opciones");
		System.out.println("=============");
		System.out.println();
		System.out.println("1. Ingresar recuadaci�n");
		System.out.println("2. Listar recuadaci�n");
		System.out.println("3. Modificar recuadaci�n");
		System.out.println("0. salir ");
		System.out.println("Ingrese opcion: ");
		Scanner scanner = new Scanner(System.in);
		int opcion = scanner.nextInt();
		if (opcion < 0 || opcion > MAX_OPCION) {
			System.out.println("opcion inv�lida");
		}

		return opcion;
	}
}
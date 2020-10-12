package ejercicios;

import java.util.Scanner;

/*
 * Se desea gusrdar los nombres y promedios de N alumnos en dos vectores que luego se vinculen y muestren los resultados de cada uno
 */

public class AlumnosYPromedios {
	public static void main(String[] args) {
		System.out.println("Bienvenidos al sistema de registro de notas de los alumnos");
		System.out.println("==================================================");
		System.out.println();
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese cantidad de alumnos");
		int alumnos = sc.nextInt();

		System.out.println();

		float promedio[] = new float[alumnos];
		String nombres[] = new String[alumnos];
		String acumulador = null;

		for (int i = 0; i < nombres.length; i++) {
			System.out.println(
					"Ingrese el nombre de los alumnos de acuerdo al orden establecido en la lista: " + (i + 1));
			nombres[i] = sc.next();
			// for (int i = 0; i < promedio.length; i++) {

			System.out.println("Ingrese el promedio general del alumno/a : " + (i + 1));
			promedio[i] = sc.nextFloat();
			acumulador += nombres[i] + promedio[i];

		}

		sc.close();
		System.out.println("La lista de los alumnos y sus promedios es la siguiente " + "  " + acumulador);
	}
}

package calculadora;

import java.util.Scanner;

//Un estudiante realiza 4 ex�menes durante el semestre,
// Se desea calcular el promedio de dichas notas
public class PromedioDeNotas {
	private static final int TOTAL_NOTAS = 4;

	public static void main(String[] args) {
		System.out.println("Bienvenido al sistema de c�lculo de promedio de notas");
		System.out.println("=====================================================");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		// float calificaci�n = sc.nextFloat();

		System.out.println();

		float notas[] = new float[TOTAL_NOTAS];
		// float acumulador = 0; Puse esto porque pens� que necesitaba un contador.
		// En este caso no es necesario porque solo necesito sumar las notas que se
		// agregan a un vector.
		float sumaDeNotas = 0;
		for (int i = 0; i < TOTAL_NOTAS; i++) {
			System.out.println("Ingrese calificaci�n de la evaluaci�n " + (i + 1) + " :");

			notas[i] = sc.nextFloat();
			// acumulador = acumulador + notas[i];
			// acumulador += notas[i];
			sumaDeNotas = sumaDeNotas + notas[i];
			// } Pens� que era necesario utulizar otro bucle pero no es necesario.
			// for (int j = 0; j < TOTAL_NOTAS; j++) { Es necesario tener en claro las
			// operaciones sencillas, as� no se hace l�o y no nos enroscamos.
			// sumaDeNotas = sumaDeNotas + calificaci�n;

			// float promedio = sumaDeNotas / TOTAL_NOTAS;
			// 1
			// System.out.println(" El promedio de notas de este semestre es : " +
			// promedio);
		}
		float promedio = sumaDeNotas / TOTAL_NOTAS;
		System.out.println(" El promedio de notas de este semestre es : " + promedio);
	}
}

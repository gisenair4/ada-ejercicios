package ejercicios;

import java.util.Scanner;

public class Ejercicio210Autobuses {
	private static final int MINIMO_PERSONAS = 20;
	private static final int COSTO_A = 2;
	private static final float COSTO_B = 2.5f;
	private static final int COSTO_C = 3;
	private static final String BUS_A = "A";
	private static final String BUS_B = "B";
	private static final String BUS_C = "C";

	public static void main(String[] args) {
		// tres costos diferentes por Km para cada autobus
		// mínimo 20 personas
		// Determinar costo total
		// Determinar costo por persona

		// solicitar la cantidad de personas
		Scanner sc = new Scanner(System.in);

		System.out.println("ingrese cantidad de personas");
		int personas = sc.nextInt();

		// Solicitar cantidad de km
		System.out.println("ingrese cantidad de Km");
		int Km = sc.nextInt();

		// Solicitar autobus

		System.out.println("ingrese cantidad tipo de autobus(A,B,C)");
		String tipo = sc.next();

		int totalPersonas = MINIMO_PERSONAS;

		// Calcular el costo total del transporte

		if (personas > MINIMO_PERSONAS) {
			totalPersonas = personas;
		}
		// calcular costo total:
		// total de personas * km * precio boleto

		int costoTotal = totalPersonas * Km;

		float totalGrupal = 0;

		switch (tipo.toUpperCase()) {
		case BUS_A:
			totalGrupal = costoTotal * COSTO_A;
			break;
		case BUS_B:
			totalGrupal = costoTotal * COSTO_B;
			break;
		case BUS_C:
			totalGrupal = costoTotal * COSTO_C;
			break;
		}

		System.out.println("El total grupal es: " + totalGrupal);
		sc.close();

	}

}

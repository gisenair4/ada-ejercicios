package ejercicios;

import java.util.Scanner;

public class ejercicio214Envios {

	private static final int ZONA_1 = 11;
	private static final int ZONA_2 = 10;
	private static final float ZONA_3 = 12.9f;
	private static final int ZONA_4 = 24;
	private static final float PESO_MAXIMO = 5000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido/a");
		System.out.println("Ingrese el peso del paquete a enviar");
		float peso = sc.nextFloat();

		if (peso > 0 && peso <= PESO_MAXIMO) {
			System.out.println("Ingrese zona de envío");
			System.out.println("America del norte 1, America central 2, America sur 3, Europa 4, Asia 5");
			int zona = sc.nextInt();

			float costoEnvio = 0;

			switch (zona) {
			case 1:
				costoEnvio = peso * ZONA_1;
				break;
			case 2:
				costoEnvio = ZONA_2 * peso;
				break;
			case 3:
				costoEnvio = ZONA_3 * peso;
				break;
			case 4:
				costoEnvio = ZONA_4 * peso;
				break;
			default:
				System.out.println("Zona incorrecta");
			}

			System.out.println("El costo del envío es" + costoEnvio);

		} else {
			System.out.println("Sin servicio para ese peso");

		}

	}
}

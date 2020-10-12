package ejercicios;

import java.util.Scanner;

public class BancoPuebloDesconocido {
	private static final float AUMENTO1 = 0.25f;
	private static final float AUMENTO2 = 0.35f;
	private static final float AUMENTO3 = 0.4f;
	private static final float AUMENTO4 = 0.5f;

	public static void main(String[] args) {
		System.out.println("Bienvenidos al servicio de amento de límite del banco ´Pueblo Desconocido´");
		System.out.println("==========================================");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Ingrese tipo de tarjeta para calcular el aumento en el límite de su tarjeta; 1: visa, 2: mastercard, 3: visa premium, 4: mastercard premium");
		int tipoTarjeta = sc.nextInt();
		// System.out.println("Ingrese el límite actual de su tarjeta: ");
		// int limiteTarjeta = sc.nextInt();
		float nuevoLimite;
		if (tipoTarjeta < 5) {
			System.out.println("Ingrese el límite actual de su tarjeta: ");
			int limiteTarjeta = sc.nextInt();
			switch (tipoTarjeta) {
			case 1:
				nuevoLimite = (limiteTarjeta * AUMENTO1) + limiteTarjeta;
				System.out.println("Su nuevo límite de su tarjeta es: " + nuevoLimite);
				break;
			case 2:
				nuevoLimite = (limiteTarjeta * AUMENTO2) + limiteTarjeta;
				System.out.println("Su nuevo límite de su tarjeta es: " + nuevoLimite);
				break;
			case 3:
				nuevoLimite = (limiteTarjeta * AUMENTO3) + limiteTarjeta;
				System.out.println("Su nuevo límite de su tarjeta es: " + nuevoLimite);
				break;
			case 4:
				nuevoLimite = (limiteTarjeta * AUMENTO4) + limiteTarjeta;

				System.out.println("Su nuevo límite de su tarjeta es: " + nuevoLimite);
				break;

			}

			// System.out.println("Ingrese tipo de tarjeta para calcular el aumento en el
			// límite de su tarjeta; 1: visa, 2: mastercard, 3: visa premium, 4: mastercard
			// premium");
			// tipoTarjeta = sc.nextInt();

		} else {
			System.out.println("Número inválido. Elija entre las opcines que se les muestra a continuación");
			System.out.println(
					"Ingrese tipo de tarjeta para calcular el aumento en el límite de su tarjeta; 1: visa, 2: mastercard, 3: visa premium, 4: mastercard premium");
			tipoTarjeta = sc.nextInt();
		}

	}
}

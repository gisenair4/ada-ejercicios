package ejercicios;

import java.util.Scanner;

public class Servicios {

	private static final int TELEFONIA = 1000;
	private static final int BANDA_ANCHA = 1500;
	private static final int TELEVISION = 2000;

	public static void main(String[] args) {

		// Una empresa de comunicaciones ofrece servicio de telefonía, banda ancha y tv
		// digital.
		// Cada uno de los servicios tiene un precio diferente (Telefonía: 10, Banda
		// ancha: 15, TV, 20).
		// Se desea contar cuántos clientes optan por cada servicio para luego conocer
		// la facturación de cada uno de los servicios.
		// Se deben ingresar los clientes por número (cliente = 0 para finalizar)

		System.out.println("Bienvenido/a al servicio de cotratación de comunicaciones ");
		System.out.println("==========================================================");
		Scanner sc = new Scanner(System.in);

		System.out.println();

		System.out.println(
				"Ingrese el tipo de servicio que desea contratar. 1 Telefonía, 2 Banda ancha, 3 Televisión, 0 para salir");
		int servicios = sc.nextInt();
		int TotalServiciosContratados[] = new int[servicios];
		int costoServicio = 0;

		int acumulador = 0;
		int i = 0;

		for (; i < TotalServiciosContratados.length; i++) {
			TotalServiciosContratados[i] = sc.nextInt();
			acumulador = acumulador + TotalServiciosContratados[i];
			System.out.println("El total de servicios contratados es: " + acumulador);
		}

		while (servicios != 0) {

			switch (servicios) {
			case 1:
				costoServicio = TELEFONIA;
				break;
			case 2:
				costoServicio = BANDA_ANCHA;
				break;
			case 3:
				costoServicio = TELEVISION;
				break;
			default:
				System.out.println(
						"Usted a elegido la opción salir del menú. Gracias por su visita y lo esperamos pronto");
				break;
			}
			System.out.println("El costo del servicio contratado es: " + costoServicio);

		}
		System.out.println("Ingrese el servicio que desea contratar");
		servicios = sc.nextInt();

	}
}

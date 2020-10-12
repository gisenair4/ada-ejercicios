package ejercicios;

import java.util.Scanner;

public class ServiciosLore {
	private static final int COSTO_TELEF = 1000;
	private static final int COSTO_BANDA = 1500;
	private static final int COSTO_TV = 2000;

	public static void main(String[] args) {
		int servicios[] = inicializarServicios();
		procesarVenta(servicios);

	}

	private static void procesarVenta(int[] servicios) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido al sistema online de comunicaciones");
		System.out.println("Por favor, ingrese núemro de cliente, 0 para terminar");
		int cliente = sc.nextInt();
		while (cliente != 0) {
			if (cliente > 0) {
				System.out.println("Por favor ingrese el número de servicio que desea contratar");
				System.out.println(" 1 = telefonía, 2 = banda ancha, 3 = televisión");
				int servicio = sc.nextInt();
				if (0 < servicio && servicio <= 3) {
					servicios[servicio - 1] = servicios[servicio - 1] + 1;
					System.out.println("Por favor ingrese el numero de cliente");
					cliente = sc.nextInt();

				} else {
					System.out.println("Número ingresado no válido");
				}

			} else {
				System.out.println("Número ingresado no válido");

			}
			System.out.println("Por favor, ingresse numero de cliente, 0 para finalizar");
			cliente = sc.nextInt();
		}
		int totalRecaudado = 0;
		totalRecaudado = (servicios[0] * COSTO_TELEF) + (servicios[1] * COSTO_BANDA) + (servicios[2] * COSTO_TV);
		System.out.println("El total recaudado es: " + totalRecaudado);
		for (int i = 0; i < servicios.length; i++) {
			System.out.println("La cantidad de servicios " + (i + 1) + "vendidos es" + servicios[i]);
		}
		sc.close();
	}

	private static int[] inicializarServicios() {
		// TODO Auto-generated method stub
		int servicios[] = new int[3];
		for (int i = 0; i > servicios.length; i++)
			;
		int i = 0;
		servicios[i] = 0;
		return servicios;
	}

}

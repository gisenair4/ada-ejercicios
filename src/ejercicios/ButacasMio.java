package ejercicios;

import java.util.Scanner;

public class ButacasMio {

	private static final int TOTAL_BUTACAS = 50;

	// Se venden boletos de una funcion numerados del 0-49. Cada uno de esos boletos
	// se correspondencia con un asiento
	// Solicitar que asiento elige la persona al comprarlo y marcarlo con un valor 1
	// hasta que se ingrese asiento numero 99
	// Listar los asientos vendidos

	public static void main(String[] args) {

		int butacas[] = new int[TOTAL_BUTACAS];

		for (int i = 0; 1 < TOTAL_BUTACAS; i++) {

			butacas[i] = 0;

			System.out.println("Bienvenido/a al sistema de compra de boletos");
			System.out.println("============================================");
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("Ingrese el número de butaca que desea comprar (99 para salir): ");
			int solicitudAsiento = sc.nextInt();

			while (solicitudAsiento != 99) {

				// agregado:
				// numeroAsiento -> Informar costo 100
				// numeroAsiento 10-19 -> informar costo 80
				// numeroAsiento 20-29> informar costo 60
				// numeroAsiento 30-39 -> informar costo 40
				// numeroAsiento 40-49 -> informar costo 20

				switch (solicitudAsiento / 10) {
				case 0:
					System.out.println("Costo $100");
					break;
				case 1:
					System.out.println("Costo $ 80");
					break;
				case 2:
					System.out.println("Costo $ 60");
					break;
				case 3:
					System.out.println("Costo $ 40");
					break;
				case 4:
					System.out.println("Costo $ 20");
					break;

				}
				if (solicitudAsiento < 0 || solicitudAsiento > TOTAL_BUTACAS - 1) {
					System.out.println("numero de butaca inexistente");
				} else {

					System.out.println("Butaca " + solicitudAsiento + "=" + butacas[solicitudAsiento]);
					if (butacas[solicitudAsiento] == 0) {
						butacas[solicitudAsiento] = 1;
						System.out.println("Venta confirmada");
					} else {
						System.out.println("Butaca ya vendida. Seleccione otra ubicación");

					}
					System.out.println("Ingrese nuevo numero de asiento");
					solicitudAsiento = sc.nextInt();

				}
				sc.close();
				int contador = 0;
				System.out.println("Mostrando butacas vendidas: ");

				for (int j = 0; j < butacas.length; j++) {
					if (butacas[j] == 1) {
						System.out.println("Butaca" + j);
						contador++;

					}
				}
				System.out.println("Butacasvendidas: " + contador);

			}
		}
	}
}
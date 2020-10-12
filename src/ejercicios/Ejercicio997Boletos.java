package ejercicios;

import java.util.Scanner;

// Se venden boletos de una funcion numerados del 0-49. Cada uno de esos boletos

//se corresponde con un asiento
//Solicitar que asiento elige la persona al  comprarlo y marcarlo con un valor 1
//hasta que se ingrese asiento numero 99
//Listar los asientos vendidos

public class Ejercicio997Boletos {

	private static final int TOTAL_BUTACAS = 50;

	public static void main(String[] args) {
		int butacas[] = new int[TOTAL_BUTACAS];

		for (int i = 0; i < TOTAL_BUTACAS; i++) {
			butacas[i] = 0;
		}

		int solicitudAsiento;

		System.out.println("Bienvenidos al sistema de venta de boletos");
		System.out.println("============================================");
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Ingrese numero de asiento");
		solicitudAsiento = sc.nextInt();

		while (solicitudAsiento != 99) {

			// numeroAsiento 0-9- informar costo 100
			// numeroASiento 10- 19 - informar costo 80
			// numeroASiento 20- 29- informar costo 60
			// numeroAsiento 30-39 - informar costo 40
			// numeroAsiento 40-49 - informar costo 20
			switch (solicitudAsiento / 10) {
			case 0:
				System.out.println("costo $100");
				break;
			case 1:
				System.out.println("costo $80");
				break;
			case 2:
				System.out.println("costo $60");
				break;
			case 3:
				System.out.println("costo $40");
				break;
			case 4:
				System.out.println("costo $20");
				break;
			default:
				System.out.println("numero inválido");
				break;
			}
			if (solicitudAsiento < 0 || solicitudAsiento > TOTAL_BUTACAS - 1) {
				System.out.println("numero de butacas inexistente");
			} else {

				System.out.println("Butaca" + solicitudAsiento + "=" + butacas[solicitudAsiento]);
				if (butacas[solicitudAsiento] == 0) {
					butacas[solicitudAsiento] = 1;
					System.out.println("venta confirmada");
				} else {
					System.out.println("Butaca ya vendida. Seleccione otra ubucación ");

				}
				System.out.println("Ingrese numero de asiento");
				solicitudAsiento = sc.nextInt();

			}
			sc.close();
			int contador = 0;
			System.out.println("Mostrar butacas vendidas");
			for (int i = 0; i < butacas.length; i++) {
				if (butacas[i] == 1) {
					System.out.println("Butaca" + i);
					contador++;

				}
			}
			System.out.println("butacas vendidas: " + contador);
			dibujarButacas(butacas);
		}

	}

	private static void dibujarButacas(int[] butacas) {
		// TODO Auto-generated method stub
		for (int i = 0; i < butacas.length; i++) {
			if (butacas[i] == 0) {
				System.out.println("_");
			} else {
				System.out.println("x");
			}
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}

		}
	}
}

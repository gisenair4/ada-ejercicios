package ejercicios;

import java.util.Scanner;

/*
 * Promoci�n todos los trajes conprecio superior a 2500 se les aplicar� un descuendo del 15%
 * a todos los dem�s se les aplicar� un descuento de un 8%.
 */
public class HarapientoDistinguido {
	private static final float DESCUENTO1 = 0.08f;
	private static final float DESCUENTO2 = 0.15f;

	public static void main(String[] args) {
		System.out.println(
				"Bienvenidos al sistema de compras �El Harapiento distinguido�. Con nuestro servicio podr� calcular los descuentos de promoci�n");
		System.out.println("Comencemos");
		System.out.println("====================================================");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el valor del traje a comprar ");
		int precioTraje = sc.nextInt();
		float descuento;
		float TotalPagar;

		if (precioTraje < 2500) {
			descuento = precioTraje * DESCUENTO1;
			System.out.println("Usted obtendr� un descuento de: " + descuento);
			TotalPagar = precioTraje - descuento;
			System.out.println("Usted pagar� un total de :  " + TotalPagar);

		} else {
			if (precioTraje > 2500) {
				descuento = precioTraje * DESCUENTO2;
				System.out.println("Usted obtendr� un descuento de: " + descuento);
				TotalPagar = precioTraje - descuento;
				System.out.println("Usted pagar� un total de :  " + TotalPagar);

			} else {
				System.out.println("El precio del traje es de 2500");
			}

		}

	}
}

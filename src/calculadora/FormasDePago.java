package calculadora;

import java.util.Scanner;

public class FormasDePago {

	private static final float INTERES1 = 1.5f;
	private static final float INTERES2 = 1.4f;

	public static void main(String[] args) {
		System.out.println("Bienvenidos al sistema de servicios de pagos online");
		System.out.println("====================================================");
		System.out.println(" ");
		float importe;
		System.out.println("Por favor ingrese el importe para calcular las formas de pagos");
		Scanner sc = new Scanner(System.in);
		importe = sc.nextFloat();
		System.out.println(
				"Ingrese cantidad la cantidad de cuotas con las que desea pagar el importe, sus opciones son: 1, 2 ó 3 para 6 cuotas (0 para salir)");
		int cuotas = sc.nextInt();
		float totalPagar;
		float cuotasPagar;

		switch (cuotas) {
		case 1:
			totalPagar = importe;
			System.out.println("El total a pagar en 1 cuota es: " + totalPagar);
			break;
		case 2:
			totalPagar = importe * INTERES1;
			cuotasPagar = totalPagar / 2;
			System.out.println("El total a pagar en 2 cuota es: " + totalPagar + "Son 2 cuotas de: " + cuotasPagar);
			break;

		case 3:
			totalPagar = importe * INTERES2;
			cuotasPagar = totalPagar / 6;
			System.out.println("El total a pagar en 6 cuota es: " + totalPagar + "Son 6 cuotas de: " + cuotasPagar);
			break;

		default:
			System.out.println("Las cuotas que ha seleccionado no están disponibles");
			break;

		}

	}

}

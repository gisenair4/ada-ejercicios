package ejercicios;

import java.util.Scanner;

public class TotalRecuadado {
	public static void main(String[] args) {

		darBienvenida();

		Scanner sc = new Scanner(System.in);
		System.out.println("Eliga entre las siguientes opciones: 1 agregar, 2 listar, 3 modificar, 0 salir");

		int menu = sc.nextInt();
		int cajas[] = new int[menu];
		int acumulador = 0;

		int i = 0;
		for (; i < cajas.length; i++) {

		}

		while (menu != 0) {
			switch (menu) {
			case 1:
				System.out.println("Usted a elegido la opci�n agregar");
				break;
			case 2:
				System.out.println("Usted a elegido la opci�n listar");
				break;
			case 3:
				System.out.println("Usted a elegido la opci�n modificar");
				break;
			default:
				System.out.println("usted a legido la opci�n salir del men�. Gracias por su visita");
			}
		}

	}

	private static void darBienvenida() {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido al sistema de recaudaci�n ");
		System.out.println("=====================================");
	}

}

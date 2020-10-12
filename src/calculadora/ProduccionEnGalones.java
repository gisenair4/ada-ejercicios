package calculadora;

import java.util.Scanner;

/*
 * Un productor de leche lleva su registro en litros, pero cuando le pagan lo hace según galones. 
 * Ayude al productor a saber cuánto le pagaran por su producción de un día.
 */
public class ProduccionEnGalones {
	private static final int GALON = 3785;

	public static void main(String[] args) {

		System.out.println("Bienvenidos la servicio de conversión de unidades");
		System.out.println("Con nuestro servicio sabrá cuánto le pagaran por su producción de un día por galones");
		System.out.println("Comencemos ");
		System.out.println("====================================================");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		float galonPorDia;
		float pagoEnGalon;

		System.out.println("Ingrese cantidad de litros de leche producidos en un día");
		int lecheLitros = sc.nextInt();
		System.out.println("Ingrese precio del galón acordado con su comprador");
		int precioGalon = sc.nextInt();

		galonPorDia = lecheLitros / GALON;
		System.out.println("La cantidad de galones que ha producido por día es: " + galonPorDia);

		pagoEnGalon = galonPorDia * precioGalon;
		System.out.println("Lo que le pagaran por lo producido en galones es:  " + pagoEnGalon);

	}

}

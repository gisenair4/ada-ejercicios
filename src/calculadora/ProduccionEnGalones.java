package calculadora;

import java.util.Scanner;

/*
 * Un productor de leche lleva su registro en litros, pero cuando le pagan lo hace seg�n galones. 
 * Ayude al productor a saber cu�nto le pagaran por su producci�n de un d�a.
 */
public class ProduccionEnGalones {
	private static final int GALON = 3785;

	public static void main(String[] args) {

		System.out.println("Bienvenidos la servicio de conversi�n de unidades");
		System.out.println("Con nuestro servicio sabr� cu�nto le pagaran por su producci�n de un d�a por galones");
		System.out.println("Comencemos ");
		System.out.println("====================================================");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		float galonPorDia;
		float pagoEnGalon;

		System.out.println("Ingrese cantidad de litros de leche producidos en un d�a");
		int lecheLitros = sc.nextInt();
		System.out.println("Ingrese precio del gal�n acordado con su comprador");
		int precioGalon = sc.nextInt();

		galonPorDia = lecheLitros / GALON;
		System.out.println("La cantidad de galones que ha producido por d�a es: " + galonPorDia);

		pagoEnGalon = galonPorDia * precioGalon;
		System.out.println("Lo que le pagaran por lo producido en galones es:  " + pagoEnGalon);

	}

}

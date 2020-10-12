package ejercicios;

import java.util.Scanner;

// Se tiene una linea de 4 cajas donde se cobran facturas que luego seran cargadas 
// en el sistema.
//Se solicitara el numero de caja y el importe cobrado. La carga finaliza con importe cero.
//Informar la cantidad de facturas cobradas por cada caja y el promedio de todas las 
// facturas
public class CajasCobranzas {
	public static void main(String[] args) {

		float total = 0f;
		int cantFact = 0;
		float promedio = 0f;
		int cajas[] = new int[4];
		cajas[0] = 123;

		for (int i = 0; i < cajas.length; i++) {
			cajas[i] = 0;
		}
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese importe de caja ( 0 para salir)");
		float importe = sc.nextFloat();

		while (importe != 0) {
			System.out.println("Ingrese numero de cajas a la que corresponde");
			int caja = sc.nextInt();

			if (caja >= 1 && caja < 5) {
				cajas[caja - 1] = cajas[caja - 1] + 1;
				total = total + importe;

			} else {
				System.out.println("Numero de caja incorrecto, ingrese de nuevamente los datos");

			}
			System.out.println("Ingrese el importe recuadado (0 para salir)");
			importe = sc.nextFloat();
		}
		// cantidad de facturas por cajas
		for (int i = 0; i < cajas.length; i++) {
			System.out.println("La caja " + (i + 1) + "tinene " + cajas[i] + "facturas");
			cantFact = cantFact + cajas[i];
		}
		System.out.println("La cantidad de facturas es: " + cantFact);

		// Calcular promedio de importes
		promedio = total / cantFact;

		System.out.println("importe total: " + total);
		System.out.println("Importe promedio: " + promedio);
		sc.close();
	}

}

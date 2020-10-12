package ejercicios;

import java.util.Scanner;

public class EsCapicua {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		boolean capicua = esCapicua(num);
		System.out.println("El número " + num + (capicua ? "si" : "no") + "es capicua");

	}

	private static boolean esCapicua(int num) {
		// TODO Auto-generated method stub
		return num == invertirNumero(num);
	}

	private static int invertirNumero(int num) {
		// TODO Auto-generated method stub
		int cifra, inverso = 0;
		while (num > 0) {
			cifra = num % 10;
			inverso = cifra + inverso * 10;
			num /= 10;
		}
		return inverso;
	}

}

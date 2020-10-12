package ejercicios;

import java.util.Scanner;

public class AhorcadoPasoaPaso {
	private static final int MIN_PALABRA = 4;
	private static final int MAX_PALABRA = 10;
	private static final int MAX_ERRORES = 10;

	public static void main(String[] args) {
		// generar palabra
		String palabra = generarPalabra();

		// repetir ingreso letras hasta adivinar o cantidad de jugadas < 10
		int intentosFallidos = adivinar(palabra);

		// mostrar mensajes de puntos
		mostrarPuntos(intentosFallidos);
	}
	/*
	 * Este método recibe la palabra a adivinar y devuelve el numero de intentos
	 * fallidos en que fue adivinada la palabra
	 */

	private static int adivinar(String palabra) {

		// pedir una letra
		int contadorAciertos = 0;
		int errores = 0;
		boolean[] letrasCorrectas = new boolean[palabra.length()];

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una letra");
		String letra = sc.next();

		// mientras cantidad letras acertadas < total letras
		// o cantidad errores = 10
		while (contadorAciertos < palabra.length() && errores != MAX_ERRORES) {

			// buscar esa letra en la palabra

			int indiceLetra = palabra.indexOf(letra.toUpperCase()); // si no existe devuelve -1

			if (indiceLetra != -1) {
				letrasCorrectas[indiceLetra] = true;

				contadorAciertos++;
			} else {
				errores++;
			}
			// Esto lo pongo porque es necesario que una vez que se completa la
			// palabra no te vuelva a pedir otra letra
			for (int i = 0; i < palabra.length(); i++) {
				// si existe mostrar letra, contar acierto
				if (letrasCorrectas[i]) {
					System.out.println(" " + palabra.charAt(i) + " ");
				} else {
					System.out.println(" _ ");
				}
			}
			// me devuelve la letra en una posicion que corresponde

			System.out.println("Errores: " + errores);

			// sino mostrar_ , contar error
			// mostrar _o_ _ (errores:0)

			// pedir letra sino está la palabra totalmente acertada
			if (contadorAciertos < palabra.length() && errores != MAX_ERRORES) {

				System.out.println("Ingrese una letra");
				letra = sc.next();
			}
		}
		if (errores == MAX_ERRORES) {
			System.out.println("Siga participando!!!");

		} else {
			System.out.println("Ganaste!!!");
		}

		return errores;
	}

	private static void mostrarPuntos(int intentosFallidos) {
		// Calculo de puntaje en base a intentos (4 intentos -> mayor puntaje)
		// 10 intentos -> sin puntaje

		int puntaje = MAX_PALABRA - intentosFallidos;
		System.out.println("Puntaje obtenido" + intentosFallidos);

	}
	/*
	 * solicita el ingreso de una palabra con una cierta cantidad de caracteres y
	 * devuelve la palabra válida enmayuscula
	 */

	private static String generarPalabra() {
		// solicitar ingreso palabra
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese palabra secreta");
		String palabra = sc.next();

		while (palabra.length() < MIN_PALABRA || palabra.length() > MAX_PALABRA) {
			System.out.println("La palabra tienen que tener como mínimo " + MIN_PALABRA);
			System.out.println("La ppalabra tiene que tener com máximo" + MAX_PALABRA);
			System.out.println();
			System.out.println("Ingrese palabra secreta");
			palabra = sc.next();
		}
		// mínimo 4 letras
		// máximo 10 letras
		return palabra.toUpperCase();// me devuelve la palabra en mayuscula por más que yo lo ponga en minuscula
	}

}

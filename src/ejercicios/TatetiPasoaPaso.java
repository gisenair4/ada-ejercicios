package ejercicios;

import java.util.Scanner;

/*
 * Un tablero de 3 x 3 matriz [fila] [columna]
 * dos jugadores que ingresan las coordenadas de cada ficha por teclado
 * una vez que tengo fila y columna de la ficha
 * muestro tablero con x o 0 
 * verifico si es posible jugar esa ficha en esa posicion  y ver si  hay ganador
 * mientras no haya ganador continua el siguiente jugador.
 * 
 * 
 * -----|-----|-----
 *      |     | x -> tablero [1][2]
 * -----|-----|-----
 */

public class TatetiPasoaPaso {
	private static int FILAS = 3;
	private static int COLS = 3;

	public static void main(String[] args) {
		char[][] tablero = new char[FILAS][COLS];
		boolean ganador = false;
		int contador = 2;
		int turno = 1;
		System.out.println("Juguemos al TA-TE-TI");
		System.out.println("********************");
		System.out.println();
		imprimir(tablero);
		while (!ganador && contador < 9) {
			// jugar ficha

			contador++;
			turno = contador % 2;
			ganador = jugarFicha(turno, tablero);

		}
		if (contador == 9) {
			System.out.println("Esta jugada está empatada");

		}
	}

	private static boolean verificar(char[][] tablero) {
		boolean cond1 = tablero[0][0] == tablero[0][1] && tablero[0][0] == tablero[0][2] // diagonal
				&& tablero[0][0] == 'X' || tablero[0][0] == 'O';
		boolean cond2 = tablero[0][0] == tablero[1][0] && tablero[0][0] == tablero[2][0] && tablero[0][0] == 'X'
				|| tablero[0][0] == 'O';
		boolean cond3 = tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2] && tablero[0][0] == 'X'
				|| tablero[0][0] == 'O';
		boolean cond4 = tablero[0][1] == tablero[1][1] && tablero[0][1] == tablero[2][1] && tablero[0][0] == 'X'
				|| tablero[0][0] == 'O';
		boolean cond5 = tablero[0][2] == tablero[1][2] && tablero[0][2] == tablero[2][2] && tablero[0][0] == 'X'
				|| tablero[0][0] == 'O';
		boolean cond6 = tablero[1][0] == tablero[1][1] && tablero[1][0] == tablero[1][2] && tablero[0][0] == 'X'
				|| tablero[0][0] == 'O';
		boolean cond7 = tablero[2][0] == tablero[2][1] && tablero[2][0] == tablero[2][2] && tablero[0][0] == 'X'
				|| tablero[0][0] == 'O';
		boolean cond8 = tablero[0][2] == tablero[1][1] && tablero[0][2] == tablero[2][0] && tablero[0][0] == 'X'
				|| tablero[0][0] == 'O';

		return cond1 || cond2 || cond3 || cond4 || cond5 || cond6 || cond7 || cond8;
	}

	private static boolean jugarFicha(int turno, char[][] tablero) {
		// private static void jugarFicha(int turno, char[][] tablero) {

		Scanner sc = new Scanner(System.in);
		System.out.println("JUGADOR: " + (turno + 1) + "Ingrese fila: ");
		int fila = sc.nextInt();
		System.out.println("Ingrese columna: ");
		int columna = sc.nextInt();
		boolean ganador = false;
		while (columna < 0 || columna > 2 || fila < 0 || fila > 2) {
			System.out.println("ubicación inválida");
			System.out.println("ingrese nueva jugada");
			System.out.println("JUGADOR" + (turno + 1) + "Ingrese fila: ");
			fila = sc.nextInt();
			System.out.println("ingrese columna: ");
			columna = sc.nextInt();
		}
		while (tablero[fila][columna] == 'X' || tablero[fila][columna] == 'O') {
			System.out.println("Jugada no válida");
			System.out.println("Ingrese nueva jugada");
			System.out.println("JUGADOR" + (turno + 1) + "Ingrese fila");
			fila = sc.nextInt();
			System.out.println("ingrese columna: ");
			columna = sc.nextInt();

		}
		if (turno == 0) {
			tablero[fila][columna] = 'X';

		} else {
			tablero[fila][columna] = 'O';
		}
		ganador = verificar(tablero);
		imprimir(tablero);
		if (ganador) {
			System.out.println("GANASTE!!! JUGADOR" + turno);
		}

		return ganador;
	}

	private static void imprimir(char[][] tablero) {
		System.out.println("[");
		for (int fila = 0; fila < FILAS; fila++) {
			for (int col = 0; col < COLS; col++) {
				System.out.print(" " + tablero[fila][col] + " ");

			}
			System.out.println();
		}
		System.out.println("]");
	}

}

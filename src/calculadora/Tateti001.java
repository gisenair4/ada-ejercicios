package calculadora;

public class Tateti001 {
	public String Tablero[][] = new String[3][3];

	/*
	 * 1 2 0 x x x 1 0 0 0 2 x x x
	 * 
	 */
	public boolean ponerFicha(int posf, int posc, String ficha) {

		if (Tablero[posf][posc] != null) {
			if (Tablero[posf][posc] == "_") {
				Tablero[posf][posc] = ficha;
				return (true);

			} else {
				return (false);
			}

		} else {
			return (false);
		}
	}

	public void generarTablero() {

		for (int f = 0; f < Tablero.length; f++) {

			for (int c = 0; c < Tablero[0].length; c++) {
				Tablero[f][c] = "_";
			}
		}
	}

	public void mostrarTablero() {

		for (int f = 0; f < Tablero.length; f++) {

			for (int c = 0; c < Tablero[0].length; c++) {
				System.out.println(Tablero[f][c] + " ");
				System.out.println("  ");
			}
		}
	}
}
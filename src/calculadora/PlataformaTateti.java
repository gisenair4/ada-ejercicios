package calculadora;

public class PlataformaTateti {
	public static void main(String[] args) {

		Tateti001 t1 = new Tateti001();
		t1.generarTablero();
		t1.mostrarTablero();
		t1.ponerFicha(1, 1, "X");
		t1.mostrarTablero();
		t1.ponerFicha(0, 1, "O");
		t1.mostrarTablero();

	}

}

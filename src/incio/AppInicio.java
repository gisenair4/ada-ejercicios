package incio;

/**
 * JAVADOC: es una forma standar de escribir documentacion para clase o metodo
 * 
 * 
 * @author gigi_
 *
 */
public class AppInicio {
	/**
	 * 
	 */
	// comentario de una linea//

	// metodo publico de nombre main con parametros//
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) { // firma del método

		// Calculadora cal = new Calculadora();
		// int resultado;
		// resultado = cal.sumar(2, 3);

		Bicicleta bici = new Bicicleta();
		// bici.acelerar(10);
		System.out.println("La velocidad acutal es: " + bici.getVelocidad());
	}

}

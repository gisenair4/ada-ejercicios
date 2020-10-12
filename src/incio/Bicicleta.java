package incio;

public class Bicicleta {

	private int velocidad;
	private String color;

	public int acelerar(int aceleracion) {
		velocidad = velocidad + aceleracion;
		return velocidad;
	}

	/*
	 * Disminuye la velocidad en valor dado siempre que ese valor no sea mayor a la
	 * velocidad actual
	 */
	public int frenar(int menosVelocidad) {
		if (velocidad - menosVelocidad >= 0) {
			velocidad = velocidad - menosVelocidad;

		} else {
			System.out.println("La velocidad actual no permite freanar con" + menosVelocidad);
		}
		return velocidad;
	}
	/*
	 * pone la velocidad en cero cuando la velocidad actual sea menor que 5
	 */

	public void detener() {
		if (velocidad < 5) {
			this.velocidad = 0;
		} else {
			System.out.println("No se puede frenar a esta velocidad");
		}
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}

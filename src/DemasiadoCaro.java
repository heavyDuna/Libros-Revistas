public class DemasiadoCaro extends Exception { // ejercicio 3

	public double sobreCoste;

	public DemasiadoCaro() {

		super();
		this.sobreCoste = 0;

	}

	public DemasiadoCaro(double sobreCoste) {

		super();
		this.sobreCoste = sobreCoste; // llamos al constructor de clase padre exception
	}

	public double getSobreCoste() {
		return sobreCoste;
	}

}

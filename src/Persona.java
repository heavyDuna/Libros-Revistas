
public class Persona implements Comparable {

	private String nombre;
	private double coste;

	public Persona() {

	}

	public Persona(String nombre, double coste) {

		this.nombre = nombre;
		this.coste = coste;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCoste() {
		return coste;
	}

	public void setCoste(double coste) {
		this.coste = coste;
	}

	public String toString() {
		return "Persona [nombre=" + nombre + ", coste=" + coste + "]";
	}

	public int compareTo(Object o1) {

		Persona p = (Persona) o1;
		return this.getNombre().compareTo(p.getNombre());
	}

}

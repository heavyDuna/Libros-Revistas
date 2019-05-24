import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Coleccion implements Editable {

	private String nombre;
	private TreeSet articulos;
	private int costePorColeccion;
	private Fecha fechaSalida;

	public Coleccion(String nombre, int costePorColeccion, Fecha fechaSalida, TreeSet articulos, Comparator c) {

		this.nombre = nombre;
		this.costePorColeccion = costePorColeccion;
		this.fechaSalida = fechaSalida;
		this.articulos = new TreeSet(c);

	}

	public int getCostePorColeccion() {
		return costePorColeccion;
	}

	public void setCostePorColeccion(int costePorColeccion) {
		this.costePorColeccion = costePorColeccion;
	}

	public Fecha getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Fecha fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public void add(Editable e) {
		this.articulos.add(e);
	}

	public void publicar(Fecha f) {

		this.fechaSalida = f;

		Editable e;
		Iterator it = this.articulos.iterator();

		while (it.hasNext()) {

			e = (Editable) it.next();
			e.publicar(f);

		}

	}

	public double coste(int presupuesto) throws DemasiadoCaro {

		double coste = this.costePorColeccion;
		double totalSobrecoste = 0;

		Editable e;
		Iterator it = this.articulos.iterator();

		while (it.hasNext()) {
			e = (Editable) it.next();

			try {

				coste = coste + e.coste(presupuesto);
			} catch (DemasiadoCaro dem) {

				coste = coste + presupuesto + ((DemasiadoCaro) e).getSobreCoste();

				totalSobrecoste = totalSobrecoste + ((DemasiadoCaro) e).getSobreCoste();

			}
		}

		if (coste > presupuesto) {

			throw new DemasiadoCaro(presupuesto - coste + totalSobrecoste);
		}

		return coste;

	}

	public String showTreeSet(TreeSet articulos) {

		String s = "";
		Editable e;

		Iterator it = this.articulos.iterator();
		while (it.hasNext()) {

			e = (Editable) it.next();
			s = s + e.toString();

		}
		return s;

	}

	public Lista personasImplicadas() {

		Lista l = new Lista();
		Lista listaTotal = new Lista();
		Nodo p;

		Editable e;
		Iterator it = this.articulos.iterator();

		while (it.hasNext()) {

			e = (Editable) it.next();
			l = e.personasImplicadas();
			p = l.getCom();

			while (p != null) {
				if (l.estaLaPersona(p.getInfo())) {

					listaTotal.addPersona(p.getInfo());
				}

				p = p.getSig();
			}

		}

		return listaTotal;
	}

	public Fecha getFechaPublicacion() {

		return null;
	}

	public int getCodigo() {

		return 0;
	}

	public int getCoste() {

		return 0;
	}

	public String toString() {

		return "Coleccion [nombre=" + nombre + ", articulos=" + showTreeSet(articulos) + ", costePorColeccion="
				+ costePorColeccion + ", fechaSalida=" + fechaSalida + "]";

	}

}

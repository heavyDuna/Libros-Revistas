import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Editorial {

	private SortedMap edicion;

	public Editorial() {

		this.edicion = new TreeMap();

	}

	public boolean add(Coleccion c) {

		boolean introducido = false;

		Fecha f = new Fecha();
		f = c.getFechaSalida();

		if (existeClave(f) == false) {

			introducido = true;
			this.edicion.put(f, c);

		}

		return introducido;

	}

	public boolean existeClave(Fecha fec) {

		boolean existe = false;

		Set s = this.edicion.keySet();
		Iterator it = s.iterator();

		while (it.hasNext()) {

			Fecha f;
			f = (Fecha) it.next();

			if (fec.equals(f)) {

				existe = true;
			}

		}

		return existe;

	}

	public double costeTotal(int presupuesto) {

		double costeTotal = 0;
		Coleccion c;
		Fecha f;
		Set s = this.edicion.keySet();
		Iterator it = s.iterator();

		while (it.hasNext()) {

			f = (Fecha) it.next();
			c = (Coleccion) (this.edicion.get(f));

			try {

				costeTotal = costeTotal + c.coste(presupuesto);

			} catch (DemasiadoCaro e) {

				// e.printStackTrace();
			}

		}

		return costeTotal;

	}

	public int numeroPersonas() {

		int cont = 0;
		Fecha f;
		boolean resp = false;
		Coleccion c;
		Nodo q;
		Lista l = new Lista();
		TreeSet t = new TreeSet(new ComparadorFechaCodigo());

		Set s = this.edicion.keySet();
		Iterator it = s.iterator();

		while (it.hasNext()) {

			f = (Fecha) it.next();
			c = (Coleccion) this.edicion.get(f);
			l = c.personasImplicadas();
			q = l.getCom();

			while (q != null) {
				t.add(q.getInfo());
				if(resp==true) {
					cont++;
				}

			}

		}
		return cont;

	}

	@Override
	public String toString() {
		return "Editorial [edicion=" + edicion + "]";
	}

}

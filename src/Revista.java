
public class Revista extends Publicacion implements Editable {

	private int numero;
	private Lista colaboradores;

	public Revista(int numer, Lista colaboradores) {

		super();

		this.numero = numero;
		this.colaboradores = colaboradores;

	}

	public Revista(int codigo, String titulo, Fecha fechaPublicacion, int numero, Lista colaboradores) {

		super(codigo, titulo, fechaPublicacion);

		this.numero = numero;
		this.colaboradores = new Lista();
	}

	public void add(Persona p) {

		this.colaboradores.addPersona(p);
	}

	public void publicar(Fecha f) {

		this.setFechaPublicacion(f);

	}

	public Lista personasImplicadas() {

		return this.colaboradores;
	}

	public double coste(int presupuesto) throws DemasiadoCaro {

		double coste = this.colaboradores.coste();

		if (coste > presupuesto)
			throw new DemasiadoCaro(presupuesto - coste);
		return coste;

	}

	public int getCoste() {

		return 0;
	}

	@Override
	public String toString() {
		return "Revista [numero=" + numero + ", colaboradores=" + colaboradores + ", getCodigo()=" + getCodigo()
				+ ", getTitulo()=" + getTitulo() + ", getFechaPublicacion()=" + getFechaPublicacion() + "]";
	}

}

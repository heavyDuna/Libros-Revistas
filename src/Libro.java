
public class Libro extends Publicacion implements Editable {

	private Persona autor;
	private int capitulos;
	private Persona ilustrador;

	public Libro(int codigo, String titulo, Fecha fechaPublicacion, Persona autor, int capitulos, Persona ilustrador) {

		super(codigo, titulo, fechaPublicacion);

		this.autor = autor;
		this.capitulos = capitulos;
		this.ilustrador = ilustrador;

	}

	public Libro(Persona autor, int capitulos, Persona ilustrador) {

		super();

		this.autor = autor;
		this.capitulos = capitulos;
		this.ilustrador = ilustrador;

	}

	public Persona getAutor() {
		return autor;
	}

	public void setAutor(Persona autor) {
		this.autor = autor;
	}

	public int getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(int capitulos) {
		this.capitulos = capitulos;
	}

	public Persona getIlustrador() {
		return ilustrador;
	}

	public void setIlustrador(Persona ilustrador) {
		this.ilustrador = ilustrador;
	}

	public Lista personasImplicadas() {

		Lista l = new Lista();

		l.addPersona(autor);
		l.addPersona(ilustrador);

		return l;
	}

	public double coste(int presupuesto) throws DemasiadoCaro {

		double coste = 0;

		coste = coste + autor.getCoste() + ilustrador.getCoste();

		if (coste > presupuesto)

			throw new DemasiadoCaro(presupuesto - coste);

		return coste;
	}

	@Override
	public void publicar(Fecha f) {

		this.setFechaPublicacion(f);

	}

	public int getCoste() {

		return 0;
	}

	public String toString() {
		return "Libro [autor=" + autor + ", capitulos=" + capitulos + ", ilustrador=" + ilustrador + ", getCodigo()="
				+ getCodigo() + ", getTitulo()=" + getTitulo() + ", getFechaPublicacion()=" + getFechaPublicacion()
				+ "]";
	}

}

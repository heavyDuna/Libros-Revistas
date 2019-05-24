
public class Publicacion {

	private int codigo;
	private String titulo;
	private Fecha fechaPublicacion;

	public Publicacion() {

		this.codigo = 0;
		this.titulo = "";
		this.fechaPublicacion = new Fecha();
	}

	public Publicacion(int codigo, String titulo, Fecha fechaPublicacion) {

		super();

		this.codigo = codigo;
		this.titulo = titulo;
		this.fechaPublicacion = fechaPublicacion;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Fecha getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Fecha fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public String toString() {
		return "Publicacion [codigo=" + codigo + ", titulo=" + titulo + ", fechaPublicacion=" + fechaPublicacion + "]";
	}

}

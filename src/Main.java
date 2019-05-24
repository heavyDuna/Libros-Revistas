import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Fecha f = new Fecha(20, 04);
		Fecha f2 = new Fecha(15, 07);
		Fecha f3 = new Fecha(28, 11);

		Persona p = new Persona("Pepe", 10.50);
		Persona p2 = new Persona("Daniela", 12.80);

		Lista l = new Lista();
		l.addPersona(p);
		l.addPersona(p2);

		ComparadorFechaCodigo com = new ComparadorFechaCodigo();
		// ComparadorFecha comf = new ComparadorFecha();
		TreeSet t = new TreeSet();
		TreeSet t2 = new TreeSet();

		Coleccion c = new Coleccion("Dinosaurios", 10, f, t, com);

		Coleccion c2 = new Coleccion("Historia", 20, f2, t2, com);
		c2.setCostePorColeccion(20);
		c2.setFechaSalida(f);

		Revista r = new Revista(1, "SuperPop", f, 20, l);
		Revista r2 = new Revista(3, "Hola", f2, 123, l);

		Libro li = new Libro(2, "La vida es sueño", f2, p, 12, p2);
		Libro li2 = new Libro(3, "5 horas con Mario", f3, p2, 5, p);

		c.add(li);
		// c.add(r);

		c2.add(r);
		c2.add(li);
		// c.add(li2);
		/*
		 * try { System.out.println(c.coste(10));
		 * 
		 * } catch (DemasiadoCaro e1) {
		 * 
		 * System.out.println("Muy caro"); // e1.printStackTrace(); }
		 */

		// System.out.println(c);
		// System.out.println(c2);

		/*
		 * try { System.out.println(c.coste(100));
		 * 
		 * } catch (DemasiadoCaro e1) {
		 * 
		 * System.out.println("Muy caro"); // e1.printStackTrace(); }
		 */

		System.out.println(c.personasImplicadas());

		Editorial e = new Editorial();
		e.add(c);
		System.out.println(e);

		/*
		 * try { System.out.println(e.costeTotal()); } catch (DemasiadoCaro e1) { //
		 * TODO Auto-generated catch block e1.printStackTrace(); }
		 */

	}

}

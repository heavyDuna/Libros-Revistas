import java.util.Comparator;

public class ComparadorFechaCodigo implements Comparator {

	public int compare(Object o1, Object o2) {

		Editable e1 = (Editable) o1;
		Editable e2 = (Editable) o1;

		int resp1 = e1.getFechaPublicacion().compareTo(e2.getFechaPublicacion());

		int resp2 = 0;

		if (e1.getCodigo() > e2.getCodigo()) {

			resp2 = 1;
		} else if (e1.getCodigo() < e2.getCodigo()) {

			resp2 = -1;
		} else if (e1.getCodigo() == e2.getCodigo()) {

			resp2 = 0;
		}

		if (resp1 != 0) {
			return resp1;
		} else if (resp2 != 0) {

			return resp2;
		} else {

			return 0;
		}

	}
}

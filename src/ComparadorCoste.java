import java.util.Comparator;

public class ComparadorCoste implements Comparator {

	public int compare(Object o1, Object o2) {

		Editable a1 = (Editable) o1;
		Editable a2 = (Editable) o2;

		double coste = 0;
		try {
			coste = a1.coste(0);
		} catch (DemasiadoCaro de) {

			coste = ((DemasiadoCaro) a2).getSobreCoste();

		}
		return 0;
	}

}

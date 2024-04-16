import java.util.Comparator;

public class ComparaEnterosDecrecientes implements Comparator { // EJERCICIO_6_32
	@Override
	public int compare(Object o1, Object o2) {

		Integer n1 = (Integer) o1;
		Integer n2 = (Integer) o2;
		return n2 - n1;
	}

}

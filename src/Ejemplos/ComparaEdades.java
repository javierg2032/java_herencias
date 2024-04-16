package Ejemplos;

import java.util.*;

public class ComparaEdades implements Comparator{


	@Override
	public int compare(Object o1, Object o2) {
		return((Socio)o1).edad() - ((Socio)o2).edad();
	}

}

import java.util.Arrays;

public class Ejercicio_6_32 {

	public static void main(String[] args) {
		Integer tabla[] = new Integer[20];
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 100 + 1);
		}
		System.out.println(Arrays.toString(tabla));
		Arrays.sort(tabla);
		System.out.println(Arrays.toString(tabla));
		ComparaEnterosDecrecientes comparaEnterosDecre = new ComparaEnterosDecrecientes();
		Arrays.sort(tabla, comparaEnterosDecre);
		System.out.println(Arrays.toString(tabla));

	}

}

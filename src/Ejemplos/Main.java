package Ejemplos;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		/*
		 * Pato pato = new Pato(); Flamenco flamenco = new Flamenco();
		 * 
		 * System.out.println("Edad en la clase Pato: " + pato.edad); pato.comer();
		 * flamenco.comer(); pato.dormir(); flamenco.dormir();
		 * 
		 * Ave ave = pato;
		 * 
		 * ave.dormir();
		 */
		/*
		 * Sonido sonido=new Sonido() { public void voz() {
		 * System.out.println("Mosquis"); } }; sonido.voz();
		 */

		/*
		 * Socio s1 = new Socio(3, "Alberto", "2002-01-23"); Socio s2 = new Socio(1,
		 * "Alfredo", "2001-12-31"); int comparar=s1.compareTo(s2);
		 * System.out.println(comparar);
		 */

		Socio tabla[] = new Socio[] { new Socio(3, "Javi", "2002-09-21"), new Socio(1, "Kike", "1996-05-15"),
				new Socio(5, "Belén", "2007-02-28"), };

		ComparaEdades comparaEdades = new ComparaEdades();
		Arrays.sort(tabla, comparaEdades);
		System.out.println("Ordenador por edades");
		System.out.println(Arrays.toString(tabla));
		System.out.println();

		System.out.println("Ordenador por orden alfabetico");
		ComparaNombres comparaNombre = new ComparaNombres();
		Arrays.sort(tabla, comparaNombre);
		System.out.println(Arrays.toString(tabla));
		System.out.println();

		System.out.println("Ordenador por edades decrecientes");
		ComparaEdadesDecrecientes comparaEdadesDecre = new ComparaEdadesDecrecientes();
		Arrays.sort(tabla, comparaEdadesDecre);
		System.out.println(Arrays.toString(tabla));
		System.out.println();
	}

}

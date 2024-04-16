package Ejemplos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable {
	// ATRIBUTOS
	int id;
	String nombre;
	LocalDate fechaNacimiento;

	// CONSTRUCTORES
	public Socio(int id, String nombre, String fechaNacimiento) {
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
	}

	// METODOS DE LA CLASE
	int edad() {
		int edad = 0;
		edad = (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
		return edad;
	}

	@Override

	/*public int compareTo(Object o) {
		int resultado = 0;
		Socio otroSocio = (Socio) o;
		if (this.id > otroSocio.id) {
			resultado = 1;
		} else if (this.id < otroSocio.id) {
			resultado = -1;
		} else
			resultado = 0;

		return resultado;
	}*/

	/*
	 * public int compareTo(Object o) { return this.id - ((Socio) o).id; }
	 */

	public int compareTo(Object o) {
		Socio otroSocio=((Socio) o);
		return this.nombre.compareTo(otroSocio.nombre);
	}
	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombre=" + nombre + ", edad()=" + edad() + "]";
	}

}

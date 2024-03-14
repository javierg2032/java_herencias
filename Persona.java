
public class Persona {
	// ATRIBUTOS
	String nombre;
	int edad;
	double estatura;

	// CONSTRUCTORES
	Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;

	}

	Persona() {

	}

	// METODOS DE LA CLASE
	void mostrarDatos() {
		System.out.println(nombre);
		System.out.println(edad);
		System.out.println(estatura);
	}

	@Override
	public String toString() {
		String cad;
		cad = "Nombre: " + nombre + " - Edad: " + edad + " - Estatura: " + estatura;
		return cad;
	}
	
	@Override
	public boolean equals(Object o) {
		Persona otraPersona = (Persona)o;
		boolean iguales;
		if(this.nombre.equals(otraPersona.nombre) &&
		this.edad == otraPersona.edad) {
		iguales = true;
		}else {
		iguales = false;
		}
		return iguales;

	}

}

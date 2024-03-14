
public class Empleado extends Persona {
	// AATRIBUTOS
	double sueldo;
	String estatura;

	// CONSTRUCTORES
	Empleado(String nombre, int edad, String estatura, double sueldo) {
		super(nombre, edad);
		this.sueldo = sueldo;
		this.estatura = estatura;

	}

	Empleado() {

	}

	// METODOS DE LA CLASE

	@Override // QUIERE DECIR QUE EL METODO ESTÁ SOBRESCRITO
	void mostrarDatos() {
		System.out.println(nombre);
		System.out.println(edad);
		System.out.println(estatura);
		System.out.println(sueldo);
	}
}

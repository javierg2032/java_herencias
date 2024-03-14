
public class Main {

	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Alberto", 40, "XXL", 5000);
		empleado1.mostrarDatos();

		System.out.println(empleado1.toString());

		Empleado empleado = new Empleado();
		Persona persona = empleado1;
		persona.mostrarDatos();

		System.out.println(persona.toString());
	}

}

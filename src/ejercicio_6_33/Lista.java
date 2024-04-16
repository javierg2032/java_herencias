package ejercicio_6_33;

import java.util.Arrays;

public class Lista {
	// ATRIBUTOS
	Object tabla[];

	// CONSTRUCTORES
	public Lista() {
		tabla = new Object[0];
	}

	// GETTERS Y SETTERS

	// METODOS DE LA CLASE
	public int numElementos() {// DEVUELVE EL NUMERO DE ELEMENTOS DE LA LISTA
		return tabla.length;
	}

	public boolean insertarAlFinal(Object objeto) {// INSERTAR UN ELEMENTO AL FINAL DE LA LISTA
		boolean insertado = false;
		int inicial = numElementos();
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = objeto;
		if (numElementos() > inicial && tabla[tabla.length - 1] != null) {
			insertado = true;
		}
		return insertado;
	}

	@Override
	public String toString() {// IMPRIME LA LISTA
		return Arrays.toString(tabla);
	}

	public void insertarAlPrincipio(Object objeto) {
		Object tabla2[] = new Object[0];
		tabla2 = Arrays.copyOf(tabla, tabla.length + 1);
		for (int i = 0; i < tabla.length; i++) {
			tabla2[i + 1] = tabla[i];
		}
		tabla2[0] = objeto;
		tabla = tabla2;

	}

}
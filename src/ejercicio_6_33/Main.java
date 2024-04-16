package ejercicio_6_33;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Lista lista1 = new Lista();
		Object o1 = new Object();
		lista1.insertarAlFinal(o1);
		lista1.insertarAlFinal(5);
		lista1.insertarAlFinal("Hola mundo");
		System.out.println(lista1);

	}

}

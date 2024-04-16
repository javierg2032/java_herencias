
public class Ejercicio_6_10 {

	public static void main(String[] args) {
		Lista lista1 = new Lista();
		lista1.insertarAlFinal(8);
		lista1.insertarAlFinal(6);
		lista1.insertarAlFinal(7);
		lista1.insertarAlFinal(3);
		lista1.insertarAlFinal(2);
		lista1.insertarAlFinal(0);

		Lista lista2 = new Lista();
		//lista2.insertarAlFinal(lista1);

		lista2.insertarAlFinal(8);
		lista2.insertarAlFinal(6);
		lista2.insertarAlFinal(7);
		lista2.insertarAlFinal(3);
		lista2.insertarAlFinal(2);
		lista2.insertarAlFinal(0);

		System.out.println(lista1);
		System.out.println(lista2);

		System.out.println(lista1.equals(lista2));
	}

}

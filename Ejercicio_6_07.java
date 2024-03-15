
public class Ejercicio_6_07 {

	public static void main(String[] args) {
		Caja caja1 = new Caja(10, 20, 10, "cm");
		caja1.setEtiqueta("Etiqueta de la caja 1");
		System.out.println(caja1.toString());

		CajaCarton caja2 = new CajaCarton(10, 20, 10);
		System.out.println(caja2);
	}

}

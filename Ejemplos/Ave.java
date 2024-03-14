package Ejemplos;

public abstract class Ave {
	int edad = 1;

	void comer() {
		System.out.println("metodo comer definido en ave");
	}

	abstract void dormir();
}

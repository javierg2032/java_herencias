package Ejemplos;

public class Main {

	public static void main(String[] args) {
		Pato pato = new Pato();
		Flamenco flamenco = new Flamenco();

		System.out.println("Edad en la clase Pato: " + pato.edad);
		pato.comer();
		flamenco.comer();
		pato.dormir();
		flamenco.dormir();

		Ave ave = pato;
		
		ave.dormir();

	}

}

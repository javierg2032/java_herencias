import java.util.Arrays;

public abstract class Instrumento {// EJERCICIO_6_04

	// ATRIBUTOS
	NotasMusicales melodia[];

	// CONSTRUCTORES
	public Instrumento(NotasMusicales melodia[]) {
		this.melodia = melodia;
	}

	// GETTERS Y SETTERS

	// METODOS DE LA CLASE
	
	public void addEnum(NotasMusicales nota) {

		melodia = Arrays.copyOf(melodia, melodia.length + 1);
		melodia[melodia.length - 1] = nota;

	}

	public abstract void interpretar();

}

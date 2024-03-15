
public class CajaCarton extends Caja {
	// ATRIBUTOS

	// CONSTRUCTORES
	public CajaCarton(int alto, int ancho, int fondo) {
		super(alto, ancho, fondo);
		this.unidad = Unidad.cm;
		this.etiqueta = "";
	}

	// METODOS DE LA CLASE
	@Override
	public double getVolumen() {
		double volumen = alto * ancho * fondo * 0.8;
		return volumen;

		// OPCION 2:
		// return 1000000*0.8 * super.getVolumen();

	}

	public int getSuperficie() {
		return (2 * alto * ancho) + (2 * alto * fondo) + (2 * ancho * fondo);

	}

	@Override
	public String toString() {
		return "CajaCarton [alto=" + alto + ", ancho=" + ancho + ", fondo=" + fondo + ", volumen=" + getVolumen()+" cm³"
				+ ", superficie=" + getSuperficie() + " cm²]";
	}

}

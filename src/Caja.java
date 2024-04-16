
public class Caja {
	// ATRIBUTOS
	int alto;
	int ancho;
	int fondo;
	Unidad unidad;
	String etiqueta;

	// CONSTRUCTORES
	public Caja(int alto, int ancho, int fondo, String unidad) {
		this.alto = alto;
		this.ancho = ancho;
		this.fondo = fondo;
		this.unidad = Unidad.valueOf(unidad);
		this.etiqueta = "";
	}

	public Caja(int alto, int ancho, int fondo) {
		this.alto = alto;
		this.ancho = ancho;
		this.fondo = fondo;
	}
	
	// GETTERS Y SETTER
	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getFondo() {
		return fondo;
	}

	public void setFondo(int fondo) {
		this.fondo = fondo;
	}

	public Unidad getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = Unidad.valueOf(unidad);
	}

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		if (etiqueta.length() <= 30) {
			this.etiqueta = etiqueta;
		} else
			System.out.println("La longitud de la etiqueta excede los 30 caracteres");
	}

	// METODOS DE LA CLASE
	public double getVolumen() {
		double volumen = alto * ancho * fondo;
		if (unidad == Unidad.cm) {
			volumen = volumen / 1000000;
		}
		return volumen;
	}

	@Override
	public String toString() {
		return "Caja [alto=" + alto + ", ancho=" + ancho + ", fondo=" + fondo + ", unidad=" + unidad + ", etiqueta="
				+ etiqueta + ", volumen=" + getVolumen() + "]";
	}

}

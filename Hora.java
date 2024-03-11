
public class Hora {
	// ATRIBUTOS
	int hh;
	int mm;

	// CONSTRUCTORES
	Hora(int hh, int mm) {
		this.hh = hh;
		this.mm = mm;
	}

	Hora() {

	}

	// GETTERS Y SETTER

	// METODOS DE LA CLASE
	void inc() {
		mm++;
		if (mm == 60) {
			hh++;
			mm = 0;
			if (hh == 24) {
				hh = 0;
			}
		}
	}

	boolean setMinutos(int mm) {
		boolean seHaCambiado = false;
		if (mm >= 0 && mm <= 59) {
			this.mm = mm;
			seHaCambiado = true;
		}
		return seHaCambiado;
	}

	boolean setHora(int hh) {
		boolean seHaCambiado = false;
		if (hh >= 0 && hh <= 23) {
			this.hh = hh;
			seHaCambiado = true;
		}
		return seHaCambiado;
	}

	@Override
	public String toString() {
		if (mm <= 9) {
			return hh + ":0" + mm;
		} else
			return hh + ":" + mm;
	}
}

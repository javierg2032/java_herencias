
public class HoraExacta extends Hora {

	// ATRIBUTOS
	int ss;

	// CONSTRUCTORES
	HoraExacta(int hh, int mm, int ss) {
		super(hh, mm);
		this.ss = ss;
	}

	HoraExacta() {

	}

	// GETTERS Y SETTERS

	// METODOS DE LA CLASE
	boolean setSegundos(int s) {
		boolean seHaCambiado = false;
		if (ss >= 0 && ss <= 59) {
			this.ss = ss;
			seHaCambiado = true;
		}
		return seHaCambiado;
	}

	@Override
	void inc() {
		ss++;
		if (ss == 60) {
			mm++;
			ss = 0;
			if (mm == 60) {
				hh++;
				mm = 0;
				if (hh == 24) {
					hh = 0;
				}
			}
		}
	}

	@Override
	public String toString() {
		if (ss <= 9 && mm <= 9) {
			return hh + ":0" + mm + ":0" + ss;
		} else if (mm <= 9) {
			return hh + ":0" + mm + ":" + ss;
		} else if (ss <= 9) {
			return hh + ":" + mm + ":0" + ss;
		} else
			return hh + ":" + mm + ":" + ss;
	}
}

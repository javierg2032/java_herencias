
public class Campana extends Instrumento {

	public Campana(NotasMusicales[] melodia) {
		super(melodia);
	}

	@Override
	public void interpretar() {
		for (int i = 0; i < melodia.length; i++) {
			System.out.println("Ding");
		}

	}

}

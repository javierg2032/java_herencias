import java.util.Arrays;

public class Piano extends Instrumento {

	public Piano(NotasMusicales[] melodia) {
		super(melodia);
	}

	@Override
	public void interpretar() {
		System.out.println(Arrays.toString(melodia));
	}

}

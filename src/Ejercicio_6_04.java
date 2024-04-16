
public class Ejercicio_6_04 {

	public static void main(String[] args) {

		// OPCION 1
		NotasMusicales notas1[] = new NotasMusicales[2];
		notas1[0] = NotasMusicales.DO;
		notas1[1] = NotasMusicales.SOL;

		// OPCION 2
		NotasMusicales notas2[] = { NotasMusicales.DO, NotasMusicales.SOL };

		Piano piano1 = new Piano(notas1);
		piano1.interpretar();
		piano1.addEnum(NotasMusicales.RE);
		piano1.interpretar();
		piano1.addEnum(NotasMusicales.SOL);
		piano1.interpretar();
		piano1.addEnum(NotasMusicales.FA);
		piano1.interpretar();
	}

}

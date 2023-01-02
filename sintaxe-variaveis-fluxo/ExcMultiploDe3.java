
public class ExcMultiploDe3 {
	public static void main(String[] args) {
		for (int contador = 1; contador < 100; contador++) {
			if (contador % 3 == 0) { // outra opção no lugar de contador++ usarcontador+=3, assim não precisaria do
										// if
				System.out.println(contador);
			}

		}
	}
}

public class exercicio {

	public static void main(String[] args) {

		boolean foiPromovido = true;
		double salario = 3880.0;

		if (foiPromovido) {
			System.out.println("Parabéns pela promoção, seu salário agora é de: " + (salario + 400) + " reais");
		} else {
			System.out.println("Seu salário de " + salario + " não terá nenhum aumento.");
		}

	}
}

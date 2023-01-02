
public class TestaCondicional {
	public static void main(String[] args) {
		// System.out.println("testando condicional");
		int idade = 17;
		int acompanhadoPorAlguem = 19;

		if (idade >= 19) {
			System.out.println("pode passar");
		} else if (acompanhadoPorAlguem >= 19) {
				System.out.println("não tem idade mas esta acompanhado");
			} else {
				System.out.println("vc não pode passar");
			}
		}
}



public class TestaEscopo {
	public static void main(String[] args) {
		int idade = 17;
		int quantidadePessoa = 3;
		boolean acompanhado;
		
		if (quantidadePessoa >= 3) {
			acompanhado = true;
		}
		else {
			acompanhado = false;
		}
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		}
		else {
			System.out.println("vc não pode entrar");
		}
		
		
	}

}

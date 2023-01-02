
public class TesteCondicional2 {
	public static void main(String[] args) {
		int idade = 18;
		//int acompanhadoAlguem = 30; abaixo vamos usar "boolean" no lugar de "int".
		boolean acompanhado = true;
		
		//usando uma forma resumida para essa condicional com relação ao testa condicional (1).
		
		/*if (idade >= 21 || acompanhadoAlguem >= 30) {
			System.out.println("pode passar");
		}*/
		if (idade >= 20 || acompanhado == true) { // nesse caso, não ha necessidade de digitar "acompanhado == true", essa variavel ja é boolean, então so digitar o nome da variável ja compila.
			
			System.out.println("pode passar");
		}
		else {
				System.out.println("vc não pode passar");
			}
			}
	}

// para adicionar duas condições a serem atendidas, usa-se "&&" no lugar de "||".

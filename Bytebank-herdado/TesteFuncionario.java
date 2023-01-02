
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario ficticio = new Gerente();
		
		ficticio.setNome("Funcionário1");
		ficticio.setCpf("111.222.333-44");
		ficticio.setSalario(3000);
		
		System.out.println(ficticio.getNome());
		System.out.println(ficticio.getSalario());
		System.out.println(ficticio.getBonificacao());
		
		Gerente gerente = new Gerente();
		
		gerente.setCpf("444.333.222-11");
		gerente.setNome("Gerente1");
		gerente.setSalario(5000.0);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getSalario());
		System.out.println(gerente.getBonificacao());
		
		boolean autenticou = gerente.autentica(222);
		System.out.println(autenticou); //retorna false porque o valor default da senha é zero.
		//para alterar, é necessario criar o metodo setSenha e alterar seu valor.
		
		
		
		
		
		
		
		
		
		

	}

}

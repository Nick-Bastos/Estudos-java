
public class Gerente extends Funcionario {
	
	private int senha = 2222;
	
	public void setSenha(int senha) {
		this.senha = senha;		
	}
	
	public boolean autentica (int senha){
		if( this.senha == senha) {
			return true;
		} else {
			return false;
		}
		
	}
	
	// esse metodo abaixo é usado prq o atributo salario é do tipo protected.
	
	public double getBonificacao() {//reescrita, metodo da classe mãe, reescrito na classe filha.
		System.out.println("chamando metodo do gerente");// teste para rodar na classe testereferencia
		return super.salario + super.getBonificacao();
		
		/* a keyword "super" usada no lugar de this
		indica que esta subindo a hierarquia
		para acessar o atributo salario
		ja que gerente é classe filha e salario esta atribuido na classe mae*/
	}
	
	

}

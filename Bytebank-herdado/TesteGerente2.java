
public class TesteGerente2 extends Funcionario {
	
	/*se o atributo salario for declarado private e não protected, 
	  vc pode chamar pelo metodo get, buscando diretamente da classe mãe*/
	
	
	Gerente gerente2 = new Gerente();
	
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario(); //usando metodo get com a palavra super.
	}
	
}

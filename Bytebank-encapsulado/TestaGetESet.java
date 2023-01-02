
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(23);
		conta.setNovoNumero(16);
		System.out.println(conta.getNovoNumero());
		
		
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Pedro");
		cliente1.setCpf("109.876.543-21");
		cliente1.setProfissao("Administrador");
		
		Conta conta2 = new Conta(2);
		Conta conta3 = new Conta(2);
		Conta conta4 = new Conta(2);
		Conta conta5 = new Conta(2);
	
		conta.setTitular(cliente1);
		
		
		System.out.println(conta.getTitular().getNome());
		System.out.println(cliente1);
		conta.getTitular().setProfissao("CEO"); //titular é o mesmo cliente, então está "cetando" para profissao
		System.out.println(cliente1.getProfissao());
		//mesmo codigo acima, agora em duas linhas
		Cliente titularDaConta = conta.getTitular(); //variável temporaria (titularDaConta)
		titularDaConta.setProfissao("president");
		System.out.println(cliente1.getProfissao());
		
		System.out.println(Conta.getTotal()); //usar o getTotal para chamar o metodo e mostrar o resultado total de objetos do tipo conta.
		
	}

}

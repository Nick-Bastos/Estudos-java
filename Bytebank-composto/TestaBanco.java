
public class TestaBanco {
	public static void main(String[] args) {
		Cliente fulano = new Cliente();
		fulano.nome = "Moisés";
		fulano.cpf = "111.222.333-44";
		fulano.profissao ="Engenheiro";
		
		Conta conta1 = new Conta();
		conta1.deposita(6000);
		conta1.titular = fulano;
		
		System.out.println(conta1.mostraSaldo());
				
		System.out.println(conta1.saca(100));
		System.out.println(conta1.titular.nome);
		System.out.println(conta1.mostraSaldo());
		
	}

}

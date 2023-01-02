
public class TestaMetodo {
	public static void main(String[] args) {
		
		Conta minhaConta = new Conta();
		minhaConta.saldo = 100;
		
		minhaConta.deposita(60);
		System.out.println(minhaConta.saldo);
		minhaConta.saca(40);
		System.out.println(minhaConta.saldo);
		
		Conta contaDois = new Conta();
		contaDois.deposita(3000);
		contaDois.transfere(300, minhaConta);
		
		System.out.println(contaDois.saldo);
		System.out.println(minhaConta.saldo);
		
	}

}

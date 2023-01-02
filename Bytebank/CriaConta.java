
/*public class CriaConta {
	public static void main(String [] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);  
		//primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo += 100);*/
		
		public class CriaConta {

		    public static void main(String[] args) {
		        Conta primeiraConta = new Conta();
		        primeiraConta.saldo = 200; //sintaxe atribuindo valor(200) ao atributo da conta: saldo.
		        System.out.println(primeiraConta.saldo);

		        primeiraConta.saldo += 100;
		        System.out.println(primeiraConta.saldo);

		        Conta segundaConta = primeiraConta;
		        segundaConta.saldo = 50;

		        System.out.println("primeira conta tem " + primeiraConta.saldo);
		        System.out.println("segunda conta tem " + segundaConta.saldo);
		        System.out.println(primeiraConta); // mostra o "endereço" do objeto
		    }
		}
	



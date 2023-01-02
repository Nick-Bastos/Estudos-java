
public class Conta {

	// atributos
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;// criando um atributo static para mostrar total de contas(objetos) criados.
	// se não usar o static, vai ser considerado que todo objeto tera o atributo
	// total,
	// ja com ele, abrange a classe de modo geral.

	// construtor
	public Conta(int agencia) {
		// primeira forma
		Conta.total++;// nesse caso não usa o this, prq é um atributo static, e tbm não ha necessidade
						// de usar a classe "Conta" antes.

		// total++;// chamando o atributo e adicionando +1 a cada objeto criado.
		System.out.println("o total de contas é: " + Conta.total);
		if (agencia <= 0) {
			System.out.println("não pode blablabla...");

		}
		this.agencia = agencia;

		System.out.println(this.agencia);

	}

	// metodos
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}

	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public double mostraSaldo() {
		return this.saldo;
	}

	// getters e setters

	public int getNovoNumero() {
		return this.numero;
	}

	public int setNovoNumero(int numero) {
		return this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;

	}

	public static int getTotal() {
		return total;
	}

	// testando construtores
	// get e set agencia

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getAgencia() {
		return agencia;
	}

}

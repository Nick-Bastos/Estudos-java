//usando "super" e os parametros para chamar o construtor expecífico da classe mae Conta
//As classes filhas herdam metodos e atributos das classes maes, mas não herdam seus construtores
public class ContaCorrente extends Conta {
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		
	}
	
	@Override //sobrescrita 
	//metodo saca herdado e sobrescrito da classe mae Conta
		public boolean saca(double valor) {
		double valoraSacar = valor + 0.2;
		return super.saca(valoraSacar);
	}
	

}


public class ControleBonificacao {

	private double soma;

	public void registra(Funcionario f) {
		double bonific = f.getBonificacao();
		this.soma = this.soma + bonific;

	}
	
		
	public double getSoma() {
		return soma;
	}

}

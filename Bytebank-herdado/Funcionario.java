//não posso instanciar um "funcionário" por ser uma classe abstrata
public class Funcionario {
	
	private String nome;
	private String  cpf;
	protected double salario;//protected so deixa o atributo visivel as clases filhas
	
	
	
	public double getBonificacao() {
		return this.salario * 0.05;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}

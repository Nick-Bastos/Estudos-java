
public class EditorDeVideo extends Funcionario {
	
	
	// esse metodo abaixo é usado devido ao atributo salario ser do tipo protected.
	
	public double getBonificacao() {//reescrita, metodo da classe mãe, reescrito na classe filha.
		System.out.println("chamando metodo ev");
		return super.getBonificacao() + 100;
		
		}

}

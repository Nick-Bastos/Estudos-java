//referencia e polimorfismo
//usando polimorfismo, usando o tipo Funcionario como referencia para gerente, funcionario e editor de video
public class TesteReferencia {
	
	public static void main(String[] args) {
		
		Funcionario g1 = new Gerente();//trocando o tipo Gerente para o tipo Funcionario, depois trocado de novo.
		g1.setNome("Nick");
		g1.setSalario(5000.0);
		
		
		
		Funcionario ev = new EditorDeVideo();
		ev.setSalario(2500.0);
		
		
		ControleBonificacao controleBon = new ControleBonificacao();
		controleBon.registra(g1);
	
		controleBon.registra(ev);
		
		System.out.println(controleBon.getSoma());
		
		
		
		
		
	}

}

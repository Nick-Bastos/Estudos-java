
public class TesteConversao {
	public static void main(String[] args) {
		
		int salario = (int) 5780.50; //sem o casting (int), o java ja apontava erro na linha de codigo.
		long numeroGrande = 1121212121212333333l;
		//float pontoFlutuante = 3.14f; para float, essa forma e a forma abaixo são aceitas.
		float pontoFlutuante = (float)3.14;
		short numeroPequeno = 22222;
		byte numeroMenor = 127; //aceita ate o valor e 127.
		
		
		System.out.println(pontoFlutuante + " é um dado primitivo long");
		
	}

}

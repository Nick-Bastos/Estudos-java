public class ExercicioIR { //imposto de renda
	public static void main(String[] args) {
	double salario = 3300.0;
		
		if(salario >= 1900.0 && salario <=2800.0) {
			
			System.out.println("sua aliquota é de 7.5%, você pode deduzir R$142.");
			
		}
		if(salario >= 2800.01 && salario <=3751.0) {
			System.out.println("sua aliquota é de 15%, você pode deduzir R$350.");
			
		}
		if(salario >= 3751.01 && salario <=4664.00) {
			System.out.println("sua aliquota é de 22.5%, você pode deduzir R$636.");
			
		}
	}
}

    

   


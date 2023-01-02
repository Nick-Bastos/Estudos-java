package exercicios_Nick;

import java.util.Scanner;

public class ConversorMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o valor da temperatura em graus Celsius a ser covertida: ");
		
		double c = sc.nextDouble();
		//double c = 32;
		double f = c * 1.8 + 32; 
		double k = c + 273.15; 
		double re = c * 0.8; 
		double ra = c * 1.8 + 32 + 459.67;
				
		System.out.println("Temperatura em Fahrenheit: " + f);
		System.out.println("Temperatura em Kelvin: " + k);
		System.out.println("Temperatura em Réaumur: " + re);
		System.out.println("Temperatura em Rankine: " + ra);
		
		
		
	}

}

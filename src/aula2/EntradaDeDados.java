package aula2;

import java.util.Scanner;

public class EntradaDeDados {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);  //Cria a classe scanner e atribui a input
		
		System.out.println("Informe seu nome");
		String nome = input.nextLine();
		
		System.out.println("Informe sua idade:");
		int idade = input.nextInt();
		
		System.out.println("Informe seu peso:");
		double peso = input.nextDouble();		

		System.out.println(nome + " possui " + idade + " anos e " + peso + "kg."); // Saida de dados
	}
}

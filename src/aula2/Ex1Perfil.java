package aula2;

import java.util.Scanner;

public class Ex1Perfil {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nome, sexo, ec;
		int filhos;
		double rm;
		
		System.out.println("Nome Completo:"); 
		nome = input.nextLine();
		System.out.println("Sexo:");
		sexo  = input.nextLine();
		System.out.println("Estado Civil:");
		ec  = input.nextLine();
		System.out.println("Filhos:");
		filhos = input.nextInt();
		input.nextLine();
		
		System.out.println("Renda Mensal:");
		rm = input.nextDouble();
		
		System.out.println("Nome: " + nome);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + ec);
		System.out.println("Filhos: " + filhos);
		System.out.println("Renda Mensal: " + rm);
	}
}

package aula2;

import java.util.Scanner;

public class EntradaDadosLogradouro {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o Logradouro:");
		String logradouro = input.nextLine();
		
		System.out.println("Informe o número da residência:");
		int numero = input.nextInt();
		
		/*
		 * Next line is used to
		 * >>Clear Keyboard Buffer<<
		 * That's need because of the methods from Scanner class
		 * nextLine() will end in the next line break and nextInt() will always leave one
		 */
		input.nextLine();
		
		System.out.println("Informe o bairro:");
		String bairro = input.nextLine();
		
		System.out.println("Informe a cidade:");
		String cidade = input.nextLine();
		
		System.out.println("Logradaouro: " + logradouro);
		System.out.println("Numero: " + numero);
		System.out.println("Bairro: " + bairro);
		System.out.println("Cidade: " + cidade);
	}
}

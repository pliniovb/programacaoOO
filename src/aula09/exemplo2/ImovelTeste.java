package aula09.exemplo2;

import java.util.Scanner;

import aula09.exemplo1.Mamifero;

public class ImovelTeste {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		Imovel imovel = null;
		
		System.out.println("1 - Novo");
		System.out.println("2 - Usado");
		System.out.print("Opção: ");
		int opcao = input.nextInt();
		
		switch(opcao) {
		case 1:
			imovel = new ImovelNovo("Vicente Machado, 1234", 500000.00, 250000.00);
			break;
		case 2:
			imovel = new ImovelUsado("Vicente Machado, 456", 500000.00, 250000.00);
		}
		imovel.imprimirDados();
	}
}

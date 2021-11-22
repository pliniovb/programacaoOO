package aula09.exemplo1;

import java.util.Scanner;

public class MamiferoTeste {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Mamifero mamifero = null;
		
		System.out.println("1 - Cachorro");
		System.out.println("2 - Gato");
		System.out.println("3 - Cavalo");
		System.out.print("Opção: ");
		int opcao = input.nextInt();
		
		switch(opcao) {
			case 1:
				mamifero = new Cachorro();
				
				break;
			case 2:
				mamifero = new Gato();
				break;
			case 3:
				mamifero = new Cavalo();
				break;
		}
		mamifero.emitirSom();
	}
}

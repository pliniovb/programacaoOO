package aula04;

public class PessoaTeste {
	public static void main(String[] args) {
		
		//Agora devem receber parâmetros do método construtor
		Pessoa fulano1 = new Pessoa();
		Pessoa fulano2 = new Pessoa("Maria de Oliveira");
		Pessoa fulano3 = new Pessoa(25);
		Pessoa fulano4 = new Pessoa("Carlos Bueno", 48, 74.9);
		
		System.out.println(fulano1);
		System.out.println(fulano2);
		System.out.println(fulano3);
		System.out.println(fulano4);
	}
}
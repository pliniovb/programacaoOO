package aula03.exercicio1;

public class PessoaTeste {
	public static void main(String[] args) {
	
		Pessoa fulano1 = new Pessoa();
		Pessoa fulano2 = new Pessoa();
		Pessoa fulano3 = new Pessoa();
		
		fulano1.nome = "João";
		fulano1.idade = 25;
		fulano1.peso = 68.5;
		
		fulano2.nome = "Maria";
		fulano2.idade = 30;
		fulano2.peso = 55.6;
		
		fulano3.nome = "José";
		fulano3.idade = 32;
		fulano3.peso = 62.4;
		
		System.out.println("PESSOA 1");
		System.out.println("Nome: " + fulano1.nome);
		System.out.println("Idade: " + fulano1.idade);
		System.out.println("Peso: " + fulano1.peso);
		System.out.println();
		/*
		System.out.println("PESSOA 2");
		System.out.println("Nome: " + fulano2.nome);
		System.out.println("Idade: " + fulano2.idade);
		System.out.println("Peso: " + fulano2.peso);
		System.out.println();
		System.out.println("PESSOA 3");
		System.out.println("Nome: " + fulano3.nome);
		System.out.println("Idade: " + fulano3.idade);
		System.out.println("Peso: " + fulano3.peso);
		*/
		fulano1.andar();
		fulano2.falar();
		fulano3.correr();
		
		System.out.println(fulano1);
		
	}
}

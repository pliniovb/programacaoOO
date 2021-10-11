package aula04;

public class PessoaTeste {
	public static void main(String[] args) {
		
		//Agora devem receber parâmetros do método construtor
		Pessoa fulano1 = new Pessoa("João", 30, 76.5);
		Pessoa fulano2 = new Pessoa("Maria", 27,52.3);	
		
		System.out.println(fulano1);
		System.out.println(fulano2);
	}
}
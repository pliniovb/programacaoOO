package aula06;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa(1234, "João da Silva", 30, 65.8, 
				"Vicente Machado", 1000, "Centro", "Ponta Grossa", "PR");
		
		System.out.println(pessoa1);
		
		pessoa1.atualizarEndereco("Balduino", 2048, "CEntro", "Ponta Grossa", "Paraná");
		System.out.println(pessoa1);
	}
}

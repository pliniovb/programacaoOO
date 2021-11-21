package aula05;

public class PessoaTeste {
	
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.setNome("João");
		pessoa1.setIdade(26);
		pessoa1.setPeso(66.6);
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getPeso());
		
	}
}

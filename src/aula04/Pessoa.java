package aula04;

public class Pessoa {
	String nome;
	int idade;
	double peso;
	
	//Método construtor
	public Pessoa(String n, int i, double p) {
		nome = n;
		idade = i;
		peso = p;
		System.out.println("EXEC");
		
	}
	
	public void falar() {
		System.out.println(nome + " está falando");
	}
	
	public void dormir() {
		System.out.println(nome + " está dormindo");
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", peso=" + peso + "]";
	}
}

package aula04;

public class Pessoa {
	String nome;
	int idade;
	double peso;
	String estadoCivil;
	
	//Método construtor
	public Pessoa(String nome, int idade, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.estadoCivil = "Solteiro(a)";
		//System.out.println("EXEC");
		
	}
	public Pessoa() {
		this("João da Silva", 18, 50.0);
	}
	
	public Pessoa(String nome) {
		this(nome,18, 50.0);
	}
	
	public Pessoa(int idade) {
		this("João da Silva", idade, 50.0);
	}
	
	public void falar() {
		System.out.println(nome + " está falando");
	}
	
	public void dormir() {
		System.out.println(nome + " está dormindo");
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", estadoCivil=" + estadoCivil + "]";
	}


}

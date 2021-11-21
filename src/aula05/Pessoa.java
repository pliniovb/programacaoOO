package aula05;

public class Pessoa {
	private String nome;
	private int idade;
	private double peso;
	
	// métodos getters (obtenção de valores)
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade(){
		
		return this.idade;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	//métodos setters (atribuição de valores)
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
}

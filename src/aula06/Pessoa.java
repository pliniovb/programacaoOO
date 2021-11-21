package aula06;

public class Pessoa {


	private long cpf;
	private String nome;
	private Integer idade;
	private double peso;
	
	private Endereco endereco;
	
	public Pessoa(long cpf, String nome, Integer idade, double peso, String logradouro, 
			Integer numero, String bairro, String cidade, String unidadeFederativa) {
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.endereco = new Endereco(logradouro, numero, bairro, cidade, unidadeFederativa);
	}
	
	public void atualizarEndereco(String logradouro, 
			Integer numero, String bairro, String cidade, String unidadeFederativa) {
		this.endereco.setLogradouro(logradouro);
		this.endereco.setNumero(numero);
		this.endereco.setBairro(bairro);
		this.endereco.setCidade(cidade);
		this.endereco.setUnidadeFederativa(unidadeFederativa);
	}

	@Override
	public String toString() {
		return "Pessoa [cpf=" + cpf + ", nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", endereco="
				+ endereco + "]";
	}
	
	
	

}

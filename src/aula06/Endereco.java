package aula06;

public class Endereco {

	private String logradouro;
	private Integer numero;
	private String bairro;
	private String cidade;
	private String unidadeFederativa;
	
	public Endereco(String logradouro, Integer numero, String bairro, String cidade, String unidadeFederativa) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.unidadeFederativa = unidadeFederativa;
	}
	
	public void atualizarEndereco(String logradouro, Integer numero, String bairro, String cidade, String unidadeFederativa) {

		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.unidadeFederativa = unidadeFederativa;
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ",\n bairro=" + bairro + ", cidade=" + cidade
				+ ", unidadeFederativa=" + unidadeFederativa + "]";
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setUnidadeFederativa(String unidadeFederativa) {
		this.unidadeFederativa = unidadeFederativa;
	}
	
}

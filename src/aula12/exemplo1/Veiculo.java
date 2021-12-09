package aula12.exemplo1;

public class Veiculo {
	
	private String modelo;
	private String marca;
	private int ano;
	private String placa;
	private String cor;

	public Veiculo(String modelo, String marca, int ano, String placa, String cor) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	public int getAno() {
		return ano;
	}

	public String getPlaca() {
		return placa;
	}

	public String getCor() {
		return cor;
	}

	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor
				+ "]";
	}

}

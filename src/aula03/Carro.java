package aula03;

public class Carro {
		String modelo;
		String marca;
		int ano;
		String placa;
		String cor;
		boolean ligado = false;
		//double vel;


	public void ligar() {
		System.out.println("Ligando " + modelo);
		if (!ligado) {
			
			ligado = true;
			System.out.println(modelo + " Ligado");
		}else{
			System.out.println(modelo + " Já está ligado");
		}
	}
	
	public void desligar() {
		System.out.println("Desligando " + modelo);		
		if (ligado) {
			ligado = false;
			System.out.println(modelo + " Desligado");
		}else{
			System.out.println(modelo + " Já está desligado");
		}

	}
	
	public void acelerar() {
		System.out.println(modelo + " Acelerando");
	}
	
	public void frear() {
		System.out.println(modelo + " Freando");
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor
				+ ", ligado=" + ligado + "]";
	}
	
}
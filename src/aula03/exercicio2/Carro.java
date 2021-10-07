package aula03.exercicio2;

public class Carro {
		String modelo;
		String marca;
		int ano;
		String renavam;
		String chassi;
		String placa;
		String cor;
		boolean ligado = false;
		double vel;
		


	public void ligar() {
		System.out.println("Ligando " + modelo);
		if (!ligado) {
			
			ligado = true;
			System.out.println(modelo + " Ligado");
		}else{
			System.out.println(modelo + " >>JÁ ESTÁ LIGADO<<");
		}
	}
	
	public void desligar() {
		System.out.println("Desligando " + modelo);		
		if (ligado) {
			ligado = false;
			System.out.println(modelo + " Desligado");
		}else{
			System.out.println(modelo + " >>JÁ ESTÁ DESLIGADO<<");
		}

	}
	
	public void acelerar(double x) {
		if (ligado) {
			vel += x;
			System.out.println(modelo + " Acelerando | vel = " + vel + " km/h");
		}else{
			System.out.println(">>CARRO DESLIGADO<<");
		}
	}
	
	public void frear(double x) {
		vel -= x;
		if (vel > 0) {
			System.out.println(modelo + " Freando | vel = " + vel + " km/h");
		}else{
			System.out.println(">>CARRO PARADO<<");
			vel = 0;
		}
		
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", renavam=" + renavam + ", chassi="
				+ chassi + ", placa=" + placa + ", cor=" + cor + ", ligado=" + ligado + ", vel=" + vel + "]";
	}
	
}
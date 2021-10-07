package aula03.exercicio2;

public class CarroTeste {
	public static void main(String[] args) {
		
		Carro carro2 = new Carro();
		
		carro2.modelo = "Fusca";
		carro2.marca = "VW";
		carro2.ano = 62;
		carro2.renavam = "461014772";
		carro2.chassi = "9BWHE21JX24060831";
		carro2.placa = "GNN-9582";
		carro2.cor = "Azul";
			
		System.out.println(carro2);
		
		carro2.acelerar(40);
		carro2.ligar();
		carro2.acelerar(40);
		carro2.frear(20);
		carro2.frear(20);
		carro2.ligar();
		carro2.desligar();
		
		}
}

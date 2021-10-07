package aula03;

public class CarroTeste {
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		
		carro1.modelo = "Ford Ká";
		carro1.marca = "Ford";
		
		carro2.modelo = "Fusca";
		carro2.marca = "VW";
		
		carro3.modelo = "Onix";
		carro3.marca = "GM";
		
		System.out.println("CARRO 1");
		System.out.println("Modelo: " + carro1.modelo );
		System.out.println("Marca: " + carro1.marca);
		
		System.out.println("================================");
		
		System.out.println(carro1);
		
		carro1.ligar();
		
		System.out.println(carro1);
		
		/*
		
		carro2.ligar();
		carro2.ligar();
		carro2.desligar();
		carro2.desligar();
		
		*/
		
		}
}

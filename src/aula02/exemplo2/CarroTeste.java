package aula02.exemplo2;

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
		 
		System.out.println("CARRO 2");
		System.out.println("Modelo: " + carro2.modelo );
		System.out.println("Marca: " + carro2.marca);
		
		System.out.println("CARRO 3");
		System.out.println("Modelo: " + carro3.modelo );
		System.out.println("Marca: " + carro3.marca);
		
		}
}

package aula07;

public class VeiculoTeste {

	public static void main(String[] args) {
		Carro carro1 = new Carro("Gol", "Volks", 2020, 5, "Flex", 5);
		carro1.calibrarPneus();
		carro1.abastecer();
		
		Aviao aviao1 = new Aviao("A380", "Airbus", 2010, 300, "Combustível de Aviação", 35000);
		aviao1.voar();
		aviao1.abastecer();
		
		Veiculo veiculo1 = new Veiculo("modelo V", "Fabricante V", 2000, 10, "Combustivel V");
		veiculo1.abastecer();
	}
}

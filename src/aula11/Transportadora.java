package aula11;

public class Transportadora implements Frete{
	
	@Override
	public double calcularFrete(int distancia) {
		
		return 23.00 + (distancia * 0.50);
}
}

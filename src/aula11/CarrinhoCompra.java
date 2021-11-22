package aula11;

public class CarrinhoCompra {
	
	private double valorCompra;
	private int distancia;
	private Frete frete;
	
	public CarrinhoCompra(double valorCompra, int distancia, Frete frete) {
		
		this.valorCompra = valorCompra;
		this.distancia = distancia;
		this.frete = frete;
	}
	
	public double realizarCompra() {
		
		double valorTotalCompra = this.valorCompra + this.frete.calcularFrete(this.distancia);

		return valorTotalCompra;
	}
}

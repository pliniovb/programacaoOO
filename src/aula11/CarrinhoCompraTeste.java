package aula11;

public class CarrinhoCompraTeste {

	public static void main(String[] args) {
		CarrinhoCompra carrinhoCompra1 = new CarrinhoCompra(60.00, 100, new Correios());
		double valorTotal = carrinhoCompra1.realizarCompra();
		
		System.out.println("Valor Total: R$" + valorTotal);
	}
}

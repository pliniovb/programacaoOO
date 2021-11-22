package aula09.exemplo2;

public class ImovelUsado extends Imovel {
	
	private Double valorDesconto;
	
	public ImovelUsado(String endereco, Double valorBase, Double valorDesconto) {
		super(endereco, valorBase);
		this.valorDesconto = valorDesconto;
	}
	
	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Valor Adicional: R$"+ this.valorDesconto);
		System.out.println("Valor Total: R$" + this.calcularValorTotal());
	}
	
	private double calcularValorTotal() {
		return this.valorBase - this.valorDesconto;
	}
	
}

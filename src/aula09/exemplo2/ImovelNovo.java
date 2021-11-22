package aula09.exemplo2;

public class ImovelNovo extends Imovel {
	private Double valorAdicional;
	
	public ImovelNovo(String endereco, Double valorBase, Double valorAdicional) {
		super(endereco, valorBase);
		this.valorAdicional = valorAdicional;
	}
	
	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Valor Adicional: R$"+ this.valorAdicional);
		System.out.println("Valor Total: R$" + this.calcularValorTotal());
	}
	private double calcularValorTotal() {
		return this.valorBase + this.valorAdicional;
	}
}

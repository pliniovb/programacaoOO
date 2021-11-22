package aula09.exemplo2;

public class Imovel {
	
	protected String endereco;
	protected Double valorBase;
	
	public Imovel(String endereco, Double valorBase) {
		
		this.endereco = endereco;
		this.valorBase = valorBase;
	}
	

	public void imprimirDados() {
		
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Valor Base: R$" + this.valorBase);
	}
}

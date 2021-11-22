package aula10;

public class Comissionado extends Funcionario{
	

	private double taxaVendas;
	private double totalVendas;
	
	
	public Comissionado(String nome, int cpf, double salarioBase, double taxaVendas, double totalVendas) {
		super(nome, cpf, salarioBase);
		this.taxaVendas = taxaVendas;
		this.totalVendas = totalVendas;
	}
	
	@Override
	public void calcularSalario() {
		imprimirDados();
		double salarioTotal = this.salarioBase + (this.totalVendas * this.taxaVendas);
		System.out.println("Comissionado - Salário Total: R$:" + salarioTotal);
	}

}

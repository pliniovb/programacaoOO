package aula10;

public class Assalariado extends Funcionario{

	private double salarioAdicional;
	
	public Assalariado(String nome, int cpf, double salarioBase, double salarioAdicional) {
		super(nome, cpf, salarioBase);
		this.salarioAdicional = salarioAdicional;
	}
	
	@Override
	public void calcularSalario() {
		imprimirDados();
		double salarioTotal = this.salarioBase + this.salarioAdicional;
		System.out.println("Assalariado - Salário Total: R$" + salarioTotal);
	}
}

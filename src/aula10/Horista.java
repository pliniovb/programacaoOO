package aula10;

public class Horista extends Funcionario{


	private double precoHora;
	private int horasTrabalhadas;
	
	public Horista(String nome, int cpf, double salarioBase, double precoHora, int horasTrabalhadas) {
		super(nome, cpf, salarioBase);
		this.precoHora = precoHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	@Override
	public void calcularSalario() {
		imprimirDados();
		double salarioTotal = this.salarioBase + (this.horasTrabalhadas*this.precoHora);
		System.out.println("Horista - Sálario Total: R$:" + salarioTotal);
	}
}

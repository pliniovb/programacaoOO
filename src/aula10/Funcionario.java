package aula10;

public abstract class Funcionario {

	protected String nome;
	protected int cpf;
	protected double salarioBase;
	
	public Funcionario(String nome, int cpf, double salarioBase) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salarioBase = salarioBase;
	}

	public abstract void calcularSalario(); // método abstrato
	
	public void imprimirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Sálario Base: R$" + this.salarioBase);
	}
}

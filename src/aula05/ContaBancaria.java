package aula05;

public class ContaBancaria {
	private int numeroConta;
	private String titular;
	private double saldo;
	
	public ContaBancaria(int numeroConta, String titular) {
		this.saldo = 0.0;
		this.numeroConta = numeroConta;
		this.titular = titular;
	}
	
	public void realizarSaque(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("\nSaque efetuado com sucesso");
		}else {
			System.out.println("\nSaldo é insuficeiente");
		}
	}
	
	public void realizarDeposito(double valor) {
		this.saldo += valor;
		System.out.println("\nDepósito efetuado com sucesso.");
		calcularJuros();
		
	}
	
	public void imprimirSaldo() {
		System.out.println("\nNumero da Conta: " + this.numeroConta);
		System.out.println("\nNome do Titular: "+ this.titular);
		System.out.printf("\nSaldo: R$%.2f", this.saldo);
	}
	
	private void calcularJuros() {
		
		this.saldo *= 1.10;
		System.out.println("calc");
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		if(!titular.equals("")) {
		this.titular = titular;
		}
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
}

package aula12.exemplo2;

public class Conta {

	private int numeroConta;
	private double saldo;
	private String nomeTitular;
	
	public Conta(int numeroConta, String nomeTitular) {
		
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = 0.00;
	}
	
	public void verificarSaldo() {
		System.out.println("====== SALDO ======");
		System.out.println("Numero Conta: " + this.numeroConta);
		System.out.println("Titular: "+ this.nomeTitular);
		System.out.println("Saldo: R$" + this.saldo);
	}
	
	public void realizarSaque(double valor) {
		
		if (valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque efetuado com sucesso na conta " + this.numeroConta);
		}else{
			System.out.println("Saldo insuficiente da conta " + this.numeroConta );
		}
	}
	
	public void realizarDeposito(double valor) {
		this.saldo += valor;
		System.out.println("Deposito efetuado com sucesso na conta " + this.numeroConta);
	}
	
	public int getNumeroConta() {
		return this.numeroConta;
	}
}

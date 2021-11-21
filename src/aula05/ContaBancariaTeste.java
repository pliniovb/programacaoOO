package aula05;

public class ContaBancariaTeste {
	public static void main(String[] args) {
		
		ContaBancaria contaBancaria1 = new ContaBancaria(1234, "João da Silva");
		
		contaBancaria1.imprimirSaldo();
		contaBancaria1.realizarDeposito(100.00);
		contaBancaria1.imprimirSaldo(); 
		contaBancaria1.realizarSaque(50);
		contaBancaria1.realizarSaque(60);
		contaBancaria1.imprimirSaldo();
		contaBancaria1.realizarSaque(50);
		
	}
}

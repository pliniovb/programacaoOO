package aula12.exemplo2;

public class ContaTeste {
	
	public static void main(String[] args) {
		
		Banco banco1 = new Banco(987654, "NewBack");
		banco1.adicionarNovaConta(111, "João da Silva");
		banco1.adicionarNovaConta(222, "Maria de Oliveira");
		banco1.adicionarNovaConta(333, "José Ribeiro");
		
		banco1.verificarSaldoConta(333);
		banco1.realizarDepositoConta(333, 1000);
		banco1.verificarSaldoConta(333);
		banco1.realizarSaqueConta(333, 950);
		banco1.verificarSaldoConta(333);
		banco1.realizarSaqueConta(333, 950);
		banco1.verificarSaldoConta(333);
	}

}

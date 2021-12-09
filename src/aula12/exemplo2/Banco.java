package aula12.exemplo2;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private int cnpj;
	private String nomeBanco;
	private List<Conta> contasBancarias;
	
	public Banco(int cnpj, String nomeBanco) {
		
		this.cnpj = cnpj;
		this.nomeBanco = nomeBanco;
		this.contasBancarias = new ArrayList<Conta>();
	}
	
	public void adicionarNovaConta(int numeroConta, String nomeTitular) {

		Conta conta = new Conta(numeroConta, nomeTitular);
		this.contasBancarias.add(conta);
		System.out.println("Conta " + numeroConta + " criada com sucesso");
	}
	
	public void verificarSaldoConta(int numeroConta) {
		
		for(Conta conta : this.contasBancarias) {
			
			if (conta.getNumeroConta() == numeroConta) {
				conta.verificarSaldo();
				break;
			}
		}
	}
	
	public void realizarSaqueConta(int numeroConta, double valorSaque) {
		
		for(int i = 0; i < this.contasBancarias.size(); i++) {
			
			Conta conta = this.contasBancarias.get(i);
			
			if(conta.getNumeroConta() == numeroConta) {
				
				conta.realizarSaque(valorSaque);
				break;
			}
		}
		
	}
	
	public void realizarDepositoConta(int numeroConta, double valorDeposito) {
		
		for(Conta conta : this.contasBancarias) {
			
			if (conta.getNumeroConta() == numeroConta) {
				conta.realizarDeposito(valorDeposito);
				break;
			}
		}
	}
}

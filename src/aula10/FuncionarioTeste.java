package aula10;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Funcionario funcionario = null;
		
		//funcionario = new Assalariado("João da Silva", 123456, 5000.00, 2000.00);
		funcionario = new Comissionado("Maria de Oliveira", 987654, 5000.00, 0.10, 50000.00);
		//funcionario = new Horista("José Carvalho", 159753, 5000.00, 15.00, 160);
		funcionario.calcularSalario();
		
	}
}

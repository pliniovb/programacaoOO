package aula01;

public class saidaDados {
	public static void main(String[] args) {
		String nome = "João da Silva";
		int idade = 35;
		double peso = 75.4;
		
		System.out.println(nome + " possui " + idade + " anos e " + peso + "kg.");
		System.out.print(nome + " possui " + idade + " anos e " + peso + "kg.");
		System.out.printf("\n%s possui %d anos e %.2f kg", nome ,idade, peso);
	}
}

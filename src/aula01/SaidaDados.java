package aula01;

public class SaidaDados {
	public static void main(String[] args) {
		String nome = "João da Silva";
		int idade = 35;
		double peso = 75.4;
		
		System.out.println(nome + " possui " + idade + " anos e " + peso + "kg.");
		System.out.print(nome + " possui " + idade + " anos e " + peso + "kg.");
		System.out.printf("\n%s possui %d anos e %.2f kg", nome ,idade, peso);
		
		String resultado = (idade > 18) ? " é maior de idade" : " é menor de idade";
		System.out.println(resultado);
		
		/* ==
		 *		 if(idade >= 18) {
		 *			System.out.println(" é maior de idade");
		 *		} else {
		 *			System.out.println(" é menor de idade");
		 *		}  
		 */
		
	}
}

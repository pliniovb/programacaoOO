package aula01;

public class primeiroProjeto {
	public static void main(String[] args) {
		String produto1;
		String produto2;
		double precoProduto1;
		double precoProduto2;
		
		produto1 = "notebook";
		precoProduto1 = 3500;
		produto2 = "SSD";
		precoProduto2 = 250;
		
		
		System.out.println("Produtos:\n" + produto1 + " por apenas R$" + precoProduto1 + "\n" + produto2 + " por apenas R$" + precoProduto2);
		System.out.printf("Produtos:\n%s por apenas R$%d");	
	}
}

package aula01;

public class PrimeiroProjeto {
	public static void main(String[] args) {
		String produto1, produto2;
		double precoProduto1, precoProduto2;
		
		produto1 = "notebook";
		precoProduto1 = 3500;
		produto2 = "SSD";
		precoProduto2 = 250;
		
		
		//System.out.println("Produtos:\n" + produto1 + " por apenas R$" + precoProduto1 + "\n" + produto2 + " por apenas R$" + precoProduto2);
		System.out.printf("Produtos:\n%s por apenas R$%.2f\n%s por apenas R$%.2f", produto1, precoProduto1, produto2, precoProduto2);	
	}
}

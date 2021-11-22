package aula08;

public class JatoDeTinta extends Impressora{


	
	public JatoDeTinta() {
		super("Jato de Tinta");
	}
	
	@Override
	public void imprimir() {
		System.out.println("Imprimindo em Jato de Tinta");
	}
}

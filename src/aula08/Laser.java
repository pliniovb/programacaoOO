package aula08;

public class Laser extends Impressora{
	
	public Laser() {
		super("Laser");
	}
	
	@Override
	public void imprimir() {
		System.out.println("Imprimindo em Laser");
	}
}

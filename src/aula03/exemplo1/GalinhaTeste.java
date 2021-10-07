package aula03.exemplo1;

public class GalinhaTeste {
	public static void main(String[] args) {
		Galinha galinha1 = new Galinha();	
		Galinha galinha2= new Galinha();
		Galinha galinha3 = new Galinha();
		
		galinha1.nome = "Giselda";
		galinha2.nome = "Matilde";
		galinha3.nome = "Clotilde";
		
		System.out.println(galinha1);
		System.out.println(galinha2);
		System.out.println(galinha3);
		
		galinha1.botar();
		galinha1.botar();
		galinha1.botar();
		
		galinha2.botar();

		System.out.println(galinha1);
		System.out.println(galinha2);
		System.out.println(galinha3);

		System.out.println(Galinha.qtdTotalOvos);
		
	}
}

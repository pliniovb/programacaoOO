package aula08;

import java.util.Scanner;

public class ImpressoraTeste {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Impressora impressora = null;
		
		//impressora = new Impressora("Laser");
		
		System.out.println("1 - Jato de Tinta");
		System.out.println("2 - Laser");
		System.out.print("Opção: ");
		int opcao = input.nextInt();
		
		switch(opcao) {
			
		case 1:
			//Upcasting
			impressora = new JatoDeTinta();
			break;
		case 2:
			//Upcasting
			impressora = new Laser();
			break;
		}
		impressora.imprimir();
		System.out.println("+++++++++++");
		
		if(impressora instanceof JatoDeTinta) {
			//Downcasting
			JatoDeTinta jatoDeTinta = (JatoDeTinta) impressora;
			jatoDeTinta.imprimir();
		}else if(impressora instanceof Laser) {
			//Downcasting	
			Laser laser1 = (Laser) impressora;
			laser1.imprimir();
				
		}
			
	}
}

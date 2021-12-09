package aula14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraIU {
	
	private CalculadoraService calculadoraService;
	
	public CalculadoraIU() {
		this.calculadoraService = new CalculadoraService();
	}

	public void exibirMenuPrincipal() {
		
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("======MENU=====");
			System.out.println("1 - Dividir");
			System.out.println("2 - Potenciação");
			System.out.println("3 - Raiz Quadrada");
			System.out.println("Opção: ");
			int op = input.nextInt();
			
			switch(op) {
			
			case 1:
				this.calculadoraService.dividir();
				break;
			case 2:
				this.calculadoraService.calcularPotencia();
				break;
			case 3:
				this.calculadoraService.calcularRaizQuadrada();
				break;
			default:
				System.out.println("Opcação inválida");
			}
		}catch(ArithmeticException ae) {
			System.out.println("Divisão por 0 é impossível!");
		}catch(InputMismatchException ime) {
			System.out.println("Apenas números!");
		}catch(NumeroNaoNaturalException nnne){
			System.out.println(nnne.getMessage());
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}finally {
			input.close();
		}
	}
}

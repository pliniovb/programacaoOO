package aula13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
	

	public void somar(int x, int y) {
		
		int resultado = x+y;
		System.out.println(x + " + " + y + " = " + resultado);
		
	}
	
	public void subtrair(int x, int y) {
		
		int resultado = x-y;
		System.out.println(x + " - " + y + " = " + resultado);
		
	}
	
	public void multiplicar(int x, int y) {
		
		int resultado = x*y;
		System.out.println(x + " * " + y + " = " + resultado);
		
	}
	
	public void dividir() {
		
		 Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("x: ");
			int x = input.nextInt();
			
			System.out.println("y: ");
			int y = input.nextInt();
			
			int resultado = x/y;
			System.out.println(x + " / " + y + " = " + resultado);
		}catch(ArithmeticException ae) {
			System.out.println("Divisão por 0 é impossível!");
		}catch(InputMismatchException ime) {
			System.out.println("Apenas números!");
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}finally {
			input.close();
			//System.out.println("final");
		}

	}

}

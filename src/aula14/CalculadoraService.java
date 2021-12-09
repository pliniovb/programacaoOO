package aula14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraService {
	
	
	public void dividir() throws ArithmeticException, InputMismatchException, Exception{
		
		 Scanner input = new Scanner(System.in);
		
			System.out.println("x: ");
			int x = input.nextInt();
			
			System.out.println("y: ");
			int y = input.nextInt();
			
			int resultado = x/y;
			System.out.println(x + " / " + y + " = " + resultado);
			input.close();
		

	}
	
	public void calcularPotencia() throws InputMismatchException, Exception{
		
		Scanner input = new Scanner(System.in);


		System.out.println("x: ");
		int x = input.nextInt();
		
		System.out.println("y: ");
		int y = input.nextInt();
			double resultado =  Math.pow(x, y);
			
			System.out.println(x + " ^ " + y + " = " + resultado);

	}
	
	public void calcularRaizQuadrada() throws NumeroNaoNaturalException, InputMismatchException, Exception{
		
		Scanner input = new Scanner(System.in);
		System.out.println("x:");
		int x = input.nextInt();
		
		if (x < 0) {
			throw new NumeroNaoNaturalException();
		}
		
		double resultado = Math.sqrt(x);
		System.out.println("Raiz Quadrada de " + x + " = " + resultado);

			input.close();
		

	}
}

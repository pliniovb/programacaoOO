package aula01;

public class Aula1ex2Desconto {
	public static void main(String[] args) {
		double total = 40;
		double result = (total >= 50) ? total = total*0.9:total*0.95;
		System.out.println("Com desconto: " + result);
	}
}

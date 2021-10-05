package aula01;

public class Aula1ex1Bhaskara {
	public static void main(String[] args) {
		double a, b ,c, x1,x2, delta;
		a = 3;
		b = -15;
		c = 12;
		delta = b*b - (4*a*c);
		System.out.println("delta = " + delta);
		double y = Math.sqrt(delta);
		x1 = (-b + y)/(2*a);
		x2 = (-b - y)/(2*a);
		System.out.println("x' = " + x1);
		System.out.println("x'' = " + x2);
	}
}

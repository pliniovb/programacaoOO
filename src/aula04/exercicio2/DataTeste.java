package aula04.exercicio2;

public class DataTeste {
	public static void main(String[] args) {
		Data data1 = new Data(3, 3, 1995);
		Data data2 = new Data(3, 1995);
		Data data3 = new Data(3);
		Data data4 = new Data();
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
	}
}

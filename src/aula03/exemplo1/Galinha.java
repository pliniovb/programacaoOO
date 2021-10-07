package aula03.exemplo1;

public class Galinha {
	String nome;
	int qtdOvos;
	static int qtdTotalOvos = 0;
	
	public void botar() {
		qtdOvos++;
		qtdTotalOvos++;
	}

	@Override
	public String toString() {
		return "Galinha [nome=" + nome + ", qtdOvos=" + qtdOvos + "]";
	}
}

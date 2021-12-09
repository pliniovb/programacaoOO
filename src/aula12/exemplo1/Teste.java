package aula12.exemplo1;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Joaquim Rodrigues", 35, 75.3);
		Veiculo veiculo1 = new Veiculo("Cruze", "Chevrolet", 2021, "ABC-1234", "preto");
		
		List<String> listaGenerica = new ArrayList<String>();
		
		listaGenerica.add("João da Silva");
		listaGenerica.add("Maria de Oliveira");
		listaGenerica.add("Pedro Carvalho");
		listaGenerica.add("José Souza");
		
//		listaGenerica.add(10);
//		listaGenerica.add(25.89);
//		listaGenerica.add(true);
//		listaGenerica.add(pessoa1);
//		listaGenerica.add(veiculo1);
		
		//foreach
		for(String nome : listaGenerica) {
			
			System.out.println(nome);
		}
		
		System.out.println("===================================");		
		
		//for
		for (int i = 0; i < listaGenerica.size(); i++) {
			
			String nome = listaGenerica.get(i);
			System.out.println(nome);
		}
		
	}

}

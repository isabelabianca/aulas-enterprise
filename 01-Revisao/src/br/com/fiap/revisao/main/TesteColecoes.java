package br.com.fiap.revisao.main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.com.fiap.revisao.model.Carro;

public class TesteColecoes {
	
	public static void main(String[] args) {
		
		//Criar uma lista de Carro
		List<Carro> lista = new ArrayList<Carro>();
		
		//Adicionar dois carros na lista
		Carro uno = new Carro("FIAT", 2000, 10000);
		lista.add(uno);
		
		//Criar o objeto e adiciona na lista
		lista.add(new Carro("Renault", 2008, 3000));
		
		//Exibir os carros da lista
		System.out.println("FOR");
		for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i)); //recupera um elemento da lista pela posição
		}
		
		System.out.println("FOREACH");
		for (Carro carro : lista) {
			System.out.println(carro);
		}
		
		//Criar um conjunto de carro
		Set<Carro> set = new HashSet<Carro>();
		
		//Adicionar 3 carros no conjunto, sendo 1 repetido
		set.add(uno);
		set.add(new Carro("Ford", 2001, 1000));
		set.add(uno);
		
		//Exibir os carros do conjunto
		System.out.println("\n************\nSET");
		for (Carro carro : set) {
			System.out.println(carro);
		}
		
		//Criar um mapa com a chave do tipo int e o valor do tipo Carro
		Map<Integer,Carro> map = new HashMap<Integer, Carro>();
			
		//Adicionar 2 carros no mapeamento
		map.put(123, uno);
		map.put(124, new Carro("Chevrolet", 2015, 15000));
		
		//Recuperar o carro informando a chave
		System.out.println("\n******\nRecuperando um valor do mapa pela chave");
		System.out.println(map.get(124));
		
		//Recuperar todas as chaves mapeadas
		Set<Integer> chaves = map.keySet();
		
		//Exibir a chave e o valor
		for (Integer chave : chaves) {
			System.out.println("\nID "+ chave + map.get(chave));
		}
		
	}//main
}//class

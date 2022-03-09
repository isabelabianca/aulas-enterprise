package br.com.fiap.revisao.main;

import br.com.fiap.revisao.model.Carro;
import br.com.fiap.revisao.model.Van;

public class Teste {
	
	//Criar o método main
	public static void main(String[] args) {
		
		// Instanciar um Carro
		Carro carro = new Carro("Renault","Logan", 2008, 89000, true);
		
//		//Setar as informações no objeto do tipo Carro
//		carro.setMarca("Renault");
//		carro.setModelo("Logan");
//		carro.setAno(2008);
//		carro.setArCondicionado(true);
//		carro.setKm(80000);
		
		//Chamar os métodos e exibir o resultado
		carro.darPartida();
		System.out.println(carro.validarZeroKm()?"Novo":"Usado");
		System.out.println(carro); //Exibindo os dados do objeto
	
		//Instanciar uma Van
		Van van = new Van("Van", "Modelo", 2022, 87, true, false);
		
		
		//Chamar os métodos e exibir o resultado
		van.darPartida();
		System.out.println(van.validarZeroKm()?"Novo":"Usado");
		System.out.println(van);
		
		Carro carro2 = new Van ("Fiat", 2010, 40000);
		carro2.darPartida(); // Executa a implementação da classe Van!
		System.out.println(carro2);
	}
}

package br.com.fiap.jpa.main;

import javax.persistence.EntityManagerFactory;

import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class Exemplo {

	public static void main(String[] args) {
		// Obter uma f�brica
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		
		fabrica.close();
	}

}

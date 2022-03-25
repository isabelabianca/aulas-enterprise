package br.com.fiap.jpa.main;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.jpa.dao.impl.MusicaDaoImpl;
import br.com.fiap.jpa.entity.GeneroMusica;
import br.com.fiap.jpa.entity.Musica;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.IdNotFoundException;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class Exemplo {

	public static void main(String[] args) {
		//Obter uma fabrica
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		
		//Obter um entity manager
		EntityManager em = fabrica.createEntityManager();
		
		//Instanciar uma m�sica
		Musica musica = new Musica("Forever", GeneroMusica.POP, 
									new GregorianCalendar(2008,Calendar.OCTOBER, 27), 
									"4:58", "Chris Brown", 600);
		
		//Instanciar uma MusicaDaoImpl
		MusicaDaoImpl dao = new MusicaDaoImpl(em);
		
		//Cadastrar
		try {
			dao.cadastrar(musica);
			dao.commit();
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		}
		
		//Pesquisar pela PK
		try {
			Musica busca = dao.pesquisar(1);
			//Exibir o nome da m�sica
			System.out.println(busca.getNome());
		} catch (IdNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		//Atualizar a m�sica
		try {
			musica.setNome("Kiss Kiss");
			dao.atualizar(musica);
			dao.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Remover
		try {
			dao.remover(1);
			dao.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		//Fechar
		em.close();
		fabrica.close();
	}
}
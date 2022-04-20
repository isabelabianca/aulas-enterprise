package br.com.fiap.jpa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Pessoa2;

public class Programa {
	
	public static void main(String[] args) {
		
		Pessoa2 pessoa1 = new Pessoa2(null, "Amélia Dias", "ameliadias@gmail.com");
		Pessoa2 pessoa2 = new Pessoa2(null, "Barbara Macedo", "barbarasm@gmail.com");
		Pessoa2 pessoa3 = new Pessoa2(null, "Isis Correa", "isiscmac@gmail.com");
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
//		System.out.println(pessoa1);
//		System.out.println(pessoa2);
//		System.out.println(pessoa3);
		
		Pessoa2 p = em.find(Pessoa2.class, 2);
		System.out.println(p);
		
		em.getTransaction().begin();
//		em.persist(pessoa1);
//		em.persist(pessoa2);
//		em.persist(pessoa3);
		em.getTransaction().commit();
		
		Pessoa2 p2 = em.find(Pessoa2.class, 2); // não excluiu ainda: falta uma transação...		
		
		em.getTransaction().begin();
		em.remove(p2);
		em.getTransaction().commit();

		System.out.println("Pronto!");
		em.close();
		emf.close();
	}
}

package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.GenericDao;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.IdNotFoundException;

public class GenericDaoImpl<T,K> implements GenericDao<T, K>{
	
	private EntityManager em;
	
	public GenericDaoImpl(EntityManager em) {
		super();
		this.em = em;
	}

	public T pesquisar(K id) throws IdNotFoundException {
		T entidade = em.find(T.class, id);
		if(entidade == null)
			throw new IdNotFoundException();
		return entidade;
	}

	public void cadastrar(T entidade) {
		em.persist(entidade);
	}

	public void atualizar(T entidade) {
		em.merge(entidade);
	}

	public void remover(K id) throws IdNotFoundException {
		T entidade = pesquisar(id);
		em.remove(id);
	}

	public void commit() throws CommitException {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new CommitException();
		}
	}
	

}

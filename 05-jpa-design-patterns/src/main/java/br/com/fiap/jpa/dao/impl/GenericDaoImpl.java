package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;
import java.lang.reflect.*;

import br.com.fiap.jpa.dao.GenericDao;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.IdNotFoundException;

public class GenericDaoImpl<T,K> implements GenericDao<T, K>{
	
	private EntityManager em;
	
	private Class<T> clazz;
	
	public GenericDaoImpl(EntityManager em) {
		this.em = em;
		clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public T pesquisar(K id) throws IdNotFoundException {
		T entidade = em.find(clazz, id);
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

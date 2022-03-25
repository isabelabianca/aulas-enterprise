package br.com.fiap.jpa.dao;

import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.IdNotFoundException;

// T -> tipo da entidade
// K -> tipo da chave primária
public interface GenericDao<T, K> {
	
	T pesquisar(K id) throws IdNotFoundException;
	
	void cadastrar(T entidade);
	
	void atualizar(T entidade);
	
	void remover(K id) throws IdNotFoundException;
	
	void commit() throws CommitException;

}

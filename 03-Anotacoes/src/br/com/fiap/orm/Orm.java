package br.com.fiap.orm;

import br.com.fiap.anotacao.Tabela;

public class Orm {
	
	public String pesquisar(Object obj) {
		//Recuperar a anotação @Tabela
		Tabela anotacao =obj.getClass().getAnnotation(Tabela.class);
		//Recuperar o parâmetro nome da anotação
		String nome = anotacao.nome();
		//Retornar o SQL
		return "SELECT * FROM " + nome;
	}
}

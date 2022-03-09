package br.com.fiap.orm;

import br.com.fiap.anotacao.Tabela;

public class Orm {
	
	public String pesquisar(Object obj) {
		//Recuperar a anota��o @Tabela
		Tabela anotacao =obj.getClass().getAnnotation(Tabela.class);
		//Recuperar o par�metro nome da anota��o
		String nome = anotacao.nome();
		//Retornar o SQL
		return "SELECT * FROM " + nome;
	}
}

package br.com.fiap.main;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.model.Cachorro;

public class Exemplo {
	public static void main(String[] args) {
		// Instanciar um cachorro
		Cachorro dog = new Cachorro();
		
		//Exibir o nome da classe
		System.out.println(dog.getClass().getName());
	
		//Recuperar os atributos do objeto
		Field[] atributos = dog.getClass().getDeclaredFields();
		
		System.out.println("ATRIBUTOS");
		//Exibir o nome e tipo dos atributos
		for (Field field : atributos) {
			System.out.println(field.getName() + " - " + field.getType());
			//Recuperar a anotação @Coluna
			Coluna anotacao = field.getAnnotation(Coluna.class);
			System.out.println("Nome: " + anotacao.nome());
			System.out.println("Chave? " + anotacao.chave());
			System.out.println("Tamanho: " + anotacao.tamanho());
			System.out.println("Obrigatório? " + anotacao.obrigatorio() + "\n");
		}
		
		//Recuperar os métodos do objeto
		Method[] metodos = dog.getClass().getDeclaredMethods();
		
		System.out.println("Métodos");
		//Exibir o nome dos métodos
		for (Method method : metodos) {
			System.out.println(method.getName());
		}
	}
}

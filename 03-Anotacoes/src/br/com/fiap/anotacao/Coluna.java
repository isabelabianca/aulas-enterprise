package br.com.fiap.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Código Java (.java) --Compilar--> Bytecode (.class) --Interpretar JVM--> Executar
//Retention -> determina até quando a anotação estará presente (código, compilado, execução)
@Retention(RetentionPolicy.RUNTIME) //Execução

// Target -> indica o escopo da anotação (métodos, atributos, classe... etc)
@Target({ElementType.FIELD, ElementType.METHOD}) // Atributos e métodos
public @interface Coluna {
	
	String nome();
	boolean chave() default false;  // Valor padrão, o parâmetro é opcional
	
	//Parâmetro para determinar a qtd de caracteres do varchar
	int tamanho() default 0;
	// Parâmetro para identificar se o campo é obrigatório
	boolean obrigatorio() default false;
}

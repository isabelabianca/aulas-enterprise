package br.com.fiap.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// C�digo Java (.java) --Compilar--> Bytecode (.class) --Interpretar JVM--> Executar
//Retention -> determina at� quando a anota��o estar� presente (c�digo, compilado, execu��o)
@Retention(RetentionPolicy.RUNTIME) //Execu��o

// Target -> indica o escopo da anota��o (m�todos, atributos, classe... etc)
@Target({ElementType.FIELD, ElementType.METHOD}) // Atributos e m�todos
public @interface Coluna {
	
	String nome();
	boolean chave() default false;  // Valor padr�o, o par�metro � opcional
	
	//Par�metro para determinar a qtd de caracteres do varchar
	int tamanho() default 0;
	// Par�metro para identificar se o campo � obrigat�rio
	boolean obrigatorio() default false;
}

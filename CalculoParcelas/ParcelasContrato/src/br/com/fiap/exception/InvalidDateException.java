package br.com.fiap.exception;

public class InvalidDateException extends Exception {
	public InvalidDateException() {
		super("Formato de data inválido");
	}
}

package br.com.fiap.jpa.main;

import br.com.fiap.jpa.entity.Pessoa;

public class Programa {
	
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa(1, "Amélia Dias", "ameliadias@gmail.com");
		Pessoa pessoa2 = new Pessoa(2, "Barbara Macedo", "barbarasm@gmail.com");
		Pessoa pessoa3 = new Pessoa(3, "Isis Correa", "isiscmac@gmail.com");
		
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		System.out.println(pessoa3);
		
	}
}

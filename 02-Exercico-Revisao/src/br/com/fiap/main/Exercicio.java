package br.com.fiap.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.ContaPoupanca;
import br.com.fiap.bean.TipoConta;
import br.com.fiap.exception.SaldoInsuficienteException;

public class Exercicio {

	public static void main(String[] args) {
		// Instanciar uma conta corrente
		ContaCorrente cc = new ContaCorrente(123,1, new GregorianCalendar(1999, Calendar.OCTOBER, 16), 100, TipoConta.COMUM);
		
		// Instanciar uma conta poupança
		ContaPoupanca cp = new ContaPoupanca(231,1,Calendar.getInstance(), 100,5);
		
		// Chamar o método depositar da CC
		cc.depositar(150);
		
		// Exibir saldo
		System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
		
		// Chamar o método depositar da Cp
		cp.depositar(200);
	
		// Exibir saldo
		System.out.println("Saldo da Conta Poupança: " + cp.getSaldo());
		
		try {
			// Chamar o método retirar da CC
			cc.retirar(250);
		
			// Exibir saldo
			System.out.println("Novo Saldo Conta Corrente: " + cc.getSaldo());
		
		} catch(SaldoInsuficienteException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			// Chamar o método retirar da Cp
			cp.retirar(1000);
		
			// Exibir saldo
			System.out.println("Novo Saldo Conta Poupança: " + cp.getSaldo());
	
		} catch(SaldoInsuficienteException e) {
			System.err.println(e.getMessage());
		}
		
		//Criar uma lista de conta corrente
		List<ContaCorrente> lista = new ArrayList<>();
		
		//Add 3 contas
		lista.add(cc);
		lista.add(new ContaCorrente(456,2, new GregorianCalendar(2020, Calendar.APRIL, 5), 190, TipoConta.ESPECIAL));
		lista.add(new ContaCorrente(789,2, new GregorianCalendar(2010, Calendar.DECEMBER, 19), 87, TipoConta.COMUM));
		
		//Exibir o saldo das contas
		System.out.println("Saldos: ");
		for (ContaCorrente contaCorrente : lista) {
			System.out.println(contaCorrente.getSaldo());
		}
	}

}

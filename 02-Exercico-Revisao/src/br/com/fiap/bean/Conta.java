package br.com.fiap.bean;

import java.util.Calendar;

import br.com.fiap.exception.SaldoInsuficienteException;

// Classe Abstrata
// N?o pode ser instanciada
// Pode ter m?todos abstratos (sem implementa??o)
public abstract class Conta {
	
	//Atributos
	private int numero;
	private int agencia;
	private Calendar dataAbertura;
	protected double saldo;
	
	//Construtores
	public Conta() {}
	
	public Conta(int numero, int agencia, Calendar dataAbertura, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.dataAbertura = dataAbertura;
		this.saldo = saldo;
	}
	
	//M?todos
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public abstract void retirar(double valor) throws SaldoInsuficienteException;
	
	//Getters e Setters
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public Calendar getDataAbertura() {
		return dataAbertura;
	}
	
	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}

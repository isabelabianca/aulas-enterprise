package br.com.fiap.bean;

import java.util.Calendar;

import br.com.fiap.exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta {
	
	//Atributos
	private TipoConta tipo;
	
	//Construtores	
	public ContaCorrente() {}
	
	public ContaCorrente(int numero, int agencia, Calendar dataAbertura, double saldo, TipoConta tipo) {
		super(numero, agencia, dataAbertura, saldo);
		this.tipo = tipo;
	}

	//M�todos
	@Override  // Garante a sobrescrita
	public void retirar(double valor) throws SaldoInsuficienteException {
		if (tipo == TipoConta.COMUM && saldo < valor) {
			// exce��o
			// exception ->checked, validadas em tempo de compila��o, obriga o tratamento da exce��o
			// runtimeException -> unchecked, exception em tempo de execu��o, n�o obriga... mas p�ra a aplica��o
			throw new SaldoInsuficienteException(saldo);
		}
		saldo -= valor;
	}
	
	//Getters e Setters
	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}

}

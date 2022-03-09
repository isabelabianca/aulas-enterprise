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

	//Métodos
	@Override  // Garante a sobrescrita
	public void retirar(double valor) throws SaldoInsuficienteException {
		if (tipo == TipoConta.COMUM && saldo < valor) {
			// exceção
			// exception ->checked, validadas em tempo de compilação, obriga o tratamento da exceção
			// runtimeException -> unchecked, exception em tempo de execução, não obriga... mas pára a aplicação
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

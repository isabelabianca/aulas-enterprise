package br.com.fiap.bean;

import java.util.Calendar;

import br.com.fiap.exception.SaldoInsuficienteException;

public class ContaPoupanca extends Conta implements ContaInvestimento {
	
	//Atributos
	private float taxa;
	
	//Constante
	// final: atributo -> não permite modificar o valor
	// método -> não permite a sobrescrita
	// classe -> não permite a herança
	// static -> define o elemento como da classe e não do objeto
	private static final float RENDIMENTO = 0.05f;
	
	//Métodos
	@Override
	public double calculaRetornoInvestimento() {
		return saldo * RENDIMENTO;
	}

	@Override
	public void retirar(double valor) throws SaldoInsuficienteException {
		if (saldo < valor) {
			throw new SaldoInsuficienteException(saldo);
		}
		saldo-=valor+taxa;
	}

	public ContaPoupanca(int numero, int agencia, Calendar dataAbertura, double saldo, float taxa) {
		super(numero, agencia, dataAbertura, saldo);
		this.taxa = taxa;
	}

	public ContaPoupanca() {}
	
	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}

}

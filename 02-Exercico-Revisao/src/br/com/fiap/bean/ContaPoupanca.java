package br.com.fiap.bean;

import java.util.Calendar;

import br.com.fiap.exception.SaldoInsuficienteException;

public class ContaPoupanca extends Conta implements ContaInvestimento {
	
	//Atributos
	private float taxa;
	
	//Constante
	// final: atributo -> n�o permite modificar o valor
	// m�todo -> n�o permite a sobrescrita
	// classe -> n�o permite a heran�a
	// static -> define o elemento como da classe e n�o do objeto
	private static final float RENDIMENTO = 0.05f;
	
	//M�todos
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

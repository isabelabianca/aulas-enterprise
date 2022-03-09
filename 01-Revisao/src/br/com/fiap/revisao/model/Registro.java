package br.com.fiap.revisao.model;

public class Registro {

	private long numero;
	private int anoVencimento;
	
	
	public long getRegistro() {
		return numero;
	}
	public void setRegistro(long registro) {
		this.numero = registro;
	}
	public int getAnoVencimento() {
		return anoVencimento;
	}
	public void setAnoVencimento(int anoVencimento) {
		this.anoVencimento = anoVencimento;
	}
	
}

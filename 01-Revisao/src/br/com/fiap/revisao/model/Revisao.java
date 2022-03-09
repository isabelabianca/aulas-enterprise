package br.com.fiap.revisao.model;

import java.time.LocalDate;

public class Revisao {
	
	private LocalDate data;
	
	private double valor;
	
	private double km;
	
	//Construtor
	//CTRL + 3 -> gcuf
	public Revisao(LocalDate data, double valor, double km) {
		super();
		this.data = data;
		this.valor = valor;
		this.km = km;
	}

	//Getters e Setters
	//CTRL + 3 -> ggas
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}
	
}

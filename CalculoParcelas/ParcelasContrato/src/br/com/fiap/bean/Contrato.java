package br.com.fiap.bean;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

import br.com.fiap.exception.InvalidDateException;

public class Contrato {
	private int numero;
	private String data;
	private double valor;
	private int parcelas;
	
	public Contrato() {}

	public Contrato(int numero, String data, double valor, int parcelas) {
		super();
		this.numero = numero;
		this.data = data;
		this.valor = valor;
		this.parcelas = parcelas;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getParcelas() {
		return parcelas;
	}

	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}
	
	public ArrayList<String> calcularData() {
		
		LocalDate data1 = null;
		DateTimeFormatter form = null;
		
		try {
	         form = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	         data1 = LocalDate.parse(getData(), form);
	      } catch (DateTimeParseException e) {
	    	System.out.println("Formato de data inválido, digite novamente: ");
	        return null;
	     }   
						
		ArrayList<String> datas = new ArrayList<String>();
		
		LocalDate proximaData = data1;
		
		for (int i=0; i<parcelas; i++) {
			proximaData = proximaData.plusMonths(1);
			String dataFormatada = proximaData.format(form);
			datas.add(dataFormatada);
		}
		
		return datas;
	}
	
	public ArrayList<Double> calcularParcelamento() {
		double vJuros = 0;
		double vParcela = valor/parcelas;
		double vFinal = 0;
		
		ArrayList<Double> valores = new ArrayList<Double>();
		
		for (int i=0, j=1; i<parcelas; i++, j++) {
			vJuros = vParcela + (vParcela * 0.01) * j;
			vFinal = vJuros + (vJuros * 0.02);
			valores.add(vFinal);
		}
		return valores;
	}
	
}

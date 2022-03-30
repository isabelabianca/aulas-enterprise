package br.com.fiap.pagamento;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Pagamento {
	
	private int numero;
	private String data;
	private double valorContrato;
	private int parcelas;
	
	public Pagamento(int numeroContrato, String dataContrato, double valorContrato, int qtMeses) {
		super();
		this.numero = numeroContrato;
		this.data = dataContrato;
		this.valorContrato = valorContrato;
		this.parcelas = qtMeses;
	}

	public Pagamento() {
	}

	public int getNumeroContrato() {
		return numero;
	}

	public void setNumeroContrato(int numeroContrato) {
		this.numero = numeroContrato;
	}

	public String getDataContrato() {
		return data;
	}

	public void setDataContrato(String dataContrato) {
		this.data = dataContrato;
	}

	public double getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(double valorContrato) {
		this.valorContrato = valorContrato;
	}

	public int getQtMeses() {
		return parcelas;
	}

	public void setQtMeses(int qtMeses) {
		this.parcelas = qtMeses;
	}
	
	public Date converterData (String data) {
		
		SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy");
		Date dataFormatada = null;
		try {
			dataFormatada = form.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return dataFormatada;
	}
	
	public ArrayList<Double> calcularValor(int qtMeses, double valorContrato) {
		double valorJuros = 0;
		double valorParcela = valorContrato/qtMeses;
		double valorFinal = 0;
		ArrayList<Double> valores = new ArrayList();
		
		for (int i=0, j=1; i<qtMeses; i++, j++) {
			valorJuros = valorParcela + (valorParcela * 0.01) * j;
			valorFinal = valorJuros + (valorJuros * 0.02);
			valores.add(valorFinal);
		}
		
		return valores;
	}
}

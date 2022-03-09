package br.com.fiap.revisao.model;

import java.util.List;

public class Carro {
//	Modificadores de acesso:
//	private -> somente a classe
//	public -> todos
//	default/package (nada na frente) -> classe e classes do mesmo pacote	
//	protected -> a classe, classes do mesmo pacote e classes filhas
	
	// Atributos
	// Valores padr�es: Refer�ncia -> null; n�meros -> 0; booelan -> false;
	private String marca;
	private String modelo;
	private int ano;
	private double km;
	private boolean arCondicionado;
	
	private Combustivel combustivel;

//	Contrutor -> m�todo especial utilizado na instancia��o da classe
//	1 - Tem o mesmo nome da Classe
//	2 - N�o tem retorno, nem void
	
	public Combustivel getCombustivel() {
		return combustivel;
	}
	
	private List<Revisao> revisoes;
	
	
	public List<Revisao> getRevisoes() {
		return revisoes;
	}

	public void setRevisoes(List<Revisao> revisoes) {
		this.revisoes = revisoes;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}

	public Carro(String marca, int ano, double km) {
		this.marca = marca;
		this.ano = ano;
		this.km = km;
	}
	
	//Criar um construtor com todos os atributos
	

	public Carro(String marca, String modelo, int ano, double km, boolean arCondicionado) {
		this(marca, ano, km);
		this.km = km;
		this.arCondicionado = arCondicionado;
	}
	

	//Sobrecarga (Overload) -> m�todo com o mesmo nome mas com par�metros diferentes
	
//	public void darPartida(String chave) {
//		System.out.println("Carro ligando com a chave... " + chave);
//	}
	
	//M�todos
	
	//Sobrescrever o m�todo toString() -> para exibir os dados do carro
	public String toString() {
		return "\nMarca: " + marca + "\nAno: " + ano + "\nKm: " + km + "\nModelo: " + modelo + (arCondicionado?"\nCom Ar":"\nSem Ar"); // ...
	}
	
	public void darPartida() {
		System.out.println("Carro ligando...");
	}
	
	public boolean validarZeroKm() {
		//Validar se o carro � zero (menos de 100 Km)
//		if (km <= 100) {
//			return true;
//		} else {
//			return false;
//		}
		//Operador tern�rio -> condi��o ? se verdadeiro : se falso
		//return km <= 100 ? true : false;
		return km <= 100;
	}
	
	//Getters e Setters
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getAno() {
		return ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public boolean isArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	
}

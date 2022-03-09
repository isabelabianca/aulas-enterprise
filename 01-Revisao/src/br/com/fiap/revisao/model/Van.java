package br.com.fiap.revisao.model;

//Herança
//Object <- Carro <- Van
//É herança? É um?
//É um atributo? Tem um?

public class Van extends Carro {
	
	// Atributos
	private boolean mercadoria;
	
	private Registro registro;
	
	//Construtores não são herdados
	//O construtor da classe filha precisa chamar um construtor do pai
	public Van(String marca, int ano, double km) {
		super(marca, ano, km); // Chama o construtor do pai
	}
	
	// Criar o construtor com todos os atributos
	public Van (String marca, String modelo, int ano, double km, boolean arCondicionado, boolean mercadoria) {
		super(marca, modelo, ano, km, arCondicionado);
		this.mercadoria = mercadoria;
	}
	
	//Métodos
	//Sobrescrita (Override) -> mesmo método do pai na classe filha
	public void darPartida() {
		System.out.println("Van dando partida...");
	}
	
	public String toString() {
		return super.toString() + (mercadoria?"\nMercadoria":"\nPassageiro");
		}
	
	//Getters e Setters
	public boolean isMercadoria() {
		return mercadoria;
	}

	public void setMercadoria(boolean mercadoria) {
		this.mercadoria = mercadoria;
	}

	public Registro getRegistro() {
		return registro;
	}

	public void setRegistro(Registro registro) {
		this.registro = registro;
	}
}

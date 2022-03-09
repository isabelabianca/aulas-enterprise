package br.fiap.com.revisao.dao;

import java.util.List;

import br.com.fiap.revisao.model.Carro;

public class CarroOracleDao implements CarroDao{

	@Override
	public void cadastrar(Carro carro) {
		System.out.println("Cadastrando no Oracle...");
	}

	@Override
	public List<Carro> lista() {
		System.out.println("Listando no Oracle...");
		return null;
	}

}

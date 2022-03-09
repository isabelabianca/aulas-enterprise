package br.com.fiap.revisao.main;

import br.com.fiap.revisao.model.Carro;
import br.fiap.com.revisao.dao.CarroDao;
import br.fiap.com.revisao.dao.CarroOracleDao;

public class TesteInterface {
	
	public static void main(String[] args) {
		//Criar uma variável do tipo CarroDao e instanciar a classe
		CarroDao dao = new CarroOracleDao();
		
		//Chamar o método cadastrar
		dao.cadastrar(new Carro("Jeep", 2019,99));
		
		//Chamar o método listar
		dao.lista();
		
	}
}

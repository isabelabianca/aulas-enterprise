package br.fiap.com.revisao.dao;

import java.util.List;
import br.com.fiap.revisao.model.Carro;

//Interface -> define as regras que as classes devem implementar (Contrato)
//Define os m�todos que as classes devem implementar
// Objetico � diminuir o acoplamento (depend�ncia) entre os objetos

public interface CarroDao {
	void cadastrar(Carro carro);
	
	List<Carro> lista();
}

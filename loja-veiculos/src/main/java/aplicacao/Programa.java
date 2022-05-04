package aplicacao;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.TipoCombustivel;
import dominio.Veiculo;
import dominio.VeiculoId;

public class Programa {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("loja-veiculos");
		EntityManager em = emf.createEntityManager();

		///*
		em.getTransaction().begin(); // há a necessidade de se fazer uma transação ao inserir algo no bd

		Veiculo veiculo = new Veiculo();
		
/*		veiculo.setCodigo(new VeiculoId("ABC-1234", "Uberlândia"));
		veiculo.setFabricante("Honda");
		veiculo.setModelo("Civic");
		veiculo.setAnoFabricacao(2020);
		veiculo.setAnoModelo(2020);
		veiculo.setValor(new BigDecimal(90500));
		
		em.persist(veiculo1);
	*/	
		/*
		veiculo.setFabricante("Ford");
		veiculo.setModelo("Focus");
		veiculo.setAnoFabricacao(2019);
		veiculo.setAnoModelo(2019);
		veiculo.setValor(new BigDecimal(55200));
		veiculo.setTipoCombustivel(TipoCombustivel.BIOCOMBUSTIVEL);
		*/
		
		
		
//		em.persist(veiculo);
		
		em.getTransaction().commit();
		//*/

		System.out.println("pronto!");
		em.close(); // fechando...
		emf.close();

	}

}

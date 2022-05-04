package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Veiculo;
import dominio.VeiculoId;

public class BuscandoVeiculoPelaPlaca {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("loja-veiculos");
		EntityManager em = emf.createEntityManager();
		
		VeiculoId codigo = new VeiculoId("ABC-1234", "Uberlândia");
		Veiculo veiculo = em.find(Veiculo.class, codigo);
//		System.out.println("Placa: " + veiculo.getCodigo().getPlaca());
//		System.out.println("Cidade: " + veiculo.getCodigo().getCidade());
		System.out.println("Fabricante: " + veiculo.getFabricante());
		System.out.println("Modelo: " + veiculo.getModelo());
		
		System.out.println("Pronto!");
		em.close();
		emf.close();
	}

}

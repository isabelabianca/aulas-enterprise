import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.fiap.pagamento.Pagamento;

public class Teste {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Pagamento pagamento = new Pagamento();
		
//		System.out.println("Digite os dados do contrato");
//		System.out.println("N�mero: ");
//		pagamento.setNumeroContrato(input.nextInt());
		System.out.println("Data (dd/MM/yyyy): ");
		pagamento.setDataContrato(input.nextLine());
//		System.out.println("Valor do contrato: ");
//		pagamento.setValorContrato(input.nextDouble());
//		System.out.println("N�mero de parcelas: ");
//		pagamento.setQtMeses(input.nextInt());
		
		ArrayList<Double> valorFinal = pagamento.calcularValor(pagamento.getQtMeses(), pagamento.getValorContrato());
		
		int n = valorFinal.size();
		for (int i=0; i<n; i++) {
			System.out.println("Data " + i + ": " + valorFinal.get(i));
		}
		
//		SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy");
//		
//		System.out.println(form.format(pagamento.converterData(pagamento.getDataContrato())));
	}

}

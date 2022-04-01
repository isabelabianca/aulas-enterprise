package br.com.fiap.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.fiap.bean.Contrato;

public class Teste {

	public static void main(String[] args) {
		
		Contrato contrato = new Contrato();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite os dados do contrato ");
		System.out.println("Número: ");
		contrato.setNumero(input.nextInt());
		
		System.out.println("Data (dd/MM/yyyy): ");
		contrato.setData(input.next());
		
		System.out.println("Valor do contrato: ");
		contrato.setValor(input.nextDouble());
		
		System.out.println("Número de parcelas: ");
		contrato.setParcelas(input.nextInt());
		
		ArrayList<String> data = contrato.calcularData();
		ArrayList<Double> valor = contrato.calcularParcelamento();
		
		System.out.println("\nParcelas: ");
		
		for (int i=0; i<data.size(); i++) {
			System.out.println(data.get(i) + " - R$ " + valor.get(i)+"\n");
		}
	}

}

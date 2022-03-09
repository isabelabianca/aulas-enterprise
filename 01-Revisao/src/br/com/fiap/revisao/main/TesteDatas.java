package br.com.fiap.revisao.main;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteDatas {
	
	public static void main(String[] args) {
		//Instanciar um Calendar com a data atual
		Calendar hoje = Calendar.getInstance();
		
		//Criar um Calendar com a data da abertura da Challenge 22/02/2022 11:00   -> Janeiro é 01, Fev 01 ...
		Calendar dataAbertura = new GregorianCalendar(2022,Calendar.FEBRUARY,22,11,0); //anp, mês, dia, horas, minutos
		
		//Formatador de data 	dia/mes/ano horas:minutos:segundos
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//Exibir as datas
		System.out.println(sdf.format(hoje.getTime())); // .getTime() Recupera o date
		System.out.println(sdf.format(dataAbertura.getTime()));
	
		//Java 8 API Data
		//Criar uma data atual
		LocalDate dataAtual = LocalDate.now();
		
		//Criar a data de apresentação da banca 25/05/22
		LocalDate dataApresentacao = LocalDate.of(2022, 5, 25);
		
		//Criar a hora atual
		LocalTime horaAtual = LocalTime.now();
		
		//Criar a hora do início do intervalo
		LocalTime horaIntervalo = LocalTime.of(9, 40);
		
		//Criar a data e hora atuais
		LocalDateTime dataHoraAtual = LocalDateTime.now()
;		
		//Criar a data e hora da colação de grau 04/03/23 19:00
		LocalDateTime dataHoraColacao = LocalDateTime.of(2023, 3,4,19,0);

		//Exibir as datas
		//Formatar a data
		DateTimeFormatter formataData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formataHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		DateTimeFormatter formataDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("\n"+dataAtual.format(formataData));
		System.out.println(dataApresentacao.format(formataData));
		
		System.out.println("\n"+horaAtual.format(formataHora));
		System.out.println(horaIntervalo.format(formataHora));
		
		System.out.println("\n"+dataHoraAtual.format(formataDataHora));
		System.out.println(dataHoraColacao.format(formataDataHora));
		
	} //main
} //class

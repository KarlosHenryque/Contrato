package contratos;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import exercicio.Contrato;
import exercicio.Parcela;
import servico.ContratoServico;
import servico.OnlinePagamento;
import servico.PagamentoOnline;

public class programaContrato {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato:");
		System.out.println("Numero:");
		int numero = sc.nextInt();
		System.out.printf("Data: (dd/MM/yyyy):");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.println("Valor do contrato");
		double valorTotal = sc.nextDouble();
		
		Contrato contrato = new Contrato(numero, date, valorTotal);
		
		System.out.println("Entre com o numero de parcelas");
		int n = sc.nextInt();
		
		ContratoServico contratoServico = new ContratoServico(new PagamentoOnline());
		
		contratoServico.processoContrato(contrato, n);
		
		System.out.println("Parcelas:");
		for(Parcela parcela : contrato.getParcelas()) {
			System.out.println(parcela);
		}
		
		sc.close();
	}

}

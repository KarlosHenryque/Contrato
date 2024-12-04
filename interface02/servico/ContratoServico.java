package servico;

import java.time.LocalDate;

import exercicio.Contrato;
import exercicio.Parcela;

public class ContratoServico {
	
	private OnlinePagamento onlinePagamento;

	public ContratoServico(OnlinePagamento onlinePagamento) {
		this.onlinePagamento = onlinePagamento;
	}
	
	public void processoContrato(Contrato contrato, int meses) {
	    double parcelaBasica = contrato.getValorTotal() / meses;
	    for (int i = 1; i <= meses; i++) {
	        LocalDate dia = contrato.getDate().plusMonths(i);
	        double interese = onlinePagamento.interese(parcelaBasica, i);
	        double free = onlinePagamento.pagamento(parcelaBasica + interese);
	        double cota = parcelaBasica + interese + free;
	        contrato.getParcelas().add(new Parcela(dia, cota));
	    }
	}


}

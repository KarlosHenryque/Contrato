package servico;

public class PagamentoOnline implements OnlinePagamento{

	@Override
	public double pagamento(double quantia) {
		return quantia * 0.02;
	}

	@Override
	public double interese(double quantia, int meses) {
		// TODO Auto-generated method stub
		return quantia * 0.01 * meses;
	}

	
}

package servico;

public interface OnlinePagamento {
	
	double pagamento(double quantia);
    double interese(double quantia, int meses);

}

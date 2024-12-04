package exercicio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcela {
	
	private LocalDate date;
	private Double quantia;
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	
	public Parcela() {
	}

	public Parcela(LocalDate date, Double quantia) {
		this.date = date;
		this.quantia = quantia;
	}

	protected LocalDate getDate() {
		return date;
	}

	protected void setDate(LocalDate date) {
		this.date = date;
	}

	protected Double getQuantia() {
		return quantia;
	}

	protected void setQuantia(Double quantia) {
		this.quantia = quantia;
	}

	@Override
	public String toString() {
		return date.format(fmt)+ " - " +String.format("%.2f", quantia);
	
	}

}

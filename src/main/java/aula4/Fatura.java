package aula4;

import java.util.ArrayList;
import java.util.List;

public class Fatura {
	private String cliente;
	private double valor;
	private List<Pagamento> pagamentos;
	private boolean pago;

	public Fatura(String cliente, double valor) {
		this.cliente = cliente;
		this.valor = valor;
		this.pagamentos = new ArrayList<Pagamento>();
		this.pago = false;
	}

	public String getCliente() {
		return cliente;
	}

	public double getValor() {
		return valor;
	}

	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	public void adicionaPagamento(Pagamento pagamento) {
		pagamentos.add(pagamento);
		
		if(getValorTotalPagamentos() > this.valor) {;
			this.pago = true;
		}
		
	}

	private double getValorTotalPagamentos() {
		double totalRetorno = 0.0;
		
		for(Pagamento pagamento: pagamentos) {
			totalRetorno += pagamento.getValor();
		}
		
		return totalRetorno;
	}

}

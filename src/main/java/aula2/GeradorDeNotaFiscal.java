package aula2;

import java.util.List;

public class GeradorDeNotaFiscal {

	private List<NFObserver> acoes;

	public GeradorDeNotaFiscal(List<NFObserver> acoes) {
		this.acoes = acoes;
	}

	public NotaFiscal gera(Fatura fatura) {

		double valor = fatura.getValorMensal();

		NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

		acoes.forEach(acao -> acao.execute(nf));

		return nf;
	}

	private double impostoSimplesSobreO(double valor) {
		return valor * 0.06;
	}
}

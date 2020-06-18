package aula3;

public class CalculadoraDePrecos {
	public double calcula(Compra produto, CalculadorDePreco tabela, Frete correios) {

		double desconto = tabela.descontoPara(produto.getValor());
		double frete = correios.para(produto.getCidade());

		return produto.getValor() * (1 - desconto) + frete;
	}
}

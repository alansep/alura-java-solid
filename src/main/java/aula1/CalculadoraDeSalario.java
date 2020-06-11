package aula1;

public class CalculadoraDeSalario {

	public double calcula(Funcionario funcionario) {
		return funcionario.getCargo().getMetodo().calcula(funcionario);
	}

}
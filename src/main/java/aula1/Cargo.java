package aula1;

public enum Cargo {
	DESENVOLVEDOR(new DezVintePorcento()), DBA(new QuinzeVintePorcento()), TESTER(new QuinzeVintePorcento());

	private Cargo(CalculaSalario metodo) {
		this.metodo = metodo;
	}

	private CalculaSalario metodo;

	public CalculaSalario getMetodo() {
		return metodo;
	}

}

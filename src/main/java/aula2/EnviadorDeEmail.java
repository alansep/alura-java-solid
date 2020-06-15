package aula2;

public class EnviadorDeEmail implements NFObserver {

	public void execute(NotaFiscal nf) {
		System.out.println("envia email da nf " + nf.getId());
	}
}
package aula2;

public class NotaFiscalDao implements NFObserver {

	public void execute(NotaFiscal nf) {
		System.out.println("salva nf no banco");
	}
}
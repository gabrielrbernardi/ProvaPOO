package prova2POO;
public class Main {
	public static void main(String[] args) {
		Relatorio rel = new Relatorio();
		ContaCorrente CC = new ContaCorrente();
		rel.gerarRelatorio(CC);
	}

}

package prova2POO;
public class MainExecutable {
	public static void main(String[] args) {
		Relatorio rel = new Relatorio();
		ContaCorrente CC = new ContaCorrente(10.0f);
		ContaEspecial CE = new ContaEspecial(50.0f);
		Banco banco = new Banco();
//		rel.gerarRelatorio(CC);

		CE.setLimiteCredito(50.0f);

		banco.inserir(CC);
		banco.inserir(CE);
		
		CC.depositar(100.0f);
		CE.depositar(100.0f);
		
		rel.gerarRelatorio(banco);
		
		CC.sacar(10.0f);
		CE.sacar(10.0f);
		rel.gerarRelatorio(banco);
		CC.transferir(10, CE);
		rel.gerarRelatorio(banco);
	}

}

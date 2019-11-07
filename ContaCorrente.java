package prova2POO;
public class ContaCorrente extends ContaBancaria implements Imprimivel{
	private float taxaDeOperacao;
	/***********************
	 * GETTERS E SETTERS
	 ***********************/
	public float getTaxaDeOperacao() {
		return taxaDeOperacao;
	}
	public void setTaxaDeOperacao(float taxaDeOperacao) {
		this.taxaDeOperacao = taxaDeOperacao;
	}
	/*************************
	 * METODOS ESPECIFICOS
	 *************************/
	public void sacar(double val) {
		if(val > this.getSaldoConta()) {
			throw new IllegalArgumentException("Tentativa de SAQUE nao permitida");
		}
		double qtdDescontada = val - taxaDeOperacao;
		this.setSaldoConta(this.getSaldoConta() - qtdDescontada);
	}
	public void depositar(double val) {
		double qtdDescontada = val - taxaDeOperacao;
		this.setSaldoConta(this.getSaldoConta() + qtdDescontada);
	}
	public void mostrarDados() {
		System.out.println("RESUMO DA CONTA ESPECIAL");
		System.out.println("Saldo GERAL atual: " + this.getSaldoConta());
		System.out.println("Taxa de operacao atual: " + this.getTaxaDeOperacao());
	}
}

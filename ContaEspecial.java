package prova2POO;
public class ContaEspecial extends ContaBancaria implements Imprimivel{
	private double limiteCredito;
	private static double limiteCreditoCE;
	
	/***********************
	 * GETTERS E SETTERS
	 ***********************/
	public double getLimiteCreditoCE() {
		return limiteCredito;
	}
	public double getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	/*************************
	 * METODOS ESPECIFICOS
	 *************************/
	public void sacar(double val) {
		if(val > this.getSaldoConta()) {
			this.setSaldoConta(this.getSaldoConta() - val);
			double dif = Math.abs(this.getSaldoConta());
			this.setLimiteCredito(this.getLimiteCredito() - dif);
			this.setSaldoConta(0.0f);
			
		}
	}
	public void mostrarDados() {
		System.out.println("RESUMO DA CONTA ESPECIAL");
		System.out.println("Saldo GERAL atual: " + this.getSaldoConta());
		System.out.println("Saldo LIMITE conta especial atual: " + this.getLimiteCredito());
		System.out.println("Saldo LIMITE conta especial definido: " + this.getLimiteCreditoCE());
	}


}

package prova2POO;
public class ContaEspecial extends ContaBancaria implements Imprimivel{
	private double limiteCredito;
	private double limiteOriginal;
	
	public ContaEspecial(double limiteCredito) {
		this.limiteOriginal = limiteCredito;
		this.limiteCredito = limiteCredito;
	}
	/***********************
	 * GETTERS E SETTERS
	 ***********************/
	public double getLimiteOriginal() {
		return limiteOriginal;
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
		}else if(val < this.getSaldoConta()){
			this.setSaldoConta(this.getSaldoConta() - val);
		}else {
			System.out.println("Valores nao alterados");
		}
	}
	public void depositar(double val) {
		if(this.getLimiteCredito() == this.getLimiteOriginal()){
			this.setSaldoConta(this.getSaldoConta() + val);
		}else {
			double dif = this.getLimiteOriginal() - this.getLimiteCredito();
			this.setLimiteCredito(this.getLimiteCredito() + dif);
			double dif1 = val - dif;
			this.setSaldoConta(this.getSaldoConta() + dif1);
		}
	}
	public void mostrarDados() {
		System.out.println("RESUMO DA CONTA ESPECIAL");
		System.out.println("Saldo GERAL atual: " + this.getSaldoConta());
		System.out.println("Saldo LIMITE conta especial atual: " + this.getLimiteCredito());
		System.out.println("Saldo LIMITE conta especial definido: " + this.getLimiteOriginal());
		System.out.println();
	}


}

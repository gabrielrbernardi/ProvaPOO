package prova2POO;
public abstract class ContaBancaria {
	private int numConta;
	private double saldoConta;
	
	/***********************
	 * GETTERS E SETTERS
	 ***********************/
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getSaldoConta() {
		return saldoConta;
	}
	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}
	/*************************
	 * METODOS ESPECIFICOS
	 *************************/
	public void sacar(double val) {
		this.setSaldoConta(this.getSaldoConta() - val);
	}
	public void depositar(double val) {
		this.setSaldoConta(this.getSaldoConta() + val);
	}
}

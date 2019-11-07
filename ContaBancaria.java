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
		val = Math.abs(val);
		this.setSaldoConta(this.getSaldoConta() - val);
	}
	public void depositar(double val) {
		this.setSaldoConta(this.getSaldoConta() + val);
	}
	public void transferir(double val, ContaBancaria CB) {
		if(val < 0) {									//Se o valor passado for menor que 0, significa que o usuario deseja efetuar um saque na conta de destino
			CB.sacar(val);
		}else if(val > 0){								//Se o valor passado for maior que 0, significa que o usuario deseja efetuar um deposito na conta de destino
			CB.depositar(val);
		}
	}
}

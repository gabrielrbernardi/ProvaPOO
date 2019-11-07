package prova2POO;
import java.util.ArrayList;
public class Banco {
	private ArrayList<ContaBancaria> contasBancarias = new ArrayList<ContaBancaria>();
	
	public void inserir(ContaBancaria CB) {
		contasBancarias.add(CB);
	}
	public void remover(ContaBancaria CB) {
		contasBancarias.remove(CB);
	}
	public ContaBancaria procurarConta(int numConta) {
		for(ContaBancaria CB : contasBancarias) {
			if(numConta == CB.getNumConta()) {
				return CB;												// Se o numero da conta informado para pesquisa for existente retorna a conta bancaria, caso contrario retorna uma excecao
			}
		}
		throw new IllegalArgumentException("Numero da conta infomada NAO existente");
	}
	
}

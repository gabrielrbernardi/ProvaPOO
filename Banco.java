package prova2POO;
import java.util.ArrayList;
public class Banco implements Imprimivel{
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
	@Override
	public void mostrarDados() {
		/*
		 * Para cada valor dentro de contasBancarias, ele verifica o tipo que foi instanciado. Se for ContaCorrente, o programa vai colocar pra imprimir os dados da ContaCorrente, caso contrario se for Conta Especial, vai imprimir os dados da ContaEspecial
		 * */
		contasBancarias.forEach(val->{if (val instanceof ContaCorrente) {
			((ContaCorrente)val).mostrarDados();
		}else if(val instanceof ContaEspecial) {
			((ContaEspecial)val).mostrarDados();
		}
		});
	}
}

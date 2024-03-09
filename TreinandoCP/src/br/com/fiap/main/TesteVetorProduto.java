package br.com.fiap.main; 

import java.util.Iterator;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteVetorProduto {

	//Preparar as variaveis
	
	//String
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	//Int
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	//Double
	static Double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	
	public static void main(String[] args) {
		
		//Preparar Posições
		Produto[] vetorProduto = new Produto[2]; //[0] [1] [2] 
		
		//Controle das posições
		int indice = 0;
		
		//Entrada
		do {
			vetorProduto[indice] = new Produto();
//			vetorProduto[indice].setNome(texto("Digite o nome do produto: "));
			vetorProduto[indice].setQuantidade(inteiro("Digite a quantidade: "));
			vetorProduto[indice].setValor(real("Digite o valor: "));
			
			indice ++;
			
		} while (JOptionPane.showConfirmDialog(null, "Adicionar mais coisas ao carrinho?",
				"CARRINHO DE COMPRAS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0);
		
		
		//Saidas
		for (int contador = 0; contador < indice; contador ++) {
			
			System.out.println("__________________CARRINHO DE COMPRAS__________________"+
							  "\n\nNOME: "+ vetorProduto[contador].getNome()+
							  "\nQuantidade: "+ vetorProduto[contador].getQuantidade()+
							  "\nValor: "+ vetorProduto[contador].getValor()
					);
			
		}
		
		
		
		
		
	}

}

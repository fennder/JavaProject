package principal;

import java.io.IOException;

import javax.swing.JOptionPane;

import funcao.Arquivo;
import funcao.Funcao;

/**
 * Algortimo idealizado para equipe 216 Desenvolvimento Web
 * Prof.: Edir Pereira
 */
public class Principal {

	public static void main(String[] args) throws IOException {
		// BLOCO - Declaração de variáveis
		String mensagem, arquivo;
		Funcao funcao = new Funcao();
		Arquivo arq = new Arquivo();
		
		//Usando método de passagem de parâmetro com retorno
//		mensagem = JOptionPane.showInputDialog("Digite o seu nome: ");
//		funcao.mensagem(mensagem);
//		JOptionPane.showMessageDialog(null, funcao.mensagem(mensagem));
		
//		funcao.media();
//		funcao.printPerson();

		arquivo = JOptionPane.showInputDialog("Digite o caminho e o nome do arquivo. exemplo: ''ini.txt'': ");
//		arq.readFile1(arquivo);
		System.out.println("");
//		arq.readFile2(arquivo);
		System.out.println("");
		arq.writeFile(arquivo);
		arq.readFile3(arquivo);
		System.out.println("");
		
//		funcao.vetor();
		System.out.println();
//		funcao.ordenar();
		System.out.println();
//		funcao.matriz();
		
		
	}

}
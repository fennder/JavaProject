package principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import funcao.Arquivo;
import funcao.Funcao;
	
public class Principal {

	public static void main(String[] args) {
		// BLOCO - Declaração de variáveis
		String mensagem, arquivo;
		Funcao funcao = new Funcao();
		Arquivo arq = new Arquivo();
		
		//mensagem = JOptionPane.showInputDialog("Digite o seu nome: ");
		
		//funcao.media();
		//funcao.mensagem(mensagem);
		//JOptionPane.showMessageDialog(null, funcao.mensagem(mensagem));
		//funcao.prinPerson();

		arquivo = JOptionPane.showInputDialog("Digite o caminho e o nome do arquivo. exemplo: ''ini.txt'': ");
		arq.readFile1(arquivo);
		arq.readFile2(arquivo);
		arq.readFile3(arquivo);
		
		
	}

}
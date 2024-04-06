package principal;

import javax.swing.JOptionPane;
import funcao.Funcao;

public class Principal {

	public static void main(String[] args) {
		// BLOCO - Declaração de variáveis
		String mensagem;
		Funcao funcao = new Funcao();
		
		mensagem = JOptionPane.showInputDialog("Digite o seu nome: ");
		
		funcao.media();
		funcao.mensagem(mensagem);
		JOptionPane.showMessageDialog(null, funcao.mensagem(mensagem));
		funcao.prinPerson();
		
	}

}
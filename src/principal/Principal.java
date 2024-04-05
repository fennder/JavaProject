package principal;

import java.util.Scanner;

import javax.swing.JOptionPane;

import funcao.Funcao;
import model.People;

public class Principal {

	public static void main(String[] args) {
		// BLOCO - Declaração de variáveis
		String mensagem;
		Funcao funcao = new Funcao();
		People p = new People();
		
		mensagem = JOptionPane.showInputDialog("Digite o seu nome: ");
		
		funcao.media();
		funcao.mensagem(mensagem);
		JOptionPane.showMessageDialog(null, funcao.mensagem(mensagem));
		
		p.setName("Edir");
		p.setLastName("Pereira dos Santos");
		p.setCpf("896.654.852-74");
		p.setBirthDay("03/06/1981");
		p.setPhoneNumber("(61)98406-7817");
		p.setAge(42);
//		-----------------
		JOptionPane.showMessageDialog(null,"Os dados da pessoa são: Nome: " + p.getName()
													+ " Sobre Nome: " + p.getLastName()
													+ " CPF: " + p.getCpf()
													+ " Data de Nascimento: " + p.getBirthDay()
													+ " Idade: " + p.getAge()
													+ " Telefone: " + p.getPhoneNumber());
		
	}

}

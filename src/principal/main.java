package principal;

import java.util.Scanner;

import javax.swing.JOptionPane;

import funcao.Funcao;

public class main {

	public static void main(String[] args) {
		// BLOCO - Declaração de variáveis
		float nota1, nota2;
		String sn1, sn2;
		Funcao funcao = new Funcao();
		
		// BLOCO - Entrada de Dados
//		nota1 = 5;
//		nota2 = 4;
//		Scanner read = new Scanner(System.in);
//		
//		System.out.println("Digite o valor da Primeira Nota: ");
//		nota1 = read.nextFloat();
//		System.out.println("Digite o valor da Segunda Nota: ");
//		nota2 = read.nextFloat();
		
		sn1 = JOptionPane.showInputDialog("Digite o valor da Primeira nota: ");
		nota1 = Float.parseFloat(sn1);
		sn2 = JOptionPane.showInputDialog("Digite o valor da Segunda nota: ");
		nota2 = Float.parseFloat(sn2);
		
		funcao.media(nota1, nota2);
		
		
	}

}

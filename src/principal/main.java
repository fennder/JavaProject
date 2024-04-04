package principal;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// BLOCO - Declaração de variáveis
		float nota1, nota2, media, notar, mediar;
		String sn1, sn2, snr;
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
		
		// BLOCO - Processamento
		media = (nota1 + nota2)/2;
				
		// BLOCO - Saída de Dados
		if(media >= 7) {
			JOptionPane.showMessageDialog(null, "Aprovado com média: " + media);
//			System.out.println("Aprovado com média: " + media);
		}else if(media < 7){
			JOptionPane.showMessageDialog(null, "Aluno em Recuperação " + media);
//			System.out.println("Aluno em Recuperação " + media);
//			System.out.println("Digite o valor da Nota da Recuperação: ");
//			notar = read.nextFloat();
			snr = JOptionPane.showInputDialog("Digite o valor da nota de Recuperação: ");
			notar = Float.parseFloat(snr);
			mediar = (media + notar)/2;
			if(mediar >= 5) { //Conjunção
				JOptionPane.showMessageDialog(null, "Aprovado em recuperação com média " + mediar);
//				System.out.println("Aprovado em recuperação com média " + mediar);
			}else {
				JOptionPane.showMessageDialog(null, "Reprovado com média " + mediar);
//				System.out.println("Reprovado com média " + mediar);
			}
		}
	
		
		
		
	}

}

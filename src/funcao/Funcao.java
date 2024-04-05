package funcao;

import javax.swing.JOptionPane;

public class Funcao {
	
	public void media(Float nota1, Float nota2) {
		//BLOCO - Declaração de variáveis
		float media, notar, mediar;
		String snr;
		
		// BLOCO - Processamento
		media = (nota1 + nota2)/2;
						
		// BLOCO - Saída de Dados
		if(media >= 7) {
			JOptionPane.showMessageDialog(null, "Aprovado com média: " + media);
		}else if(media < 7){
			JOptionPane.showMessageDialog(null, "Aluno em Recuperação " + media);
			snr = JOptionPane.showInputDialog("Digite o valor da nota de Recuperação: ");
			notar = Float.parseFloat(snr);
			mediar = (media + notar)/2;
			if(mediar >= 5) {
				JOptionPane.showMessageDialog(null, "Aprovado em recuperação com média " + mediar);
			}else {
				JOptionPane.showMessageDialog(null, "Reprovado com média " + mediar);

			}
		}
	}
}

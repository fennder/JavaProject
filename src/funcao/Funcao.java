package funcao;

import javax.swing.JOptionPane;
import model.People;

public class Funcao {
	People p = new People();
	private String mensage;

	//Função que calcula a média do aluno
	public void media() {
		//BLOCO - Declaração de variáveis
		float nota1, nota2, media, notar, mediar;
		String sn1, sn2, snr;
		
		// BLOCO - Entrada de Dados
		sn1 = JOptionPane.showInputDialog("Digite o valor da Primeira nota: ");
		nota1 = Float.parseFloat(sn1);
		sn2 = JOptionPane.showInputDialog("Digite o valor da Segunda nota: ");
		nota2 = Float.parseFloat(sn2);
		
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
	
	//Função que retorna uma mensagem do tipo String
	public String mensagem(String mensagem) {
		this.mensage = (mensagem + " Você entrou na função que retorna uma String");
		return mensage;
	}

	public void prinPerson(){
		//BLOCO - Declaração de variáveis
		int idade;
		String sidade;

		// BLOCO - Entrada de Dados
		p.setName(JOptionPane.showInputDialog("Digite o seu primeiro nome: "));
		p.setLastName(JOptionPane.showInputDialog("Digite o seu sobrenome: "));
		p.setCpf(JOptionPane.showInputDialog("Digite o seu CPF: "));
		p.setBirthDay(JOptionPane.showInputDialog("Digite sua data de nascimento no padrão 00/00/0000: "));
		p.setPhoneNumber(JOptionPane.showInputDialog("Digite o seu celular no padrão (00)00000-0000: "));
		sidade = JOptionPane.showInputDialog("Digite a sua idade: ");
		p.setAge(idade = Integer.parseInt(sidade));
		//---------------------
		JOptionPane.showMessageDialog(null,"Os dados da pessoa são: Nome: " + p.getName()
																			+ " Sobre Nome: " + p.getLastName()
																			+ " CPF: " + p.getCpf()
																			+ " Data de Nascimento: " + p.getBirthDay()
																			+ " Idade: " + p.getAge()
																			+ " Telefone: " + p.getPhoneNumber());
	}
	
}

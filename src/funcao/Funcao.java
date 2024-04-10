package funcao;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;
import model.People;

public class Funcao {
	
	String stv;
	int tv, j, i;
		
	People p = new People();
	Random rand = new Random();
	private String mensage;
	
	//Função que calcula a média do aluno
	public void media() {
		//BLOCO - Declaração de variáveis
		float nota1, nota2, media, notar, mediar;
		String sn1, sn2, snr;
		
		// BLOCO - Entrada de Dados
		sn1 = JOptionPane.showInputDialog("Digite o valor da Primeira nota: "); //8
		nota1 = Float.parseFloat(sn1);
		sn2 = JOptionPane.showInputDialog("Digite o valor da Segunda nota: "); //5
		nota2 = Float.parseFloat(sn2);
		
		// BLOCO - Processamento
		media = (nota1 + nota2)/2; //6.50
						
		// BLOCO - Saída de Dados
		if(media >= 7) {
			JOptionPane.showMessageDialog(null, "Aprovado com média: " + media);
		}else if(media < 7){
			JOptionPane.showMessageDialog(null, "Aluno em Recuperação " + media); //6.50
			snr = JOptionPane.showInputDialog("Digite o valor da nota de Recuperação: "); //5
			notar = Float.parseFloat(snr);
			mediar = (media + notar)/2; //5.25
			if(mediar >= 5) {
				JOptionPane.showMessageDialog(null, "Aprovado em recuperação com média " + mediar); //5.25
			}else {
				JOptionPane.showMessageDialog(null, "Reprovado com média " + mediar);

			}
		}
	}
	//Função que retorna uma mensagem do tipo String
	public String mensagem(String mensagem) {
		this.mensage = (mensagem + "! Você entrou na função que retorna uma String");
		return mensage;
	}

	public void printPerson(){
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
	
	public void vetor() {
		JOptionPane.showMessageDialog(null, "Gere os 15 números da Lotofácil: ");
//		stv = JOptionPane.showInputDialog("Digite o tamanho do vetor: ");
//		tv = Integer.parseInt(stv);
		tv = 15;
		//Números da Loto fácil
		int[] numeros = new int[tv];
		
		for(i=0;i < numeros.length;i++) {
			int novoNumero;
			boolean repetido;
			
			do {
				repetido = false;
				novoNumero = rand.nextInt(24)+1;
				
				for(int j=0;j < numeros.length; j++) {
					if(numeros[j] == novoNumero) {
						repetido = true;
						break;
					}
				}
			} while (repetido == true);
			numeros[i] = novoNumero;
		}
		Arrays.sort(numeros);
		System.out.println("Numeros não repetidos");
		for(int numero : numeros) {
			System.out.print(numero + "|");
		}
		System.out.println();
		
	}
		
	public void matriz() {
		int[][] tabela = new int[10][10];
		
		for(i=0;i<tabela.length;i++) {
			for(j=0;j<tabela.length;j++) {
				int matriz = rand.nextInt(2);
				tabela[i][j] = matriz;
				
				System.out.print(tabela[i][j] + "|");
			}
			System.out.println();
		}
	}
	
	public void ordenar() {
		System.out.println();
		String[] nomes = new String[] {"Carlos","Luiz","Ana","Vitória","Gabriel","Lucas","Bruno"};
		
		System.out.println("Nomes não ordenados");
		
		for(String nome : nomes) {
			System.out.print("|" + nome);
		}
		
		Arrays.sort(nomes);
		
		System.out.println();
		System.out.println("Nomes ordenados");
		for(String nome : nomes) {
			System.out.print("|" + nome);
		}
	}
}

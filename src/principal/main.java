package principal;

public class main {

	public static void main(String[] args) {
		// BLOCO - Declaração de variáveis
		float nota1, nota2, media, notar, mediar;
		
		// BLOCO - Entrada de Dados
		nota1 = 5;
		nota2 = 4;
		
		// BLOCO - Processamento
		media = (nota1 + nota2)/2;
				
		// BLOCO - Saída de Dados
		if(media >= 7) { // 4.5
			System.out.println("Aprovado com média " + media);
		}else if(media < 7 && media >= 5){ // Conjução
			System.out.println("Aluno em Recuperação " + media);
		}else {
			notar = 8;
			mediar = (media + notar)/2;
			if(mediar >= 5) {
				System.out.println("Aprovado em recuperação com média " + mediar);
			}else {
				System.out.println("Reprovado com média " + mediar);
			}
		}
	
		
		
		
	}

}

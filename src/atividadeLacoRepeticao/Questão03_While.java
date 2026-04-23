package atividadeLacoRepeticao;

import java.util.Scanner;

public class Questão03_While {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		// Variaveis 
		int idade;
		int menor21 = 0;
		int maior50 = 0;
		
		// Entrada de Dados
		System.out.println("Digite uma idade : ");
		idade = leia.nextInt();
		
		// Processamento
		while (idade >= 0) {
			if (idade < 21) {
			    menor21++;
			} else if (idade > 50) {
			    maior50++;
			}
			
			 System.out.println("Digite uma idade:");
			    idade = leia.nextInt();
		}
		
			// Saída de Dados
			System.out.println("Total de pessoas menores de 21 anos: " + menor21);
			System.out.println("Total de pessoas maiores de 50 anos: " + maior50);
		}
	}



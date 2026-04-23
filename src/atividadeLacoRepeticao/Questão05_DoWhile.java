package atividadeLacoRepeticao;

import java.util.Scanner;

public class Questão05_DoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner leia = new Scanner(System.in);
		
		// Variáveis
		int numero;
		int soma = 0;
		
		// Entrada de Dados/Processamento
		do {
		System.out.println("Digite um Número : ");
		numero = leia.nextInt();
		
		if (numero > 0) {
			soma = soma + numero;
		}
		
		} while (numero != 0);
		
		 // Sáida de dados
		 System.out.println("\nA soma dos números positivos é: " + soma);

	        sc.close();
	}

}

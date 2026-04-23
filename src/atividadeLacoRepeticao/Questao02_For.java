package atividadeLacoRepeticao;

import java.util.Scanner;

public class Questao02_For {

	public static void main(String[] args) {
		 
		 Scanner leia = new Scanner(System.in);
		 
		 // Variáveis
	        int numero;
	        int pares = 0;
	        int impares = 0;

	        for (int contador = 1; contador <= 10; contador++) {
	        	
                 // Entrada de Dados
	            System.out.println("Digite o " + contador + "º número:");
	            numero = leia.nextInt();

	            // Processamento 
	            if (numero % 2 == 0) {
	                pares++;
	            } else {
	                impares++;
	            }
	        }

	        // Saída de Dados
	        System.out.println("Total de números pares: " + pares);
	        System.out.println("Total de números ímpares: " + impares);

	        leia.close();

	}

}

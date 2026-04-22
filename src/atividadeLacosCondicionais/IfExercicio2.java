package atividadeLacosCondicionais;

import java.util.Scanner;

public class IfExercicio2 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        // Entrada
	        System.out.print("Digite um número: ");
	        int numero = sc.nextInt();

	        // Variáveis para guardar resultado
	        String tipo;
	        String sinal;

	        // Verifica par ou ímpar
	        if (numero % 2 == 0) {
	            tipo = "par";
	        } else {
	            tipo = "ímpar";
	        }

	        // Verifica positivo ou negativo
	        if (numero >= 0) {
	            sinal = "positivo";
	        } else {
	            sinal = "negativo";
	        }

	        // Saída
	        System.out.println("O Número " + numero + " é " + tipo + " e " + sinal + "!");

	        sc.close();

	}

}

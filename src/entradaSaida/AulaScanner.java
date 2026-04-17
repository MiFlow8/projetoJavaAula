package entradaSaida;

import java.util.Scanner; 

public class AulaScanner {

	public static void main(String[] args) {
		
		// Declarando as Variaveis
		Scanner leia = new Scanner(System.in);
		String nome;
		
		// Entrada de Dados
		System.out.println("Digite o seu nome:	");
		
		// processamento
		nome = leia.nextLine(); 
		
		// Sáda de Dados
		System.out.println("Bom dia, " + nome); // (+) concatenar
		
		
		

	}

}

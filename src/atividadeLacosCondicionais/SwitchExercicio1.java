package atividadeLacosCondicionais;

import java.util.Scanner;

public class SwitchExercicio1 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        // Entrada
	        System.out.print("Código do Produto: ");
	        int codigo = sc.nextInt();

	        System.out.print("Quantidade: ");
	        int quantidade = sc.nextInt();

	        String produto = "";
	        double preco = 0;

	        // Switch
	        switch (codigo) {
	            case 1:
	                produto = "Cachorro Quente";
	                preco = 10.00;
	                break;

	            case 2:
	                produto = "X-Salada";
	                preco = 15.00;
	                break;

	            case 3:
	                produto = "X-Bacon";
	                preco = 18.00;
	                break;

	            case 4:
	                produto = "Bauru";
	                preco = 12.00;
	                break;

	            case 5:
	                produto = "Refrigerante";
	                preco = 8.00;
	                break;

	            case 6:
	                produto = "Suco de laranja";
	                preco = 13.00;
	                break;

	            default:
	                System.out.println("Código inválido!");
	                return;
	        }

	        // Cálculo
	        double valorTotal = quantidade * preco;

	        // Saída
	        System.out.println("\nProduto: " + produto);
	        System.out.println("Valor total: R$ " + valorTotal);

	        sc.close();

	}

}

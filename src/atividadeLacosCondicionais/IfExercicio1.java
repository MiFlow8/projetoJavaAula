package atividadeLacosCondicionais;

import java.util.Scanner;

public class IfExercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Entrada de dados
		System.out.print("Digite o número A: ");
		int A = sc.nextInt();

		System.out.print("Digite o número B: ");
		int B = sc.nextInt();

		System.out.print("Digite o número C: ");
		int C = sc.nextInt();

		// Processamento
		int soma = A + B;

		// Saída + Condicional IF
		if (soma > C) {
			System.out.println(A + " + " + B + " = " + soma + " > " + C);
			System.out.println("A Soma de A + B é Maior do que C");
		} else if (soma < C) {
			System.out.println(A + " + " + B + " = " + soma + " < " + C);
			System.out.println("A Soma de A + B é Menor do que C");
		} else {
			System.out.println(A + " + " + B + " = " + soma + " = " + C);
			System.out.println("A Soma de A + B é Igual a C");
		}

		sc.close();

	}

}

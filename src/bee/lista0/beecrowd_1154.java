package bee.lista0;

import java.util.Scanner;

public class beecrowd_1154 {
	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);

		int idade = 0, idadeTotal = 0, quantidadeDeIdades = 0;
		float media = 0;

		while (true) {
			idade = entradaDados.nextInt();

			if (idade < 0) {
				break;
			}

			quantidadeDeIdades++;
			idadeTotal += idade;
		}

		media = ((float) idadeTotal) / ((float) quantidadeDeIdades);
		System.out.printf("%.2f", media);
		System.out.print("\n");
		entradaDados.close();
	}
}

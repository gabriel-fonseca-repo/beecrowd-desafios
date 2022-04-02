package bee.lista0;

import java.util.Scanner;

public class beecrowd_1064 {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);

		int nTestes = 6;
		int qtdPositivos = 0;
		double somatorio = 0;
		double media = 0;

		for (int i = 0; i < nTestes; i++) {
			double numero = dado.nextDouble();
			if (numero > 0) {
				qtdPositivos++;
				somatorio += numero;
				media = somatorio / qtdPositivos;
			}
		}
		System.out.println(qtdPositivos + " valores positivos");
		System.out.printf("%2.1f\n", media);
		dado.close();
	}
}

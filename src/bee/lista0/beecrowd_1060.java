package bee.lista0;

import java.util.Scanner;

public class beecrowd_1060 {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);

		int nTestes = 6;
		int qtdPositivos = 0;

		for (int i = 0; i < nTestes; i++) {
			double numero = dado.nextDouble();
			if (numero > 0) {
				qtdPositivos++;
			}
		}
		System.out.println(qtdPositivos + " valores positivos");
		dado.close();
	}
}

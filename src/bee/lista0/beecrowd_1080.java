package bee.lista0;

import java.util.Scanner;

public class beecrowd_1080 {
	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);

		int nTestes = 1;
		int numero;
		int maior = 0;
		int posicao = 0;

		while (nTestes < 101) {
			numero = dados.nextInt();
			if (numero > maior) {
				maior = numero;
				posicao = nTestes;
			}
			nTestes++;
		}
		System.out.println(maior);
		System.out.println(posicao);
		dados.close();
	}
}

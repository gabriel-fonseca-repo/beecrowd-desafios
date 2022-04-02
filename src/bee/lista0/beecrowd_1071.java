package bee.lista0;

import java.util.Scanner;

public class beecrowd_1071 {
	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);

		int x = dados.nextInt();
		int y = dados.nextInt();
		int somaImpares = 0;
		int aux;

		if (y > x) {
			aux = y;
			y = x;
			x = aux;
		}

		if (y < 0) {
			y++;
		}

		while (x > y) {
			x--;
			if ((x % 2) != 0) {
				somaImpares += x;
			}
		}
		System.out.println(somaImpares);
		dados.close();
	}
}

package bee.lista0;

import java.util.Scanner;

public class beecrowd_1072 {
	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);

		int nTestes = dados.nextInt();
		int n;
		int fora = 0;
		int dentro = 0;

		while (nTestes > 0) {

			n = dados.nextInt();

			if (n >= 10 && n <= 20) {
				dentro++;
			} else {
				fora++;
			}

			nTestes--;

		}
		System.out.println(dentro + " in");
		System.out.println(fora + " out");
		dados.close();
	}
}

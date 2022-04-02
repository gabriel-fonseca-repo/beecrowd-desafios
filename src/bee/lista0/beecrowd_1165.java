package bee.lista0;

import java.util.Scanner;

public class beecrowd_1165 {
	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		int nDeTestes = entradaDados.nextInt();

		do {
			double numero = entradaDados.nextInt();
			double s = Math.sqrt(numero);
			boolean ehPrimo = true;

			if (numero <= 1) {
				ehPrimo = false;
			}

			else if ((numero % 2 == 0) && (numero > 2)) {
				ehPrimo = false;
			}

			for (int i = 3; i <= s; i += 2) {
				if (numero % i == 0) {
					ehPrimo = false;
					break;
				}
			}

			if (ehPrimo) {
				System.out.println((int) numero + " eh primo");
			} else {
				System.out.println((int) numero + " nao eh primo");
			}

			nDeTestes--;

		} while (nDeTestes > 0);
		entradaDados.close();
	}
}

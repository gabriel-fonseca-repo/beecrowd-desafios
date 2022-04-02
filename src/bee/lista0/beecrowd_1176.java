package bee.lista0;

import java.util.Scanner;

public class beecrowd_1176 {
	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);

		long qtdTestes = entradaDados.nextInt();
		long[] numerosFib = new long[70];
		numerosFib[0] = 0;
		numerosFib[1] = 1;

		for (int j = 2; j < 61; j++) {
			numerosFib[j] = numerosFib[j - 1] + numerosFib[j - 2];
		}

		for (int i = 1; i <= qtdTestes; i++) {
			int numFib = entradaDados.nextInt();
			System.out.println("Fib(" + numFib + ") = " + numerosFib[numFib]);
		}
		entradaDados.close();
	}
}

package bee.lista0;

import java.util.Scanner;

public class beecrowd_1172 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] x = new int[10];

		for (int i = 0; i < 10; i++) {
			x[i] = entrada.nextInt();
		}

		for (int i = 0; i < x.length; i++) {
			if (x[i] > 0) {
				System.out.println("X[" + i + "] = " + x[i]);
			} else if (x[i] <= 0) {
				System.out.println("X[" + i + "] = " + "1");
			}
		}
		entrada.close();
	}
}

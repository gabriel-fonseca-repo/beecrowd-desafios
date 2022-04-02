package bee.lista0;

import java.util.Scanner;

public class beecrowd_1174 {
	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);

		float[] n = new float[100];

		for (int i = 0; i < 100; i++) {
			n[i] = entradaDados.nextFloat();
		}

		for (int i = 0; i < n.length; i++) {
			if (n[i] <= 10) {
				System.out.printf("A[%d] = %.1f", i, n[i]);
				System.out.print("\n");
			}
		}
		entradaDados.close();
	}
}

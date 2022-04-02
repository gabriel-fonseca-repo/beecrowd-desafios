package bee.lista0;

import java.util.Scanner;

public class beecrowd_1173 {
	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);

		int[] n = new int[10];

		n[0] = entradaDados.nextInt();

		for (int i = 1; i < 10; i++) {
			n[i] = n[i - 1] * 2;
		}

		for (int i = 0; i < n.length; i++) {
			System.out.println("N[" + i + "] = " + n[i]);
		}
		entradaDados.close();
	}
}

package bee.lista0;

import java.util.Scanner;

public class beecrowd_1177 {
	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);

		int[] narray = new int[1001];
		int limite = entradaDados.nextInt();
		int g = 0;
		narray[0] = 0;

		for (int i = 0; i <= 1000; i++) {
			narray[i] = g;
			g++;
			if (g == limite) {
				g = 0;
			}
		}

		for (int i = 0; i < narray.length - 1; i++) {
			System.out.println("N[" + i + "] = " + narray[i]);
		}
		entradaDados.close();
	}
}

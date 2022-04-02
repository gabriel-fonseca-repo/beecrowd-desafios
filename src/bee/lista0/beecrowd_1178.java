package bee.lista0;

import java.util.Scanner;

public class beecrowd_1178 {
	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);

		double[] narray = new double[101];
		double primeiroTermo = entradaDados.nextDouble();
		narray[0] = primeiroTermo;

		for (int i = 1; i <= 100; i++) {
			narray[i] = (narray[i - 1] / 2);
		}

		for (int i = 0; i < narray.length - 1; i++) {
			System.out.printf("N[%d] = %.4f\n", i, narray[i]);
		}
		entradaDados.close();
	}
}

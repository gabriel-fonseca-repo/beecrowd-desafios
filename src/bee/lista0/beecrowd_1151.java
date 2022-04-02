package bee.lista0;

import java.util.Scanner;

public class beecrowd_1151 {
	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);

		int fib0 = 0, fib1 = 1, fibo;
		int nFib = entradaDados.nextInt();

		System.out.print(fib0 + " " + fib1);

		for (int i = 2; i < nFib; i++) {
			fibo = fib0 + fib1;
			System.out.print(" " + fibo);
			fib0 = fib1;
			fib1 = fibo;
		}

		System.out.print("\n");
		entradaDados.close();
	}
}

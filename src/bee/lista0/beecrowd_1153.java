package bee.lista0;

import java.util.Scanner;

public class beecrowd_1153 {
	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);

		int n = entradaDados.nextInt(), fatorial = 1, n1 = n;

		while (n >= 1) {
			fatorial *= n1--;
			n--;
		}
		System.out.println(fatorial);
		entradaDados.close();
	}
}

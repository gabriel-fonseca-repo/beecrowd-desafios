package bee.lista0;

import java.util.Scanner;

public class beecrowd_1065 {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);

		int nTestes = 5;
		int qtdPares = 0;
		int qtdImpares = 0;
		int qtdPositivos = 0;
		int qtdNegativos = 0;

		for (int i = 0; i < nTestes; i++) {
			double numero = dado.nextDouble();
			if ((numero % 2) == 0) {
				qtdPares++;
			}
			if ((numero % 2) != 0) {
				qtdImpares++;
			}
			if (numero > 0) {
				qtdPositivos++;
			}
			if (numero < 0) {
				qtdNegativos++;
			}
		}
		System.out.println(qtdPares + " valor(es) par(es)");
		System.out.println(qtdImpares + " valor(es) impar(es)");
		System.out.println(qtdPositivos + " valor(es) positivo(s)");
		System.out.println(qtdNegativos + " valor(es) negativo(s)");
		dado.close();
	}
}

package bee.lista0;

import java.util.Scanner;

public class beecrowd_1094 {
	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);

		char tipoDeAnimal;
		int qtdCobaias;
		int nTestes = dados.nextInt();
		int totalCobaias = 0;
		int totalCoelhos = 0;
		int totalRatos = 0;
		int totalSapos = 0;
		double pcntCoelhos;
		double pcntRatos;
		double pcntSapos;

		do {
			qtdCobaias = dados.nextInt();
			tipoDeAnimal = dados.next().charAt(0);

			totalCobaias += qtdCobaias;

			if (tipoDeAnimal == 'C') {
				totalCoelhos += qtdCobaias;
			} else if (tipoDeAnimal == 'R') {
				totalRatos += qtdCobaias;
			} else if (tipoDeAnimal == 'S') {
				totalSapos += qtdCobaias;
			}
			nTestes--;
		} while (nTestes > 0);

		pcntCoelhos = (totalCoelhos * 100) / (double) totalCobaias;
		pcntRatos = (totalRatos * 100) / (double) totalCobaias;
		pcntSapos = (totalSapos * 100) / (double) totalCobaias;

		System.out.println("Total: " + totalCobaias + " cobaias");
		System.out.println("Total de coelhos: " + totalCoelhos);
		System.out.println("Total de ratos: " + totalRatos);
		System.out.println("Total de sapos: " + totalSapos);
		System.out.printf("Percentual de coelhos: %.2f %%\n", pcntCoelhos);
		System.out.printf("Percentual de ratos: %.2f %%\n", pcntRatos);
		System.out.printf("Percentual de sapos: %.2f %%\n", pcntSapos);
		dados.close();
	}
}

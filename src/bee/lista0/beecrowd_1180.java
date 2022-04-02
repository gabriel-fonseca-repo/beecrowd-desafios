package bee.lista0;

import java.util.Scanner;

public class beecrowd_1180 {
	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);

		int tamanhoDoArray = entradaDados.nextInt();
		int[] arrayX = new int[tamanhoDoArray + 1];
		int posicaoArray = 0;

		for (int i = 0; i < tamanhoDoArray; i++) {
			arrayX[i] = entradaDados.nextInt();
		}

		int valorMenor = arrayX[0];

		for (var i = 0; i < tamanhoDoArray; i++) {
			if (arrayX[i] < valorMenor) {
				valorMenor = arrayX[i];
				posicaoArray = i;
			}
		}

		System.out.println("Menor valor: " + valorMenor);
		System.out.println("Posicao: " + posicaoArray);
		entradaDados.close();
	}
}

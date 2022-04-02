package bee.lista0;

import java.util.Scanner;

public class beecrowd_1179 {

	static class vetores {
		int[] impares = new int[5];
		int[] pares = new int[5];
		int indicePar = 0;
		int indiceImpar = 0;

		private void preencherVetores(int numeroInput) {
			if ((numeroInput % 2) == 0) {
				this.pares[this.indicePar] = numeroInput;
				this.indicePar++;
			} else {
				this.impares[this.indiceImpar] = numeroInput;
				this.indiceImpar++;
			}
			if (this.impares[4] != 0) {
				for (int i = 0; i < this.impares.length; i++) {
					System.out.printf("impar[%d] = %d\n", i, this.impares[i]);
					this.impares[i] = 0;
				}
				this.indiceImpar = 0;
			}
			if (this.pares[4] != 0) {
				for (int i = 0; i < this.pares.length; i++) {
					System.out.printf("par[%d] = %d\n", i, this.pares[i]);
					this.pares[i] = 0;
				}
				this.indicePar = 0;
			}
		}

		private void printVetores() {
			for (int i = 0; i < this.impares.length; i++) {
				if (impares[i] != 0) {
					System.out.printf("impar[%d] = %d\n", i, this.impares[i]);
				}
			}
			for (int i = 0; i < this.pares.length; i++) {
				if (pares[i] != 0) {
					System.out.printf("par[%d] = %d\n", i, this.pares[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		vetores metodos = new vetores();
		Scanner entrada = new Scanner(System.in);
		int numero;

		for (int i = 0; i < 15; i++) {
			numero = entrada.nextInt();
			metodos.preencherVetores(numero);
		}
		metodos.printVetores();
		entrada.close();
	}
}

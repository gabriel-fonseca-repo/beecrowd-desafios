package bee.lista0;

import java.util.Scanner;

public class beecrowd_1175 {
	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);

		int[] n = new int[20];
		int aux = 0;
		int contador = 19;

		for (int i = 0; i < n.length; i++) {
			n[i] = entradaDados.nextInt();
		}

		for (int i = 0; i < n.length / 2; i++) {
			aux = n[i];
			n[i] = n[contador];
			n[contador] = aux;
			contador--;
		}

		for (int i = 0; i < n.length; i++) {
			System.out.println("N[" + i + "] = " + n[i]);
		}
		entradaDados.close();
	}
}
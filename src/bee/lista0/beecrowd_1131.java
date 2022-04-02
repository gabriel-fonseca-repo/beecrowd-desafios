package bee.lista0;

import java.util.Scanner;

public class beecrowd_1131 {
	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);

		var testeGrenaisOn = true;
		int novoGrenal = 1, quantidadeGrenais = 0, vitoriasInter = 0, vitoriasGremio = 0, empates = 0;

		do {
			while (novoGrenal == 1) {
				int interGols = entradaDados.nextInt();
				int gremioGols = entradaDados.nextInt();

				if (interGols == gremioGols) {
					empates++;
				} else if (gremioGols > interGols) {
					vitoriasGremio++;
				} else {
					vitoriasInter++;
				}

				quantidadeGrenais++;

				System.out.println("Novo grenal (1-sim 2-nao)");
				novoGrenal = entradaDados.nextInt();
				if (novoGrenal == 2) {
					break;
				}
			}

			System.out.println(quantidadeGrenais + " grenais");
			System.out.println("Inter:" + vitoriasInter);
			System.out.println("Gremio:" + vitoriasGremio);
			System.out.println("Empates:" + empates);
			if (empates > vitoriasInter && empates > vitoriasGremio) {
				System.out.println("Nao houve vencedor");
			} else if (vitoriasInter > vitoriasGremio) {
				System.out.println("Inter venceu mais");
			} else if (vitoriasGremio > vitoriasInter) {
				System.out.println("Gremio venceu mais");
			}

			testeGrenaisOn = false;
			break;
		} while ((testeGrenaisOn));
		entradaDados.close();
	}
}

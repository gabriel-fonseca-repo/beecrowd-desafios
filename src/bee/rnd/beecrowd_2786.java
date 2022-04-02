package bee.rnd;

import java.util.ArrayList;
import java.util.Scanner;

public class beecrowd_2786 {
	public static class aluno {
		public ArrayList<Integer> calcularLajes(int colunas, int linhas) {
			ArrayList<Integer> quantidadeLajes = new ArrayList<>();
			int qtdRealColunas = colunas + (colunas - 1);
			int somatorioLajes = 0;
			for (int i = 1; i <= qtdRealColunas; i++) {
				if (i % 2 == 0) {
					somatorioLajes += (linhas - 1);
				} else {
					somatorioLajes += linhas;
				}
			}
			int qtdMeiaLajes = ((colunas - 1) * 2) + ((linhas - 1) * 2);
			quantidadeLajes.add(somatorioLajes);
			quantidadeLajes.add(qtdMeiaLajes);
			return quantidadeLajes;
		}
	}

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		aluno aluno = new aluno();

		int linhas = entradaDados.nextInt();
		int colunas = entradaDados.nextInt();

		System.out.println(aluno.calcularLajes(colunas, linhas).get(0));
		System.out.println(aluno.calcularLajes(colunas, linhas).get(1));

		entradaDados.close();
	}
}

package bee.lista3;

import java.util.ArrayList;
import java.util.Scanner;

public class beecrowd_1117 {
	public static class avaliacao {
		private double notaResultado;

		public avaliacao(double notaResultado) {
			this.notaResultado = notaResultado;
		}

		public double getNotaResultado() {
			return notaResultado;
		}

		public void setNotaResultado(double notaResultado) {
			this.notaResultado = notaResultado;
		}
	}

	public static class aluno {
		private ArrayList<avaliacao> avaliacoes = new ArrayList<>();
		private double media;

		public double calcularMedia() {
			double somatorio = 0;
			for (avaliacao aval : this.avaliacoes) {
				somatorio += aval.getNotaResultado();
			}
			this.media = somatorio / this.avaliacoes.size();
			return this.media;
		}

		public void registrarNota(avaliacao aval) {
			if (aval.getNotaResultado() > 10 || aval.getNotaResultado() < 0) {
				IllegalArgumentException erro = new IllegalArgumentException();
				throw erro;
			} else {
				this.avaliacoes.add(aval);
			}
		}

		public ArrayList<avaliacao> getAvaliacoes() {
			return avaliacoes;
		}

		public void setAvaliacoes(ArrayList<avaliacao> avaliacoes) {
			this.avaliacoes = avaliacoes;
		}

		public double getMedia() {
			return media;
		}

		public void setMedia(double media) {
			this.media = media;
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		aluno aluno = new aluno();
		int qtdAval = 2;

		do {
			double nota = entrada.nextDouble();
			avaliacao aval = new avaliacao(nota);
			try {
				aluno.registrarNota(aval);
			} catch (IllegalArgumentException e) {
				System.out.println("nota invalida");
				qtdAval++;
			}
			qtdAval--;
		} while (qtdAval != 0);

		System.out.printf("media = %.2f\n", aluno.calcularMedia());
		entrada.close();
	}
}

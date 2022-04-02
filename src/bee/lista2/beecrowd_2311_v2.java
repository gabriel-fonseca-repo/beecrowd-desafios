package bee.lista2;

import java.util.ArrayList;
import java.util.Scanner;

public class beecrowd_2311_v2 {

	public static class Competidora {
		private ArrayList<Double> Notas1a7;
		private String nome;
		private double grauDeDificuldade;
		private double notaFinal;

		public Competidora(ArrayList<Double> notas1a7, String nome, double grauDeDificuldade) {
			/*
			 * ArrayList<Double> notas = new ArrayList<Double>(); for (int i = 0; i <
			 * notas1a7.length; i++) { notas.add(Double.parseDouble(notas1a7[i])); }
			 */
			this.Notas1a7 = notas1a7;
			this.nome = nome;
			this.grauDeDificuldade = grauDeDificuldade;
		}

		public ArrayList<Double> getNotas1a7() {
			return Notas1a7;
		}

		public void setNotas1a7(ArrayList<Double> notas1a7) {
			Notas1a7 = notas1a7;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getGrauDeDificuldade() {
			return grauDeDificuldade;
		}

		public void setGrauDeDificuldade(double grauDeDificuldade) {
			this.grauDeDificuldade = grauDeDificuldade;
		}

		public double getNotaFinal() {
			return notaFinal;
		}

		public void setNotaFinal(double notaFinal) {
			this.notaFinal = notaFinal;
		}
	}

	public static class Competicao {
		private int quantidadeCompetidoras;

		public Competicao(int quantidadeCompetidoras) {
			this.quantidadeCompetidoras = quantidadeCompetidoras;
		}

		public int getQuantidadeCompetidoras() {
			return quantidadeCompetidoras;
		}

		public void setQuantidadeCompetidoras(int quantidadeCompetidoras) {
			this.quantidadeCompetidoras = quantidadeCompetidoras;
		}

		public void GerarNota(Competidora competidora) {
			double maiorNota = 0.0;
			double menorNota = 11.0;
			double somatorioNota = 0;
			double notaFinal = 0;
			int indiceMaiorNota = 0;
			int indiceMenorNota = 0;

			for (int i = 0; i < competidora.Notas1a7.size(); i++) {
				if (competidora.Notas1a7.get(i) > maiorNota) {
					maiorNota = competidora.Notas1a7.get(i);
					indiceMaiorNota = i;
				}
				if (competidora.Notas1a7.get(i) < menorNota) {
					menorNota = competidora.Notas1a7.get(i);
					indiceMenorNota = i;
				}
			}
			for (int i = 0; i < competidora.Notas1a7.size(); i++) {
				if (i == indiceMaiorNota || i == indiceMenorNota) {
					somatorioNota += 0.0;
				} else {
					somatorioNota += competidora.Notas1a7.get(i);
				}
			}
			notaFinal = somatorioNota * competidora.grauDeDificuldade;
			competidora.notaFinal = notaFinal;
		}
	}

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);

		int qtdComp = entradaDados.nextInt();
		Competicao competicao = new Competicao(qtdComp);

		for (int i = 0; i < competicao.getQuantidadeCompetidoras(); i++) {
			String nome = entradaDados.next();
			double grauDeDificuldade = entradaDados.nextDouble();
			ArrayList<Double> notas1a7 = new ArrayList<Double>();
			for (int j = 0; j < 7; j++) {
				notas1a7.add(entradaDados.nextDouble());
			}
			Competidora competidora = new Competidora(notas1a7, nome, grauDeDificuldade);
			competicao.GerarNota(competidora);
			System.out.printf("%s %.2f\n", competidora.getNome(), competidora.getNotaFinal());
		}
		entradaDados.close();
	}
}

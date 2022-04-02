package bee.lista1;

import java.util.Scanner;

public class beecrowd_2311 {

	public static class competicaoSaltosOrnamentais {

		private final double[] notas1a7 = new double[7];
		private double grauDeDificuldade = 0.0;
		private double maiorNota = 0;
		private double menorNota = 11;
		private double somatorioNotas = 0;
		private int quantidadeCompetidores = 0;
		private int indiceNotas = 0;
		private int indiceNotaMaior = 0;
		private int indiceNotaMenor = 0;
		private String competidora = "";

		private void setQuantidadeCompetidores(int quantidadeCompetidores) {
			this.quantidadeCompetidores = quantidadeCompetidores;
		}

		private int getQuantidadeCompetidores() {
			return this.quantidadeCompetidores;
		}

		private void setCompetidora(String competidora) {
			this.competidora = competidora;
		}

		private void setGrauDeDificuldade(double grauDeDificuldade) {
			this.grauDeDificuldade = grauDeDificuldade;
		}

		private void setNotas1a7(double notas1a7) {
			this.notas1a7[this.indiceNotas] = notas1a7;
			this.indiceNotas++;
			if (this.notas1a7[6] != 0.0) {
				this.indiceNotas = 0;
			}
		}

		private void calcNotaFinal() {
			for (int i = 0; i < this.notas1a7.length; i++) {
				if (this.notas1a7[i] > this.maiorNota) {
					this.maiorNota = this.notas1a7[i];
					this.indiceNotaMaior = i;
				}
				if (this.notas1a7[i] < this.menorNota) {
					this.menorNota = this.notas1a7[i];
					this.indiceNotaMenor = i;
				}
			}

			this.notas1a7[this.indiceNotaMaior] = 0.0;
			this.notas1a7[this.indiceNotaMenor] = 0.0;

			for (int i = 0; i < this.notas1a7.length; i++) {
				this.somatorioNotas += this.notas1a7[i];
				this.notas1a7[i] = 0.0;
			}

			double notaFinal = (this.somatorioNotas * this.grauDeDificuldade);
			System.out.printf("%s %.2f\n", this.competidora, notaFinal);
			this.grauDeDificuldade = 0.0;
			this.maiorNota = 0.0;
			this.menorNota = 11.0;
			this.somatorioNotas = 0.0;
			notaFinal = 0.0;
			this.indiceNotas = 0;
			this.indiceNotaMaior = 0;
			this.indiceNotaMenor = 0;
			/*
			*/
		}
	}

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		competicaoSaltosOrnamentais metodos = new competicaoSaltosOrnamentais();

		// System.out.print("Quantidade de competidoras: ");
		int qtdCompetidoras = entradaDados.nextInt();
		metodos.setQuantidadeCompetidores(qtdCompetidoras);

		for (int i = 0; i < metodos.getQuantidadeCompetidores(); i++) {
			// System.out.print("Nome da competidora: ");
			String nomeCompetidora = entradaDados.next();
			metodos.setCompetidora(nomeCompetidora);
			// System.out.print("Grau de dificuldade: ");
			double grauDeDificuldade = entradaDados.nextDouble();
			metodos.setGrauDeDificuldade(grauDeDificuldade);
			// System.out.println("Notas: ");
			for (int j = 0; j < metodos.notas1a7.length; j++) {
				double notas = entradaDados.nextDouble();
				metodos.setNotas1a7(notas);
			}
			metodos.calcNotaFinal();
		}
		entradaDados.close();
	}
}

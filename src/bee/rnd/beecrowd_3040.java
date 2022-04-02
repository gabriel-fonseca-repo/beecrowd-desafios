package bee.rnd;

import java.util.Scanner;

public class beecrowd_3040 {

	public static class Arvore {

		private int altura;
		private int diametro;
		private int galhos;

		public Arvore(int altura, int diametro, int galhos) {
			this.altura = altura;
			this.diametro = diametro;
			this.galhos = galhos;
		}

		public int getAltura() {
			return altura;
		}

		public int getDiametro() {
			return diametro;
		}

		public int getGalhos() {
			return galhos;
		}

		public void setAltura(int altura) {
			this.altura = altura;
		}

		public void setDiametro(int diametro) {
			this.diametro = diametro;
		}

		public void setGalhos(int galhos) {
			this.galhos = galhos;
		}

	}

	public static class Julgador {

		boolean SimOuNao;
		private int qtdTestes;

		public void julgarArvore(Arvore arvore) {
			if (arvore.getAltura() >= 200 && arvore.getAltura() <= 300) {
				this.SimOuNao = true;
			} else {
				this.SimOuNao = false;
				return;
			}
			if (arvore.getDiametro() >= 50) {
				this.SimOuNao = true;
			} else {
				this.SimOuNao = false;
				return;
			}
			if (arvore.getGalhos() >= 150) {
				this.SimOuNao = true;
			} else {
				this.SimOuNao = false;
			}
		}

		public boolean isSimOuNao() {
			return this.SimOuNao;
		}

		public int getQtdTestes() {
			return qtdTestes;
		}

		public void setSimOuNao(boolean simOuNao) {
			SimOuNao = simOuNao;
		}

		public void setQtdTestes(int qtdTestes) {
			this.qtdTestes = qtdTestes;
		}

	}

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);

		Julgador roberto = new Julgador();
		roberto.setQtdTestes(entradaDados.nextInt());

		for (int i = 0; i < roberto.getQtdTestes(); i++) {
			Arvore arvore = new Arvore(entradaDados.nextInt(), entradaDados.nextInt(), entradaDados.nextInt());
			roberto.julgarArvore(arvore);
			if (roberto.isSimOuNao()) {
				System.out.println("Sim");
			} else {
				System.out.println("Nao");
			}
		}
		entradaDados.close();
	}
}

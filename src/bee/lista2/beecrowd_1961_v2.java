package bee.lista2;

import java.util.ArrayList;
import java.util.Scanner;

public class beecrowd_1961_v2 {

	public static class Sapo {

		private int tamanhoPulo;

		public Sapo(int tamanhoPulo) {
			this.tamanhoPulo = tamanhoPulo;
		}

		public int getTamanhoPulo() {
			return tamanhoPulo;
		}

		public void setTamanhoPulo(int tamanhoPulo) {
			this.tamanhoPulo = tamanhoPulo;
		}

	}

	public static class Nivel {

		private int quantidadeCanos;
		private Sapo sapo;
		private ArrayList<Integer> alturasCanos;
		private boolean win;

		public Nivel(int quantidadeCanos, ArrayList<Integer> alturasCanos, Sapo sapo) {
			this.quantidadeCanos = quantidadeCanos;
			this.alturasCanos = alturasCanos;
			this.sapo = sapo;
		}

		public void JogarNivel() {

			int canoAtual = alturasCanos.get(0);

			for (int i = 1; i < this.quantidadeCanos; i++) {

				int diferencaAlturas = Math.abs(canoAtual - alturasCanos.get(i));

				if (this.sapo.tamanhoPulo < diferencaAlturas) {
					this.win = false;
					break;
				} else {
					this.win = true;
				}

				canoAtual = alturasCanos.get(i);

			}
		}

		public boolean isWin() {
			return win;
		}

		public int getQuantidadeCanos() {
			return quantidadeCanos;
		}

		public void setQuantidadeCanos(int quantidadeCanos) {
			this.quantidadeCanos = quantidadeCanos;
		}

		public Sapo getSapo() {
			return sapo;
		}

		public void setSapo(Sapo sapo) {
			this.sapo = sapo;
		}

		public ArrayList<Integer> getAlturasCanos() {
			return alturasCanos;
		}

		public void setAlturasCanos(ArrayList<Integer> alturasCanos) {
			this.alturasCanos = alturasCanos;
		}

		public void setWin(boolean win) {
			this.win = win;
		}
	}

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);

		int tamanhoPulo = entradaDados.nextInt();
		int quantidadeCanos = entradaDados.nextInt();

		entradaDados.nextLine();

		String[] alturasCanos = entradaDados.nextLine().split(" ");

		ArrayList<Integer> canos = new ArrayList<Integer>();
		for (String alturasCano : alturasCanos) {
			canos.add(Integer.parseInt(alturasCano));
		}

		Sapo sapo = new Sapo(tamanhoPulo);
		Nivel nivel = new Nivel(quantidadeCanos, canos, sapo);

		nivel.JogarNivel();

		if (nivel.isWin()) {
			System.out.println("YOU WIN");
		} else if (!nivel.isWin()) {
			System.out.println("GAME OVER");
		}
		entradaDados.close();
	}
}

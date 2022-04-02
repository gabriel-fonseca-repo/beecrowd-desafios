package bee.rnd;

import java.util.Scanner;

public class beecrowd_1574 {

	public static class robo {
		private int posicao = 0;

		public int getPosicao() {
			return posicao;
		}

		public void setPosicao(int movimento) {
			this.posicao = movimento;
		}

	}

	public static class instrucoes {

		private int qtdInstrucoes;
		private String[] historico;
		private String[] inputSplit;
		int indice;

		public String[] getHistorico() {
			return historico;
		}

		public String[] getInputSplit() {
			return inputSplit;
		}

		public int getIndice() {
			return indice;
		}

		public void setHistorico(String[] historico) {
			this.historico = historico;
		}

		public void setInputSplit(String[] inputSplit) {
			this.inputSplit = inputSplit;
		}

		public void setIndice(int indice) {
			this.indice = indice;
		}

		public void setQtdInstrucoes(int qtdInstrucoes) {
			this.qtdInstrucoes = qtdInstrucoes;
			this.historico = new String[qtdInstrucoes];
		}

		public int getQtdInstrucoes() {
			return qtdInstrucoes;
		}

		public void processarDados(robo robo, String input) {

			this.inputSplit = input.split(" ");

			if (this.inputSplit[0].equals("LEFT")) {
				left(robo);
				this.historico[this.indice] = input;
				this.indice++;
			} else if (this.inputSplit[0].equals("RIGHT")) {
				right(robo);
				this.historico[this.indice] = input;
				this.indice++;
			} else if (this.inputSplit[0].equals("SAME")) {
				int indiceSame = Integer.parseInt(this.inputSplit[2]);
				indiceSame--;
				sameAs(robo, indiceSame);
				this.historico[this.indice] = input;
				this.indice++;
			}

		}

		public void left(robo robo) {
			int movimento = robo.getPosicao();
			movimento--;
			robo.setPosicao(movimento);
		}

		public void right(robo robo) {
			int movimento = robo.getPosicao();
			movimento++;
			robo.setPosicao(movimento);
		}

		public void sameAs(robo robo, int indiceSame) {

			if (this.historico[indiceSame].equals("LEFT")) {
				left(robo);
			} else if (this.historico[indiceSame].equals("RIGHT")) {
				right(robo);
			} else {
				String[] aux = this.historico[indiceSame].split(" ");
				int inteiro = Integer.parseInt(aux[2]);
				inteiro--;
				sameAs(robo, inteiro);
			}
		}
	}

	public static void main(String[] args) {

		Scanner entradaDados = new Scanner(System.in);
		int loop = Integer.parseInt(entradaDados.nextLine());

		for (int i = 0; i < loop; i++) {
			robo robo = new robo();
			instrucoes inst = new instrucoes();

			int qtdInst = Integer.parseInt(entradaDados.nextLine());
			inst.setQtdInstrucoes(qtdInst);

			for (int j = 0; j < inst.getQtdInstrucoes(); j++) {
				String input = entradaDados.nextLine();
				inst.processarDados(robo, input);
			}

			System.out.println(robo.getPosicao());

		}
		entradaDados.close();
	}
}

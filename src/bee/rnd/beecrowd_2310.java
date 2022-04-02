package bee.rnd;

import java.util.ArrayList;
import java.util.Scanner;

public class beecrowd_2310 {

	public static class jogador {
		private String nomeJogador;
		private ArrayList<Integer> acertos = new ArrayList<Integer>();
		private ArrayList<Integer> tentativas = new ArrayList<Integer>();

		public jogador(String[] tentativas, String[] acertos, String nomeJogador) {
			this.nomeJogador = nomeJogador;
			this.acertos.add(0, Integer.parseInt(acertos[0]));
			this.acertos.add(1, Integer.parseInt(acertos[1]));
			this.acertos.add(2, Integer.parseInt(acertos[2]));
			this.tentativas.add(0, Integer.parseInt(tentativas[0]));
			this.tentativas.add(1, Integer.parseInt(tentativas[1]));
			this.tentativas.add(2, Integer.parseInt(tentativas[2]));
		}

		public String getNomeJogador() {
			return nomeJogador;
		}

		public void setNomeJogador(String nomeJogador) {
			this.nomeJogador = nomeJogador;
		}

		public ArrayList<Integer> getAcertos() {
			return acertos;
		}

		public void setAcertos(ArrayList<Integer> acertos) {
			this.acertos = acertos;
		}

		public ArrayList<Integer> getTentativas() {
			return tentativas;
		}

		public void setTentativas(ArrayList<Integer> tentativas) {
			this.tentativas = tentativas;
		}

	}

	public static class partidaVolley {
		private ArrayList<jogador> jogadores;
		private ArrayList<Integer> qtdTotalAcertos = new ArrayList<Integer>();
		private ArrayList<Integer> qtdTotalTentativas = new ArrayList<Integer>();
		private int nJogadores;

		public partidaVolley(ArrayList<jogador> jogadores, int nJogadores) {
			this.jogadores = jogadores;
			this.nJogadores = nJogadores;
		}

		public double[] gerarDadosPartida() {
			int[] somatorioTent = new int[3];
			int[] somatorioAcer = new int[3];

			for (int i = 0; i < somatorioAcer.length; i++) {
				somatorioTent[i] = 0;
				somatorioAcer[i] = 0;
			}

			for (jogador jogadore : this.jogadores) {
				somatorioTent[0] += jogadore.getTentativas().get(0);
				somatorioTent[1] += jogadore.getTentativas().get(1);
				somatorioTent[2] += jogadore.getTentativas().get(2);
				somatorioAcer[0] += jogadore.getAcertos().get(0);
				somatorioAcer[1] += jogadore.getAcertos().get(1);
				somatorioAcer[2] += jogadore.getAcertos().get(2);
			}

			this.qtdTotalTentativas.add(0, somatorioTent[0]);
			this.qtdTotalTentativas.add(1, somatorioTent[1]);
			this.qtdTotalTentativas.add(2, somatorioTent[2]);

			this.qtdTotalAcertos.add(0, somatorioAcer[0]);
			this.qtdTotalAcertos.add(1, somatorioAcer[1]);
			this.qtdTotalAcertos.add(2, somatorioAcer[2]);

			double[] TotalAcertos = new double[3];

			TotalAcertos[0] = (double) ((qtdTotalAcertos.get(0) * 100.00) / this.qtdTotalTentativas.get(0));
			TotalAcertos[1] = (double) ((qtdTotalAcertos.get(1) * 100.00) / this.qtdTotalTentativas.get(1));
			TotalAcertos[2] = (double) ((qtdTotalAcertos.get(2) * 100.00) / this.qtdTotalTentativas.get(2));

			return TotalAcertos;

		}

		public ArrayList<jogador> getJogadores() {
			return jogadores;
		}

		public void setJogadores(ArrayList<jogador> jogadores) {
			this.jogadores = jogadores;
		}

		public ArrayList<Integer> getQtdTotalAcertos() {
			return qtdTotalAcertos;
		}

		public void setQtdTotalAcertos(ArrayList<Integer> qtdTotalAcertos) {
			this.qtdTotalAcertos = qtdTotalAcertos;
		}

		public ArrayList<Integer> getQtdTotalTentativas() {
			return qtdTotalTentativas;
		}

		public void setQtdTotalTentativas(ArrayList<Integer> qtdTotalTentativas) {
			this.qtdTotalTentativas = qtdTotalTentativas;
		}

		public int getnJogadores() {
			return nJogadores;
		}

		public void setnJogadores(int nJogadores) {
			this.nJogadores = nJogadores;
		}
	}

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);

		int nJogadores = Integer.parseInt(entradaDados.nextLine());
		ArrayList<jogador> jogadores = new ArrayList<jogador>();

		for (int i = 0; i < nJogadores; i++) {
			String nomeJogador = entradaDados.nextLine();
			String[] tentativas = entradaDados.nextLine().split(" ");
			String[] acertos = entradaDados.nextLine().split(" ");

			jogador jogador = new jogador(tentativas, acertos, nomeJogador);
			jogadores.add(jogador);
		}
		partidaVolley partida = new partidaVolley(jogadores, nJogadores);
		double[] TotalAcertos = partida.gerarDadosPartida();

		System.out.printf("Pontos de Saque: %.2f %%.\n", TotalAcertos[0]);
		System.out.printf("Pontos de Bloqueio: %.2f %%.\n", TotalAcertos[1]);
		System.out.printf("Pontos de Ataque: %.2f %%.\n", TotalAcertos[2]);

		entradaDados.close();
	}
}

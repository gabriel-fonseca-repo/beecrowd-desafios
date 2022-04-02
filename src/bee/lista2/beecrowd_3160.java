package bee.lista2;

import java.util.ArrayList;
import java.util.Scanner;

public class beecrowd_3160 {

	public static class ListaAmigos {
		ArrayList<String> ListaAtual = new ArrayList<String>();
		ArrayList<String> ListaRecomendacoes = new ArrayList<String>();
		String ultimoParametro;

		public ListaAmigos(String[] listaAtual, String[] listaRecomendacoes, String ultimoParametro) {
			for (int i = 0; i < listaAtual.length; i++) {
				this.ListaAtual.add(listaAtual[i]);
			}
			for (int i = 0; i < listaRecomendacoes.length; i++) {
				this.ListaRecomendacoes.add(listaRecomendacoes[i]);
			}
			this.ultimoParametro = ultimoParametro;
		}

		public boolean checarParametro() {
			if (this.ultimoParametro.equals("nao")) {
				return true;
			} else {
				return false;
			}
		}

		public String gerarLista() {

			ArrayList<String> ListaCompletaArray = new ArrayList<String>();
			String ListaCompleta = "";

			if (checarParametro()) {
				ListaCompletaArray.addAll(this.ListaAtual);
				ListaCompletaArray.addAll(this.ListaRecomendacoes);
			} else if (!checarParametro()) {
				ListaCompletaArray.addAll(this.ListaAtual);
				int indiceParametro = ListaCompletaArray.indexOf(this.ultimoParametro);
				ListaCompletaArray.addAll(indiceParametro, this.ListaRecomendacoes);
			}
			for (String s : ListaCompletaArray) {
				if (s.equals(ListaCompletaArray.get(ListaCompletaArray.size() - 1))) {
					ListaCompleta += s;
				} else {
					ListaCompleta += s + " ";
				}
			}
			return ListaCompleta;
		}

		public ArrayList<String> getListaAtual() {
			return ListaAtual;
		}

		public void setListaAtual(ArrayList<String> listaAtual) {
			ListaAtual = listaAtual;
		}

		public ArrayList<String> getListaRecomendacoes() {
			return ListaRecomendacoes;
		}

		public void setListaRecomendacoes(ArrayList<String> listaRecomendacoes) {
			ListaRecomendacoes = listaRecomendacoes;
		}

		public String getUltimoParametro() {
			return ultimoParametro;
		}

		public void setUltimoParametro(String ultimoParametro) {
			this.ultimoParametro = ultimoParametro;
		}
	}

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);

		String[] linha1 = entradaDados.nextLine().split(" ");
		String[] linha2 = entradaDados.nextLine().split(" ");
		String linha3 = entradaDados.next();

		ListaAmigos listaAmigos = new ListaAmigos(linha1, linha2, linha3);

		System.out.println(listaAmigos.gerarLista());

		entradaDados.close();
	}
}
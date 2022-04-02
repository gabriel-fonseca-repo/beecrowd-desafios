package bee.rnd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class beecrowd_1766 {

	public static class rena {
		private String nome;
		private int peso;
		private int idade;
		private double altura;

		public rena(String[] infoRena) {
			this.nome = infoRena[0];
			this.peso = Integer.parseInt(infoRena[1]);
			this.idade = Integer.parseInt(infoRena[2]);
			this.altura = Double.parseDouble(infoRena[3]);
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getPeso() {
			return peso;
		}

		public void setPeso(int peso) {
			this.peso = peso;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public double getAltura() {
			return altura;
		}

		public void setAltura(double altura) {
			this.altura = altura;
		}

	}

	public static class treno {
		ArrayList<rena> listaRenas;
		int nRenasTreno;
		int nRenasTotal;

		public treno(ArrayList<rena> listaRenas, int nRenasTreno, int nRenasTotal) {
			this.listaRenas = listaRenas;
			this.nRenasTreno = nRenasTreno;
			this.nRenasTotal = nRenasTotal;
		}

		public void ordenarLista() {
			Collections.sort(this.listaRenas, new ComparaRena());
		}

		public rena getItemLista(int index) {
			return this.listaRenas.get(index);
		}

		public int getnRenasTreno() {
			return nRenasTreno;
		}

		public ArrayList<rena> getListaRenas() {
			return listaRenas;
		}

		public void setListaRenas(ArrayList<rena> listaRenas) {
			this.listaRenas = listaRenas;
		}

		public void setnRenasTreno(int nRenasTreno) {
			this.nRenasTreno = nRenasTreno;
		}

		public int getnRenasTotal() {
			return nRenasTotal;
		}

		public void setnRenasTotal(int nRenasTotal) {
			this.nRenasTotal = nRenasTotal;
		}
	}

	public static class ComparaRena implements Comparator<rena> {
		@Override
		public int compare(rena c1, rena c2) {
			if (c1.getPeso() < (c2.getPeso())) {
				return 1;
			} else if (c1.getPeso() > c2.getPeso()) {
				return -1;
			} else {
				if (c1.getIdade() > c2.getIdade()) {
					return 1;
				} else if (c1.getIdade() < c2.getIdade()) {
					return -1;
				} else {
					if (c1.getAltura() > c2.getAltura()) {
						return 1;
					} else if (c1.getAltura() < c2.getAltura()) {
						return -1;
					} else {
						if (c1.getNome().compareTo(c2.getNome()) < 0) {
							return -1;
						} else if (c1.getNome().compareTo(c2.getNome()) > 0) {
							return 1;
						} else {
							return 0;
						}
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		int nTestes = Integer.parseInt(entradaDados.nextLine());

		for (int i = 0; i < nTestes; i++) {
			ArrayList<rena> listaRenas = new ArrayList<>();
			String[] renas = entradaDados.nextLine().split(" ");
			int nRenas = Integer.parseInt(renas[0]);
			int nRenasTreno = Integer.parseInt(renas[1]);

			for (int j = 0; j < nRenas; j++) {
				String[] infoRena = entradaDados.nextLine().split(" ");
				rena rena = new rena(infoRena);
				listaRenas.add(rena);
			}

			treno treno = new treno(listaRenas, nRenasTreno, nRenas);
			treno.ordenarLista();
			System.out.println("CENARIO {" + (i + 1) + "}");
			for (int j = 1; j <= treno.getnRenasTreno(); j++) {
				System.out.println(j + " - " + treno.getItemLista(j - 1).getNome());
			}
		}
		entradaDados.close();
	}
}

/*
 * for (int i = 0; i < listaRenas.size(); i++) {
 * System.out.println(listaRenas.get(i).getNome() + " " +
 * listaRenas.get(i).getPeso() + " " + listaRenas.get(i).getIdade() + " " +
 * listaRenas.get(i).getAltura()); }
 */
